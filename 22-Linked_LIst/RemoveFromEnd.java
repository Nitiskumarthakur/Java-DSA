//to delet the node from last.
public class RemoveFromEnd {

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
    public void addNode(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
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

    //deleted from last end
    public void deletedFromLastIndex(int index){
        
        //Calculate the node Size.
        int size = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            size++;
        }

        int i=1;
        int iToFind = size-index;
        Node pre = head;
        while(i < iToFind){
            pre = pre.next;
            i++;
        }
        pre.next = pre.next.next;
        return;
    }
    public static void main(String[] args) {
        RemoveFromEnd ll = new RemoveFromEnd();
        ll.addNode(5);
        ll.addNode(4);
        ll.addNode(3);
        ll.addNode(2);
        ll.addNode(1);

        ll.print();
        ll.deletedFromLastIndex(3);
        ll.print();
    }
}
