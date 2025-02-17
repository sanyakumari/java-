public class RotatekTimes {
    static void rotateInPlace(int[] arr,int k){  //we can also reverse by taking new array and filling this array value into new array.
        int n = arr.length; 
        k = k%n;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
    }
    static void swap(int[] arr, int i ,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void reverse(int[] arr,int i, int j){ 
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {4,2,8,4,6,1,8};
        int k = 5;
        rotateInPlace(arr, k);
        for( int i = 0;i< arr.length; i++){
            System.out.print(arr[i]+ " ");
        }

    }
    
}
