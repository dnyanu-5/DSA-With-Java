public class q_443 {

    public static String stringCompression(String str) {
        StringBuilder newstr = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            int count = 1; 

            while (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            newstr.append(str.charAt(i)); 
            if (count > 1) {
                newstr.append(count); 
            }
        }
        return newstr.toString();
    }

    public static void main(String[] args) {
        String str = "abbcccaa";
        String compressed = stringCompression(str);
        System.out.println("Compressed: " + compressed);
    }
}
