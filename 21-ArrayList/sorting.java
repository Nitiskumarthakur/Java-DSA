import java.util.ArrayList;
import java.util.Collections;

public class sorting {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();

        list.add(6);
        list.add(2);
        list.add(5);
        list.add(3);
        list.add(1);
        list.add(4);

        System.out.println("Unsorted List: "+list);

        Collections.sort(list);
        
        System.out.println("Sorted List: "+list);

        Collections.sort(list, Collections.reverseOrder());
        // Collections.reverseOrder() - Comparator Login in reverse.

        System.out.println("Reverse Sorted List: "+list);

    }
}
