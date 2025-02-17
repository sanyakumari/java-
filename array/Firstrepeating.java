public class Firstrepeating {
    static int firstrepeatingNumber(int[] arr){
        int n = arr.length;
        for(int i =0 ; i< n; i++){
            for(int j =i+ 1; j < n; j++){
                if(arr[i] == arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2,4,7,3,5,9,3,8,5};
        System.out.println(firstrepeatingNumber(arr));
    }
    
}
