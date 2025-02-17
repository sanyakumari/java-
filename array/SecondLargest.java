public class SecondLargest {
    static int findmax(int[] arr){
        int mx = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length ; i++){
            if(arr[i] > mx){
                mx = arr[i];
            }
        }
        return mx;

    }
    static int findSecondMax(int[] arr){
        int mx = findmax(arr);
        for(int i =0 ; i< arr.length ; i++){
            if(arr[i] == mx){
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secondmax = findmax(arr);
        return secondmax;
    }
    public static void main(String[] args) {
        int[] arr = {2,8,4,9,1,7};
        System.out.println(findSecondMax(arr));
    }
}
