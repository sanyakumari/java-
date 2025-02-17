public class MatrixSum3 {
    static void findprefixsumMatrix(int[][] matrix){  
        int r = matrix.length;
        int c = matrix[0].length;
        for(int i = 0 ; i< r ; i++){
            for(int j = 1 ; j < c ; j++){
                matrix[i][j] += matrix[i][j - 1];
            }
        }
    
        // calculating prefix sum over columns
        for(int j =0 ; j < c ; j++){
            for(int i = 1 ; i < r ; i++){
                matrix[i][j] += matrix[i - 1][j];
            }
        }
    
    }
    static int findsum(int[][] matrix , int l1 ,int r1 ,int l2 ,int r2){ // calculates sum by calculating prefix sum over both rows and column
        int ans = 0 , sum = 0 , up = 0 , left = 0 , leftup = 0;
        findprefixsumMatrix(matrix);
        sum = matrix[l2][r2];
        if(r1 >= 1){
           left = matrix[l2][r1 - 1];
        }
        if(l1 >= 1){
            up = matrix[l1 - 1][r2];
        }
        if(l1 >= 1 && r1 >= 1){
            leftup = matrix[l1 - 1][r1 -1];
        }
        ans = sum - left - up + leftup ;
        return ans;

    }
    public static void main(String[] args) {
        int[][] a = { {2,3,4},
                      {4,5,9},
                      {3,8,2} };
        System.out.println(findsum(a, 1, 1, 2, 2));
}
}