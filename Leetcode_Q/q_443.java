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

    public static int stringCompression443(char[] str) {

        int idx = 0;

        for (int i = 0; i < str.length; i++) {

            char ch = str[i];
            int count = 0;

            while (i < str.length && str[i] == ch) {
                count++;
                i++;
            }
            i--;

            str[idx++] = ch;

            if (count > 1) {
                String s = String.valueOf(count);
                for (char digit : s.toCharArray()) {
                    str[idx++] = digit;
                }
            }
        }
        return idx;
    }
    public static void main(String[] args) {
        String str = "abbcccaa";
        String compressed = stringCompression(str);
        System.out.println("Compressed: " + compressed);

        char[] arr = { 'a', 'a', 'b', 'b', 'c', 'c', 'c' };
        int len = stringCompression443(arr);

        System.out.println(len);
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i]);
        }
        

    }
}
