import java.util.Scanner;
public class GenerateMatrix {
    static int[][] Generatespiralmatrix(int n){ // generate spiral matrix from 1 to n^2
        int toprow = 0, bottomrow = n -1 , leftcol = 0 , rightcol = n - 1;
        int[][] matrix = new int[n][n];
        int curr = 1;
        while(curr <= n*n){
            // toprow - leftcol to rightcol
            for(int i = leftcol ; i <= rightcol && curr <= n*n ; i++){
                matrix[toprow][i] = curr++;
            }
            toprow++;

            //rightcol - toprow to bottomrow
            for(int i = toprow; i <= bottomrow && curr <= n*n; i++){
                matrix[i][rightcol] = curr++;
            }
            rightcol--;

            // bottomrow - rightcol to leftcol
            for(int i = rightcol ; i >= leftcol && curr <= n*n ; i--){
                matrix[bottomrow][i] = curr++;
            }
            bottomrow--;
            // leftcol - bottomrow to toprow
            for(int i = bottomrow ; i >= toprow && curr <= n*n ; i--){
                matrix[i][leftcol] = curr++;
            }
            leftcol++;
        }
        return matrix;

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
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        sc.close();
        int[][] matrix = Generatespiralmatrix(n);
        printmatrix(matrix);
    }
    
}
