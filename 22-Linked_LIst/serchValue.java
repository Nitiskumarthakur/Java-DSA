public class serchValue {
    
    public class Node{
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
            head = tail =   null;
        }
        newNode.next = head;
        head = newNode;
    }

    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    
    public void serch(int value){
        Node temp =head;
        int idx =0;
        while(temp != null){
            idx++;
            if(temp.data == value){
                System.out.println("Vlaue Match "+"Index: "+idx);
            }
            temp = temp.next;
        }
    }
    
    //Recursion Serch 
    public int recSerch(Node head, int key){
        
        //Base case
        if(head.next == null){
            return -1; 
        }
        //kam
        if(head.data == key){
            return 0;
        }
        int idx = recSerch(head.next, key);
        //Backtracking..
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }
    public static void main(String[] args) {
        serchValue ll = new serchValue();
        ll.addFirst(9);
        ll.addFirst(8);
        ll.addFirst(7);
        ll.addFirst(6);
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(1);
        ll.print();
        //ll.serch(5);
        int idx = ll.recSerch(head, 4);
        System.out.print("idx: "+idx);
    }
}
