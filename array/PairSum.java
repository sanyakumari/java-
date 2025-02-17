public class PairSum {
    static int pairsum(int[] arr, int target){
        int n = arr.length;
        int ans = 0;
        for(int i = 0; i<n ; i++){
           for (int j = i + 1; j< n ; j++){
            if(arr[i] + arr[j] == target){   // similar for three elements one more loop will be added
                ans++;                       // for (int k = j + 1; j< n ; j++){arr[i] +arr[j] +arr[k] == target}
            }
           }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {4,6,3,5,8,2};
        int target = 7;
        System.out.println(pairsum(arr,target));;
    }
    
}
