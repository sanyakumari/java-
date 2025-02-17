public class SortZeroandOne {
    static void sortZeroesandOnes(int[] arr){
        int n = arr.length;
        int left = 0, right= n-1;
        while(left < right){
            if(arr[left] == 1 && arr[right] == 0){
                swap(arr, left , right);
                left++;
                right--;
            }
            if(arr[left] == 0){
                left++;
            }
            if(arr[right] == 1){
                right--;
            }
        }
    }
    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    // zeroes and ones can also be sorted by counting the no. of zeroes in the array and then filling the array with no. of zeroes in starting
    // and then remaining with 1s till the size of array .but this is not optomized approach as we have to traverse the array twice 
    // once for counting zeroes and second time for filling zeroes and ones
    public static void main(String[] args) {
        int[] arr = {1,0,0,1,1,0,1,0,1,0,0};
        sortZeroesandOnes(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
