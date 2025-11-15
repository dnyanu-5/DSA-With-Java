package BackTracking;

public class GridWways {
    public static int countGridWays(int i, int j, int n, int m) {
        // basecase
        if (i == n - 1 && j == m - 1) {
            return 1;
        } else if (i == n || j == m) {
            return 0;
        }
        int w1 = countGridWays(i + 1, j, n, m); // down
        int w2 = countGridWays(i, j + 1, n, m); // right
        return w1 + w2;
    }

    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        int result= countGridWays(0, 0, n, m);
        System.out.println("total no of  grid ways:"+result);
    }

}
