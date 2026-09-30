public class createLinkeList {
    
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    //Here Head is node Type. 
    static Node head;
    static Node tail;
    static int size;

    //Addfirst value in Node,
    public void addFirst(int data){

        //Step1 - create new node.
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        //Step2 - newNode next to point new Head.
        newNode.next = head; 

        //step3 - head = newNode
        head = newNode;
    }

    //Add value in last.
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }

    //Add value on the Index.
    public void addIdx(int idx, int data){
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode  = new Node(data);
        size++;
        Node temp = head;
        int i=0;
        while(i < idx-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    //Remove First value
    public int removeFirst(){
       
       if(size == 0){
          System.out.println("LL is empty.");
          return Integer.MIN_VALUE;
       }else if(size == 1){
          int val = head.data;
          head  = tail = null;
          size = 0;
          return val;
       }
       int val = head.data;
       head = head.next;
       size--;
       return val;
    }
    
    //Remove last value
    public int removeLast(){
        if(size == 0){
            System.out.println("LL is empty.");
            return Integer.MIN_VALUE;
        }else if(size ==1){
            int value = head.data;
            head = tail = null;
            size = 0;
            return value;
        }
        
        Node prev = head;
        for(int i=0;i<size-2;i++){
            prev = prev.next;
        }
        int value = prev.next.data;
        prev.next= null;
        tail = prev;
        size--;
        return value;
        
    }
    //Print LinkedList
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+ "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        createLinkeList  newList = new createLinkeList();
        newList.addFirst(1);
        newList.addFirst(2);
        newList.addLast(3);
        newList.addLast(4);
        newList.addIdx(2, 9);
        newList.print();
        newList.removeFirst();
        newList.print();
        newList.removeLast();
        newList.print();
        System.out.println("Size: "+size);
    }
}
