package Recursion;

public class WordSearch {
    public static boolean exist(char[][] board, String word) {

        int n = board.length;
        int m = board[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (dfs(board, word, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }
    // index==word index;
    public static boolean dfs(char[][] board, String word, int row, int col, int index) {
        if (index == word.length()) {
            return true;
        }
        // base case
        if (row < 0 || col < 0 || row >= board.length || col >= board[0].length
                || board[row][col] != word.charAt(index)) {
            return false;
        }

        char ch = board[row][col];
        board[row][col] = '#';

        boolean found = dfs(board, word, row + 1, col, index + 1) || // down
                dfs(board, word, row - 1, col, index + 1) || // up
                dfs(board, word, row, col + 1, index + 1) || // right
                dfs(board, word, row, col - 1, index + 1); // left

        board[row][col] = ch;

        return found;

    }

    public static void main(String[] args) {
        char[][] board = {
                { 'A', 'B', 'C', 'E' },
                { 'S', 'F', 'C', 'S' },
                { 'A', 'D', 'E', 'E' }
        };
        String word = "SEE";
        boolean result = exist(board, word);
        System.out.println(result);
    }
}
