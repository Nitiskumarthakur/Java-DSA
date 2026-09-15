public class ratMaze {

    public static Boolean isSafe(int maze[][], int row, int col){
        
        //Up
        for(int i=row; i>=0 ; i--){
            if(maze[row][col] == 0){
                return false;
            }
        }
        //Down
        for(int i=row; i<=maze.length-1;i++){
            if(maze[row][col] == 0){
                return false;
            }
        }
        //left
        for(int i=col ; i>=0 ; i--){
            if(maze[row][col] == 0){
                return false;
            }
        }
        //right
        for(int i=col ; i<=maze.length-1; i++){
           if(maze[row][col] == 0){
             return false;
           }
        }
        return true;
    }
    public static void mazeRate(int maze[][], int row){

        //Base case
        if(row == maze.length){
            count++;
            return;
        }
        
        for(int j=0;j<=maze.length-1;j++){
            if(isSafe(maze, row, j)){
                mazeRate(maze, row+1);
            }
        }
    }
    static int count = 0;
    public static void main(String[] args) {
        int maze[][] = { { 1, 1, 1, 1 }, { 0, 1, 0, 1 },
                { 1, 1, 1, 1 }, { 1, 0, 1, 1 } };

        mazeRate(maze, 0);
        
        System.out.println(count);

    }
}
