public class Reverse {

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
        newNode.next = head;
        if(head == null){
            head = tail = newNode;
            return;
        }
        head = newNode;
    }
    public void print(){
        Node temp  = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void reverseNode(){
        Node pre = null;
        Node curr = tail = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        head = pre;
    }
    public static void main(String[] args) {
        Reverse ll = new Reverse();
        ll.addFirst(6);
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();
        ll.reverseNode();
        ll.print();
    }
}
