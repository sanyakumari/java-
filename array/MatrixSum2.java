public class MatrixSum2 {
    static void findprefixsumMatrix(int[][] matrix){  // finds sum by pre calculating the prefix sum over rows
        int r = matrix.length;
        int c = matrix[0].length;
        for(int i = 0 ; i< r ; i++){
            for(int j = 1 ; j < c ; j++){
                matrix[i][j] += matrix[i][j - 1];
            }
        }
    }
    
    static int findsum(int[][] matrix , int l1 ,int r1 ,int l2 ,int r2){
        int sum = 0;
        findprefixsumMatrix(matrix);
        for(int i = l1 ; i <= l2 ; i++){
            sum += matrix[i][r2] - matrix[i][r1 - 1];
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
