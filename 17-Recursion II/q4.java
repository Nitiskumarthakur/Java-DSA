// TOWER OF HANOI(Impotant);
public class q4 {

    public static void sideTower(int n, String src, String helper, String dest){
        if(n==1){
            System.out.println("transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
        sideTower(n-1, src, helper, dest);

        System.out.println("transfer disk " + n + " from " + src + " to " + helper); 
        sideTower(n-1, src, helper, dest);
    }
    public static void main(String[] args) {
        int n=4;
        sideTower(n, "A", "B", "C");
    }
}
