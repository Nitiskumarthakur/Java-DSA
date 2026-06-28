public class BinarySearch {

    public static String binary(int n, int lastIdx, String str ){
         
        //Base case
        if(n==0){
            return str;
        }
        //kam
        String newString = binary(n-1, 0, str+"0");
        if(lastIdx==0){
           newString= binary(n-1, 1, str+"1");
        }
        return newString;
    }
    public static void main(String[] args) {
        int n=3;
        String str="";
        System.out.println(binary(n, 0, str));
    }
}
