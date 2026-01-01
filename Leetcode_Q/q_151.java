public class q_151 {

    public static String reverseString(String str){

        String word[]=str.split("\\s+");

        StringBuilder sb= new StringBuilder();
        for(int i=word.length-1;i>=0;i--){
            sb.append(word[i]);
            sb.append(" ");
           
        }
        return sb.toString().trim();
    }
    public static void main(String[] args) {
        String str="  the sky     is blue ";
        System.out.println(reverseString(str));
       
    }
    
}
