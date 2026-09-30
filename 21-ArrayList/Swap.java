import java.util.ArrayList;

public class Swap {

    public static ArrayList <Integer> swapTwo(ArrayList <Integer> list, int idx1, int idx3){
        
        int temp= list.get(idx1);
        list.set(idx1, list.get(idx3));
        list.set(idx3, temp);

        return list;
    }
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int idx1 = 1, idx3 = 3;

        System.out.println(list);

        System.out.println("Updated list: "+swapTwo(list, idx1, idx3));
    }
}
