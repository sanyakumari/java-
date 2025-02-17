public class RotateMatrix {
        static void Transpose(int[][] matrix , int r , int c){ 
            for(int i = 0; i < r; i++){                      
                for(int j = i ;j < c ; j++){                  
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
         }
        }
        static void Reversearray(int[] arr){
            int i = 0, j = arr.length -1;
            while(i < j){
               int temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
               i++;
               j--;
           }
        }
      
    static void rotate(int[][] matrix , int n){ //Rotates matrix by 90 degrees
        Transpose(matrix, n, n);
        //reverse each row of transposed matrix
        for(int i =0 ; i <n ; i++){
            Reversearray(matrix[i]);
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
        rotate(a, 3);
        printmatrix(a);
        
    }
    
}
