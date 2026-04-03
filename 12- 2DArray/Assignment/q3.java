package Assignment;

public class q3 {
    //swapping the rows to columns.
    // public static void main(String[] args) {
    //     int matrix[][]={{11, 12, 13}, 
    //                     {21, 22, 23}};

    //     for(int i=0;i<matrix.length;i++){
    //         for(int j=0;j<matrix[0].length;j++){
    //             int temp=matrix[0][j];
    //             matrix[0][j]=matrix[0][j];
    //             matrix[i][0]=temp;
    //             System.out.print(matrix[i][0]+" ");
    //         }
    //     }
   // }
public static void main(String[] args) { 
int row = 2, column = 3; 
int[][] matrix = { {2, 3, 7}, {5, 6, 7} }; 
 
 
// Display original matrix 
printMatrix(matrix); 
 
// Transpose the matrix 
int[][] transpose = new int[column][row]; 
for(int i = 0; i<row; i++) { 
for (int j = 0; j<column; j++) { 
transpose[j][i] = matrix[i][j]; 
} 
} 
 
 
// print the transposed matrix 
printMatrix(transpose); 
} 
 
 
public static void printMatrix(int[][] matrix) { 
System.out.println("The matrix is: "); 
for(int i=0; i<matrix.length; i++) { 
   for (int j=0; j<matrix[0].length; j++) { 
System.out.print(matrix[i][j] + " "); 
} 
   System.out.println(); 
   }
}
}