public class EqualsumPartition {
    static int totalsum(int[] arr){
        int totalsum = 0;
        for(int i  = 0; i<arr.length ; i++){
            totalsum += arr[i];
        }
        return totalsum;
    }
    static boolean equalpartition(int[] arr){
        int totalsum = totalsum(arr);
        int prefixsum = 0;
        for(int i = 0 ; i < arr.length ; i++){
             prefixsum += arr[i];
             int suffixsum = totalsum - prefixsum;
             if(suffixsum == prefixsum){
                return true;
             }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {3,5,3,9,2};
        boolean ans = equalpartition(arr);
        System.out.println(ans);

    }
    
}
