//find the next Greater.

import java.util.Stack;

public class Q5 {
    

    public static void nextGreater(int arr[] , int nextG[]){
        Stack<Integer> s = new Stack<>();
       
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && s.peek() <= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextG[i] = -1;
            }else{
                nextG[i] = s.peek();
            }
            s.push(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] = {6,8,0,1,3};
        int nextGreaterElment[] = new int[arr.length];
        nextGreater(arr,nextGreaterElment);

        for(int i=0;i<nextGreaterElment.length;i++){
            System.out.print(nextGreaterElment[i]+" ");
        }
    }
}
