package BackTracking;

public class permutation {
    public static void findPermutation(String str, String ans) {
        // base case
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        // choices of letters
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String NewStr = str.substring(0, i) + str.substring(i + 1); // remove ith index
            findPermutation(NewStr, ans + currChar);
        }
    }

     public static void findPermutation1(String str, String ans) {
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);
            String news=str.substring(0,i)+str.substring(i+1);
            findPermutation1(news, ans+ch);
        }
     }
        // base case
    public static void main(String[] args) {
        String str = "abc";
        findPermutation(str, "");
    }
}
