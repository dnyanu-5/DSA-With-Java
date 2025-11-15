package BackTracking;

public class RatInMaze {
    public static void solution(int row, int col, int maze[][], int n, String ans,int path[][]) {

        // base case
        if (row < 0 || col < 0 || row >= n || col >= n || maze[row][col] == 0) {
            return;
        }
        if (row == n - 1 && col == n - 1) {
            path[row][col] = 1; 
            System.out.println("path: " + ans);
            printMatrix(path, n);
            path[row][col] = 0;    // unmark for other paths 
        }
        maze[row][col] = 0;  // visited
        path[row][col] = 1; // mark path matrix

        solution(row + 1, col, maze, n, ans + "D",path);// down
        solution(row - 1, col, maze, n, ans + "U",path);// up
        solution(row, col - 1, maze, n, ans + "L",path);// left
        solution(row, col + 1, maze, n, ans + "R",path);// right

        maze[row][col] = 1;
        path[row][col] = 0; // unmark path for backtracking

    }

       public static void printMatrix(int path[][], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(path[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int maze[][] = { 
                { 1, 0, 0, 0 },
                { 1, 1, 0, 1 },
                { 0, 1, 0, 0 },
                { 0, 1, 1, 1 }, };

        int path[][] = new int[4][4];

        solution(0, 0, maze, 4, "",path);

    }

}
