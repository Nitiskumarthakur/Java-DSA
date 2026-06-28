public class Power {

    public static int Power(int x, int n){
        if(n == 0){
            return 1;
        }
        return x = x*Power(x, n-1);
    }
    //otimied Solution O(logn).

    public static int otPower(int x, int n){
        if(n==0){
            return 1;
        }
        int halfpower = otPower(x, n/2);
        halfpower = halfpower*halfpower;
        if(n%2 != 0){
            halfpower = halfpower * x;
        }
        return halfpower;
    }
    public static void main(String[] args) {
        int x = 2;
        int n=5;
        System.out.println(otPower(x, n));
    }
}
