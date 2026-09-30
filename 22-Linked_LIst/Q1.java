public class Q1 {
    public static class Node1{
        int data;
        Node1 next;
        public Node1(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node1 head1;
    public static Node1 tail1;
    public static int size;

    public void addLast1(int data){
        Node1 newNode = new Node1(data);
        size++;
        if(head1 == null){
            head1 = tail1 = newNode;
            return;
        }
        tail1.next = newNode;
        tail1 = newNode;
    }

    //secound Node
    public static class Node2{
        int data;
        Node2 next;
        public Node2(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node2 head2;
    public static Node2 tail2;
    public void addLast2(int data){
        Node2 newNode = new Node2(data);
        size++;
        if(head2 == null){
            head2 = tail2 = newNode;
            return;
        }
        tail2.next = newNode;
        tail2=newNode;
    }
    
    public void print(){
        Node1 temp = head1;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println();
        Node2  temp2 = head2;
        while(temp2 != null){
            System.out.print(temp2.data+"->");
            temp2 = temp2.next;
        }
        System.out.println();
    }

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

    public static void addNode(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public void ansPrint(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void OneNode(){
        Node1 temp1 = head1;
        Node2 temp2 = head2;
        while(temp1 != null && temp2 !=null){
            if(temp1.data < temp2.data){
                addNode(temp1.data);
                temp1 = temp1.next;
            }else{
               addNode(temp2.data);
               temp2 = temp2.next;
            }
        }
        while(temp1 != null){
           addNode(temp1.data);
            temp1 = temp1.next;
        }
        while (temp2 != null) {
            addNode(temp2.data);
            temp2 = temp2.next;
        }
    }
    public static void main(String[] args) {
        Q1 l = new Q1();
        l.addLast1(1);
        l.addLast1(2);
        l.addLast1(4);
        l.addLast1(7);
        
        l.addLast2(3);
        l.addLast2(5);
        l.print();
        l.OneNode();
        l.ansPrint();
    }
}
