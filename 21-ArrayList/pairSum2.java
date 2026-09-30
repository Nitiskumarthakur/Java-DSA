import java.util.ArrayList;

public class pairSum2 {
    
    public static boolean sum2(ArrayList <Integer> list, int target){
        
        int n = list.size();

        int pivetPoint = 0;
        for(int i=0;i<list.size();i++){
            if(list.get(i) > list.get(i+1)){
                pivetPoint = i;
                break;
            }
        }

        int left = pivetPoint+1;
        int right = pivetPoint;

        while(left != right){
           
            //case 1
            if(list.get(left) + list.get(right) == target){
               return true;
            }

            //case 2
            if( list.get(left) + list.get(right) < target){
               left = (left + 1) % n;
            }else{
               right = (n+right-1) % n;
            }

        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(11);
        list.add(10);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 16;
        
        System.out.println(sum2(list, target));
    }
}
