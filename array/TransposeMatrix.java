public class TransposeMatrix {
    static void Transpose(int[][] matrix , int r , int c){ //this method is only applicable for square matrix
        for(int i = 0; i < r; i++){                      // can also be done by creating a new matrix :- ans[i][j] = matrix[j][i]
            for(int j = i ;j < c ; j++){                  // the above method will also run for non square matrices
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
     }
    }
    static void printmatrix(int[][] matrix){
        for(int i = 0 ; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length ; j++){
                System.out.print(matrix[i][j] +" ");
            }
            System.out.print("\n");
        }

    }
    public static void main(String[] args) {
        int[][] a = { {2,3,4},
                      {4,5,9},
                      {3,8,2} };
        Transpose(a, 3, 3);  
        printmatrix(a);            

    }
    
}
