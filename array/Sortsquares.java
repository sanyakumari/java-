public class Sortsquares {
    static int[] sortsquares(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        int left = 0, right = n - 1;
        int k = 0;
        for(int i =0; i< n; i++){
            if(Math.abs(arr[left])> Math.abs(arr[right])){
                ans[k++] = arr[left] * arr[left];
                left++;
            }
            else{
                ans[k++] = arr[right] * arr[right];
                right--;
            }
        }
        return ans;
    }
    static void swap(int[] arr, int i ,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void reverseInPlace(int[] arr){
        int i = 0,j = arr.length -1;
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {-10,-3,5,7,9,11}; //non decreasing array input
        int[] ans = sortsquares(arr);
        reverseInPlace(ans);
        for(int i = 0;i < arr.length ; i++){
            System.out.print(ans[i] + " ");
        }
    }
    
}
