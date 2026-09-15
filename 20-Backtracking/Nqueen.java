public class Nqueen {
    

    public static boolean isSafe(char board[][], int row, int col){

        //Vartical approch
        for(int i=row-1; i>=0; i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //Diagonal Left
        for(int i=row-1, j=col-1 ; i>=0 && j>=0 ; i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        //Diagonal Right
        for(int i=row-1, j=col+1; i>=0 && j<=board.length-1; i--, j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }
    public static void queen(char board[][], int row) {
        
        // base case
        if (row == board.length) {
            printBoard(board);
            count++;
            return;
        }
        // column loop
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                queen(board, row + 1); // Function calling.
                board[row][j] = 'x'; // Backtracking Code.
            }
        }
    }

    public static void printBoard(char board[][]) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int count = 0;
    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }
        queen(board, 0);

        System.out.println("Number of ways : "+count);
    }

}
