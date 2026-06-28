public class Fibonacci {
    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        int finN1 = fib(n-1);
        int finN2 = fib(n-2);
        int ans = finN1+finN2;
        return ans;
    }
    public static void main(String[] args) {
        // int n=5;
        System.out.println(fib(0));
        System.out.println(fib(1));
        System.out.println(fib(2));
        System.out.println(fib(3));
        System.out.println(fib(4));
        System.out.println(fib(5));
    }
}
