//Check  the odd or even;
public class Q1 {
    
    // public static void eventOrodd(int n){
    //     if((n%2)==0){
    //         System.out.println("Number is Even");
    //     }else{
    //         System.out.println("Number is Odd");
    //     }
    // }


    public static void eventOrodd(int n){
        int bitMask = 1;
        if((n & bitMask)==0){
            System.out.println("Number is Even");
        }else{
            System.out.println("Number is Odd");
        }
    }
    public static void main(String[] args) {
        eventOrodd(9);
    }
}
