public class MatrixAddition {
    static void add(int[][] a , int r1 , int c1 , int[][] b , int r2 ,int c2){
        int[][] sum = new int[r1][c1];
        if(r1 != r2 || c1 != c2){
            System.out.println("Addition not possible");
            return;
        }
        for(int i = 0 ; i < r1; i++){
            for(int j = 0; j < c1 ; j++){
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        for(int i = 0 ; i < r1; i++){
            for(int j = 0; j < c1 ; j++){
                System.out.print(sum[i][j] +" ");
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
        add(a, 3, 3, b, 3, 3);
                           
    }
    
}
