public class SwapNumbers {
    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a =" + a);
        System.out.println("b =" + b);
    
    }
    static void swap_(int a,int b){
        a = a+b;
        b = a-b;
        a = a-b;
    }
    public static void main(String[] args) {
        int a = 9;
        int b = 3;
        swap(a, b);
    }
    
}
