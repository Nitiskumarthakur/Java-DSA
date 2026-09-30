public class MergeSortLL {

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = null;
            return;
        }

        newNode.next = head;
        head = newNode;
    }
    
    //find mid
    public Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;//here Mid.
    }
    public  Node mergeSort(Node head){

        //BaseCase 
        if(head == null || head.next == null){
            return head;
        }
        //find mid 
        Node mid = getMid(head);
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        return merge(newLeft, newRight);
    }
    public Node merge(Node Left, Node Right){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while(Left != null && Right != null){
            if(Left.data <= Right.data){
                temp.next = Left;
                Left = Left.next;
                temp = temp.next;
            }else{
                temp.next =Right;
                Right = Right.next;
                temp = temp.next;
            }
        }
        while(Left != null){
            temp.next = Left;
            Left = Left.next;
            temp = temp.next;
        }
        while(Right != null){
            temp.next = Right;
            Right = Right.next;
            temp =temp.next;
        }
        return mergedLL.next;
    }
    public static void main(String[] args) {
        
    }
}
