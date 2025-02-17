public class Reversearray {
    static void reverse(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        int i = n-1, j = 0;
        while(i >= 0){
            ans[j++] = arr[i--];
        }
        
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
        int[] arr = {3,5,7,2,8};
        reverseInPlace(arr);
        for( int i = 0;i< arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
    
}
