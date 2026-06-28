public class Increasing {

    public static void Incre(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        Incre(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        int n=5;
        Incre(n);
    }
}
