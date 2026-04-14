public class Clear_RangeInBits {

    public static int clearRenge(int n, int i, int j) {
        int  a = ~0<<(j+1);
        int  b = (1<<i)-1;  
         
        int BitMask =  a | b;
        return  n & BitMask; 
         
    }

    public static void main(String[] args) {
       System.out.println(clearRenge( 10, 2, 4));
    }
}
