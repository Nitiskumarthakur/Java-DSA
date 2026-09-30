public class checkCycle {

    public static class Node {
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
            head = tail =  null;
            return;
        }

        newNode.next = head;
        head = newNode;
    }
    public void print(){
        Node temp = head;
        while(temp != head){
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println("null");
    }

    //Check is Cyclic
    public static boolean isCycle(){ //floyd`s Algorithm.
        Node slow = head;
        Node fast = head;
        while(fast !=null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true; //Cyclic exits.
            }
        }
        return false;//cyclic do`not exits.
    }

    //Remove cycle
    public static void removeCycle(){
        Node slow = head;
        Node fast = head;
        boolean isCycle = false;
        while(fast !=null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                isCycle = true;
                break;
            }
        }
        if(!isCycle){
            return;
        }
        //find meeting point.
        slow = head;
        Node prev = null;
        while(slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        //remove Cyclic.
        prev.next = null;

    }
    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head;

        System.out.println(isCycle());
    }
}
