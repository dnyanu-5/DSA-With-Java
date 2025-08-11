public class q_2965 {

    public static int[] findRepeatedAnMissingValue(int arr[][]) {

        int frq[] = new int[10];
        int result[] = new int[2];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                frq[arr[i][j]]++;
            }
        }

        for (int i = 0; i <= 9; i++) {
            if (frq[i] == 2) {
                result[0] = i;
            }
            if (frq[i] == 0) {
                result[1] = i;
            }
        }
        return result;

    }

    public static void main(String[] args) {

        int arr[][] = { { 1, 2, 3 }, { 4, 6, 7 }, { 8, 8, 9 } };
        int result[] = findRepeatedAnMissingValue(arr);
        System.err.println("repeated:" + result[0]);
        System.err.println("missing:" + result[1]);

    }

}
