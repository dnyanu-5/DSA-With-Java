package TwoDArrays;
public class count7 {
    public static void numberOf7(int arr[][]) {

        int count = 0;
        int n = arr.length;
        int m = arr[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 7) {
                    count++;
                }
            }
        }
        System.out.println("the count of 7 is:" + count);
    }
    public static void main(String[] args) {

        int arr[][] = { { 1, 2, 7 }, { 2, 7, 8 } };
        numberOf7(arr);
    }
}