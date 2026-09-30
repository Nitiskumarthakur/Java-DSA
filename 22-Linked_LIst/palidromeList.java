public class palidromeList {
    
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
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;//+1
            fast = fast.next.next;//+2
        }
        return slow; //Mind find 
    }
    //find the palidromFunction
    public boolean checkPalidrome(){
        if(head == null || head.next == null){
            return true;
        }
        //step 1: To find the Mid
        Node midNode = findMid(head);
        
        //step 2: to reverse
        Node pre = null;
        Node curr = midNode;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = pre;
            pre  = curr;
            curr = next;
        }
        Node right = pre;
        Node left = head;
        //step 3: to check
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right  = right.next;
        }
        return true;
    }
    public void print(){
        Node temp  = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        palidromeList l = new palidromeList();
        l.addFirst(3);
        l.addFirst(2);
        l.addFirst(1);
        l.addFirst(1);
        l.addFirst(2);
        l.addFirst(3);
        l.print();
        System.out.println(l.checkPalidrome());
    }
}
