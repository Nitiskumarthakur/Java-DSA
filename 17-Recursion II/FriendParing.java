public class FriendParing {

    public static int Pairing(int n){
        if(n==1 || n==2){
            return n;
        }
        //choise
        //Single 
        int fnm1 = Pairing(n-1);
        //pair
        int fnm2 = Pairing(n-2);
        int pairWays = (n-1) * fnm2;

        int totalPair = fnm1 + pairWays;
        return totalPair;
    }
    public static void main(String[] args) {
        System.out.println(Pairing(4));
    }
}
