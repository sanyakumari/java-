public class MatrixMultiplication {
    static void multiply(int[][] a , int r1 , int c1 , int[][] b , int r2 ,int c2){
        int[][] mul = new int[r1][c2];
        if(c1 != r2){
            System.out.println("Multiplication not possible");
            return;
        }
        for(int i = 0 ; i < r1; i++){
            for(int j = 0; j < c2 ; j++){
                for(int k = 0 ; k< c1 ; k++){
                    mul[i][j] += (a[i][k] * b[k][j]) ;
                }
        }
    }
        printmatrix(mul);
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

        int[][] b = { {4,8,2},
                      {6,9,4},
                      {7,1,4}}  ;
        multiply(a, 3, 3, b, 3, 3); 
    }
    
}
