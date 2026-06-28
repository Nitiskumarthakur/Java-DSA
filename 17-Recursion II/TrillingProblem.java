public class TrillingProblem{

    public static int triling(int n){ //2xn

        //Base case
        if(n==0 ||n==1){
            return 1;
        }
        //kam
        //Horizetal 
        int fnm2 = triling(n-2);

        //vartical 
        int fnm1 = triling(n-1);

        int result = fnm1 + fnm2;
        return result;
    }
   public static void main(String[] args) {
        System.out.println(triling(4));
   }
}