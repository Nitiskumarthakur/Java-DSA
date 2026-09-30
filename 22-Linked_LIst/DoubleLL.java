public class DoubleLL {

    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    //Addition first.
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    //Remove first
    public void removeFirst(){

        if(size == 0){
            System.out.println("Doubly LL is Empty!");
            return;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size =0;
            System.out.println("value was deleted "+val);
            return;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        System.out.println("value was deleted "+val);
    }

    //Add last
    public void addLast(int data){
        Node newNode  = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }
    //remove last
    public void removeLast(){
        if(size == 0){
           
            System.out.println("Double LL empty");
            return;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size =0;
            System.out.println("value was deleted "+val);
            return;
        }
        int val = tail.data;
        tail = tail.prev;
        tail.next = null;
        System.out.println("value was deleted "+val);
    }
    public void print(){
        Node temp = head;
        System.out.print("null<-"); 
        while(temp != null){
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }
 
    public static void main(String[] args) {
        DoubleLL ll = new DoubleLL();
        // ll.addFirst(4);
        // ll.addFirst(3);
        // ll.addFirst(2);
        // ll.addFirst(1);
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.print();
        ll.removeLast();
        ll.print();
        // ll.removeFirst();
        // ll.print();
    }
    
}