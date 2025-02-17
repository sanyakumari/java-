import java.util.Scanner;
public class PresentQuery {
    static int[] makeFrequencyarray(int[] arr){
        int[] freq = new int[100005];
        for(int i =0 ;i < arr.length; i++){
            freq[arr[i]]++;
        }
        return freq;
    }
    public static void main(String[] args) {
        int[] arr = {27,975,84,23,5789,2,1,47,97,98};
        int[] freq = makeFrequencyarray(arr);
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter number of queries:");
        int q = sc.nextInt();
        while(q > 0){
            System.out.println("Enter number to be searched");
            int x = sc.nextInt();
            if(freq[x] > 0){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
            q--;
        }
        sc.close();
    }
    
}
