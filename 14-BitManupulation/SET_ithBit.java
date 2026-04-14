// setBit means to set 1 one the ith position.

public class SET_ithBit {

    public static int setIthBit(int n, int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }
    public static void main(String[] args) {
        System.out.println(setIthBit(10, 1));
    }
}
