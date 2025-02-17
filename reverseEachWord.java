public class reverseEachWord {
    public static void main(String[] args) {
        String str = "My name is sanya";
        String ans = "";
        StringBuilder sb = new StringBuilder("");
        for(int i =0 ; i < str.length() ; i++){
            char ch = str.charAt(i);
            if(ch != ' '){
                sb.append(ch);
            }
            else{
                sb.reverse();
                ans += sb;
                ans += " ";
                sb = new StringBuilder("");
            }
        }
        sb.reverse();   // to add last word in ans
        ans += sb;
        System.out.println(ans);
    }
    
}
