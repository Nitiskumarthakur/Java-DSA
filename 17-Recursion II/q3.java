//Write a program to find Length of a String using Recursion.
public class q3 {

    public static int findLength(String str,int idx){
       
        if(idx == str.length()){
            return idx;
        }
        return findLength(str, idx+1);
    }
    public static void main(String[] args){
        String str = "nitish";
        int idx =0;
        System.out.println(findLength(str, idx));
    }
}
