import java.util.*;

public class q_14 {

    public static String isLongestCommonString(String arr[]) {
        Arrays.sort(arr);
        String str = arr[0];
        String str2 = arr[arr.length - 1];

        int i = 0;
        while (i < str.length()) {

            if (str.charAt(i) == str2.charAt(i)) {
                i++;
            } else {
                break;
            }
        }
        return i == 0 ? "" : str.substring(0, i);
    }

    public static String isLongestCommonPrefix(String arr[]) {

        if (arr.length == 0 || arr == null) {
            return "";
        }
        String prefix = arr[0];

        for (int i = 1; i < arr.length; i++) {
            while (!arr[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty())
                    return "";
            }
        }
        return prefix;
    }
    public static void main(String[] args) {

        String arr[] = { "flower", "flight", "float" };
        System.out.println(isLongestCommonString(arr));

        System.out.println(isLongestCommonPrefix(arr));

    }
}
