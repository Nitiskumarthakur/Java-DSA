import java.util.ArrayList;
public class Operations {
    public static void main(String[] args) {
        
        ArrayList <Integer> list = new ArrayList<>();
       
        //To Add Element using the add Method.
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        
        //System.out.println(list);

        //Get Method.
        // int elem = list.get(2);
        // System.out.println(elem);

        //Remove Method
        // list.remove(5);
        // System.out.println(list);

        //Set Method
        // list.set(5,6);
        // System.out.println(list);

        //Contains Element
        System.out.println(list.contains(1)); //true
        System.out.println(list.contains(7)); //false
        

    }
}
