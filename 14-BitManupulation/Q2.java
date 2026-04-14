// check if the a number is a power of 2 or Not;

public class Q2 {

    public static void isPowerOfTwo(int n){
        if((n & n-1) == 0){
           System.out.println(n+" is the Power of Two");
        }else{
            System.out.println(n + " Not a power");
        }
    }
    public static void main(String[] args) {
        isPowerOfTwo(16);
    }
}
