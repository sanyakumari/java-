public class PrintSpiral {
    static void printspiralorder(int[][] matrix, int r, int c){
        int toprow = 0, bottomrow =r -1 , leftcol = 0 , rightcol = c - 1;
        int totalelements = 0;
        while(totalelements < r*c){
            // toprow - leftcol to rightcol
            for(int i = leftcol ; i <= rightcol && totalelements < r*c ; i++){
                System.out.print(matrix[toprow][i] +" ");
                totalelements++;
            }
            toprow++;

            //rightcol - toprow to bottomrow
            for(int i = toprow; i <= bottomrow && totalelements < r*c ; i++){
                System.out.print(matrix[i][rightcol] +" ");
                totalelements++;
            }
            rightcol--;

            // bottomrow - rightcol to leftcol
            for(int i = rightcol ; i >= leftcol && totalelements < r*c ; i--){
                System.out.print(matrix[bottomrow][i] +" ");
                totalelements++;
            }
            bottomrow--;
            // leftcol - bottomrow to toprow
            for(int i = bottomrow ; i >= toprow && totalelements < r*c  ; i--){
                System.out.print(matrix[i][leftcol] +" ");
                totalelements++;
            }
            leftcol++;
        }
    }
    
    public static void main(String[] args) {
        int[][] a = { {2,3,4},
                      {4,5,9},
                      {3,8,2} };
        printspiralorder(a, 3, 3);          

    }
    
}
