public class GridWay {

    public static int GridWayCount(int i,int j, int n, int m){

        //Base case
        if(i == n-1 || j == m-1){
            return 1;
        } else if(i == n || j == m){
           return 0;
        }
        //Do Actions
        int way1 = GridWayCount(i+1, j, n, m);
        int way2 = GridWayCount(i, j+1, n, m);

        return way1+way2;
    }
    public static void main(String args[]){
        int n=4, m=4;

        System.out.println(GridWayCount(0, 0, n, m));
    }
}
