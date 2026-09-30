import java.util.ArrayList;

public class Q1ContainWater {

    public static int waterValue(ArrayList <Integer> height){

        int maxWater = 0;
        
        //Brute-Force O(n^2)
        // for(int i=0;i<height.size();i++){
        //     for(int j=i+1;j<height.size();j++){
        //         int minHeight = Math.min(height.get(i), height.get(j));
        //         int width = j-i;
        //         int currWater = minHeight * width ;
        //         maxWater = Math.max(maxWater, currWater);
        //     }
        // }

        //to solve the Using the two Pointer.
        // timeComplexity - O(n)
        int left = 0;
        int right = height.size()-1;

        while (left < right){
            int minHeight = Math.min(height.get(left), height.get(right));
            int width = right-left;
            int currWater = minHeight * width ;
            maxWater = Math.max(maxWater, currWater);
            //when height small then subtract.
            if(left < right){
                left++;
            }else{
                right--;
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList <Integer> height = new ArrayList<>();

        height.add(1);
        height.add(8);
        height.add(7);
        height.add(2);
        height.add(5);
        height.add(5);
        height.add(8);
        height.add(3);
        height.add(7);

        int waterValue = waterValue(height);
        System.out.println("Water_Value: "+waterValue);
    }
}
