public class CLearLast_IthBit {

    public static int clearLast(int n, int i){
        int BitMask = (-1)<<i;
        return n & BitMask;
    }
    public static void main(String[] args) {
        System.out.println(clearLast(15, 02));
    }
}
