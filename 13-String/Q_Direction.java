//FInd out the direction.
public class Q_Direction {

    public static float shortestPath(String path){

        int x=0, y=0;
        for(int i=0;i<path.length();i++){
            char dir = path.charAt(i);
            //west
            if(dir == 'W'){
                x--;
            }
            //East
            else if(dir == 'E'){
                x++;
            }
            //North
            else if(dir == 'N'){
                y++;
            }
            //South
            else{
                y--;
            }
        }
        int x2= x*x;
        int y2= y*y;
        return  (float)Math.sqrt(x2+y2);
     
    }
    public static void main(String[] args) {
        String path = "WNEENNNSENNN";
        System.out.println(shortestPath(path));
    }
}
