public class MatrixSum {
    static int findsum(int[][] matrix, int l1 , int r1 , int l2 , int r2){  // finds the sum of all elements between the two coordinates
        int sum = 0;
        for(int i = l1 ; i <= l2 ; i++){
            for(int j = r1 ; j <= r2 ; j++){
                sum += matrix[i][j];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[][] a = { {2,3,4},
                      {4,5,9},
                      {3,8,2} };
        System.out.println(findsum(a, 1, 1, 2, 2));
}
}