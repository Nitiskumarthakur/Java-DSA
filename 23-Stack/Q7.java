//Max Area Histogram.

import java.util.Stack;

public class Q7 {

    public static void maxRectangle(int arr[]){
        int nsL[] =  new int[arr.length];
        int nsR[] = new int[arr.length];
        int maxArea = 0;
        
        Stack<Integer> s = new Stack<>();
        
        //Find the next small Right.
        for(int i=arr.length-1;i>=0;i--){
           
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.empty()){
                nsR[i] = arr.length;
            }else{
                nsR[i] = s.peek();
            }
            s.push(i);
        }
      
        //find the next small Left.
        s = new Stack<>();
        
        for(int i=0;i<arr.length;i++){

            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsL[i] = -1;
            }else{
                nsL[i] = s.peek();
            }
            s.push(i);
        }

        for(int i=0;i<arr.length;i++){
            int height = arr[i];
            int width = nsR[i]-nsL[i]-1;
            int currArea = height*width;
            maxArea = Math.max(currArea,maxArea);
        }

        System.out.println("Max Area = "+maxArea);
    }
    public static void main(String[] args) {
        int arr[] = {2,1,5,6,2,3};
        maxRectangle(arr);
    }
}
