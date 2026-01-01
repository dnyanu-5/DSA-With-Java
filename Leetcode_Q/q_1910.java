public class q_1910 {

    public static String removeOccrance(String str, String part) {
        int m=part.length();
        StringBuilder sb = new StringBuilder();
        for(char ch :str.toCharArray()){
            sb.append(ch);
            if(sb.length() >= m){
                String sub= sb.substring(sb.length()-m);
                if(sub.equals(part)){
                    System.out.println("Removed:"+sub);
                    sb.setLength(sb.length()-m);
                }
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str="axxxxyyyyb";
        String part="xy";
        System.out.println(removeOccrance(str, part));
    }
}
