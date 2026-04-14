public class updata_ithbit {

    public static int setith(int n, int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }
    public static int clearith(int n, int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }

    public static  int upDateIthBit(int n, int i, int newBit){ //newBit means update the value 0 or 1 form.
        // if(newBit == 0){
        //     return clearith(n, i);
        // }else{
        //     return setith(n, i);
        // }
        
        n = clearith(n, i);
        int bitMask = newBit<<i;
        return n | bitMask;
    }   
    public static void main(String[] args) {
        System.out.println(upDateIthBit(10, 02, 1));
    }
}
