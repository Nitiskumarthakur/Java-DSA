public class DecreasingOrder {

    public static void decPrint(int n){
        if(n==1){ //Base Case.
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        decPrint(n-1);
    }
    public static void main(String[] args) {
        int n=10;
        decPrint(n);
    }
}
