package Recursion;
import java.util.ArrayList;
import java.util.Collections;

public class RateInAMaze {
    public static void solution(int row, int col, int maze[][], String ans, int n) {

        // base case
        if (row < 0 || col < 0 || row >= n || col >= n || maze[row][col] == 0) {
            return;
        }
        // destination
        if (row == n - 1 && col == n - 1) {
            maze[row][col] = 1;
            System.out.println("path:" + ans);
        }
        maze[row][col] = 0;
        solution(row + 1, col, maze, ans + "D", n);// down
        solution(row - 1, col, maze, ans + "U", n);// up
        solution(row, col - 1, maze, ans + "L", n);// left
        solution(row, col + 1, maze, ans + "R", n);// right

        maze[row][col] = 1;
    }

    public static void solutionAL(int row, int col, int maze[][], String ans, int n,ArrayList<String> list) {

        // base case
        if (row < 0 || col < 0 || row >= n || col >= n || maze[row][col] == 0) {
            return;
        }
        // destination
        if (row == n - 1 && col == n - 1) {
            list.add(ans);
            return;  
        }
        maze[row][col] = 0;
        solution(row + 1, col, maze, ans + "D", n);// down
        solution(row - 1, col, maze, ans + "U", n);// up
        solution(row, col - 1, maze, ans + "L", n);// left
        solution(row, col + 1, maze, ans + "R", n);// right

        maze[row][col] = 1;
    }
     public static ArrayList<String> findPath(int[][] maze, int n) {
        ArrayList<String> list = new ArrayList<>();
        // if start is blocked
        if (maze[0][0] == 0) return list;
        solutionAL(0, 0, maze, "", n, list);
        // sort result 
        Collections.sort(list);
        return list;
    }
    public static void main(String[] args) {
        int maze[][] = {
                { 1, 0, 0, 0 },
                { 1, 1, 0, 1 },
                { 1, 1, 0, 0 },
                { 0, 1, 1, 1 }, };
        solution(0, 0, maze, "", 4);
        int n = maze.length;
        ArrayList<String> result = findPath(maze, n);
        System.out.println(result);
    }
}
