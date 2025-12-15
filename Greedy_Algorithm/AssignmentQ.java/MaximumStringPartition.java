public class MaximumStringPartition {

    public static int StringPartition(String str, int n) {

        if (n == 0) {
            return 0;
        }
        int ans = 0;
        int r = 0;
        int l = 0;

        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == 'R') {
                r++;
            } else if (str.charAt(i) == 'L') {
                l++;
            }
            if (r == l) {
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println("Maximim string partition");

        String str = "LRRLLRL";

        int n = str.length();
        int result = StringPartition(str, n);

        System.out.println("The string is balanved into X balanced substring:" + result);
       
    }

}
