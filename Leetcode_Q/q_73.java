public class q_73 {

    public static void zeroMatrix(int matrix[][]) {
        int m = matrix.length;
        int n = matrix[0].length;

        boolean firstRowZeroes = false;
        boolean firstColZeroes = false;

        // check first column
        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) {
                firstColZeroes = true;
                break;
            }
        }

        // check first row
        for (int j = 0; j < n; j++) {
            if (matrix[0][j] == 0) {
                firstRowZeroes = true;
                break;
            }
        }

        // mark rows & columns
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // update inner matrix
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // zero first column
        if (firstColZeroes) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }

        // zero first row
        if (firstRowZeroes) {
            for (int j = 0; j < n; j++) {
                matrix[0][j] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int matrix[][] = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };

        zeroMatrix(matrix);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
