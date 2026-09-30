public class zig_zag {
    public static class Node {
        int data;
        Node next;
        public  Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public  void addLast(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail= newNode;
    }

    public  void sol_zigZag(){
        //find the mid;

        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow=slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        //to remove after the Mid

        Node pre = null;
        Node curr = mid.next;
        mid.next = null;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        Node left = head;
        Node right = pre;
        Node nextL , nextR;
        //Alternative merging
        while(left !=null && right !=null){
            nextL =left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;
            
            left = nextL;
            right = nextR;
        }
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
        zig_zag ll = new zig_zag();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.print();
        ll.sol_zigZag();
        ll.print();
        
        
    }
}
