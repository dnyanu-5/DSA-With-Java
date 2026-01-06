public class q_1392 {
    public static String longestPrefix(String s){

        int n=s.length();
        int lps[]=new int[n];

        int len=0;//lngth of prefix
        int i=1;
        while(i<n){
            if(s.charAt(i)==s.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }else{    //the mismatch handling in KMP
                if(len!=0){
                    len=lps[len-1];
                }else{
                    lps[i]=0;
                    i++;
                }
            }
        }
        return s.substring(0,lps[n-1]);

    }
    public static void main(String[] args) {
        String s="ababab";
        System.out.println(longestPrefix(s));
        

    }
    
}
