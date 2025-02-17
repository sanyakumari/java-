public class PrefixSum {
    static void prefixsum(int[] arr){
        int n = arr.length;
        for(int i = 1; i< n ; i++){
            arr[i] = arr[i] + arr[i-1];
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,9,5,7,8,2,6};
        prefixsum(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        // q queries can also be asked
        // find the sum from l to r
        // the formula will be    ans = arr[r] - arr[l - 1];
    }   
}
