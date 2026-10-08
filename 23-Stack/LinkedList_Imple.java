public class LinkedList_Imple {
    
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class stack{
        public static Node head = null;
        public static int size;
        
        public static boolean isEmpty(){
            return head==null;
        }
        public static void push(int data){
            Node newNode = new Node(data);
            size++; 
            if(head == null){
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
        }

        //to pop
        public static int pop(){
            int data = head.data;
            head = head.next;
            return data;
        }
        public static  int peek(){
            int data = head.data;
            return data;
        }
    }

    public static void main(String[] args) {
        //stack s = new stack();
        // s.push(1);
        // s.push(2);
        // s.push(3);
        // s.push(4);
        // System.out.println("Size: "+s.size);
        // while (!s.isEmpty()) {
        //     System.out.println(s.peek());
        //     s.pop();
        // }
    }
}
