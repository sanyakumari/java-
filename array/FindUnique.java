public class FindUnique {
    static int Uniquenumber(int[] arr){
        int n = arr.length;
        for(int i = 0 ;i < n ; i++){
            for(int j = i+1; j < n ; j ++){  //except for one element all others have duplicate
                if(arr[i] == arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        int ans = -1;
        for(int i = 0; i< n; i++){
            if(arr[i] > 0){
                ans = arr[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,1,4,3};
        System.out.println(Uniquenumber(arr));
    }
    
}
