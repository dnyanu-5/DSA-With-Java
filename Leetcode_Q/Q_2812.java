import java.util.*;

public class Q_2812 {

    static int[][] directions = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };

    public static int maximumSafenessFactor(List<List<Integer>> grid) {
        int n = grid.size();

        // Step 1: Calculate distance from nearest thief
        int[][] dist = new int[n][n];
        for (int[] row : dist) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }

        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid.get(i).get(j) == 1) {
                    dist[i][j] = 0;
                    queue.offer(new int[] { i, j });
                }
            }
        }

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int r = curr[0];
            int c = curr[1];

            for (int[] d : directions) {
                int nr = r + d[0];
                int nc = c + d[1];

                if (nr >= 0 && nr < n && nc >= 0 && nc < n
                        && dist[nr][nc] == Integer.MAX_VALUE) {

                    dist[nr][nc] = dist[r][c] + 1;
                    queue.offer(new int[] { nr, nc });
                }
            }
        }

        // Step 2: Binary Search
        int low = 0;
        int high = 2 * n;
        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canReach(dist, mid)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    private static boolean canReach(int[][] dist, int safe) {
        int n = dist.length;

        if (dist[0][0] < safe)
            return false;

        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[n][n];

        queue.offer(new int[] { 0, 0 });
        visited[0][0] = true;

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int r = curr[0];
            int c = curr[1];

            if (r == n - 1 && c == n - 1)
                return true;

            for (int[] d : directions) {
                int nr = r + d[0];
                int nc = c + d[1];

                if (nr >= 0 && nr < n && nc >= 0 && nc < n
                        && !visited[nr][nc]
                        && dist[nr][nc] >= safe) {

                    visited[nr][nc] = true;
                    queue.offer(new int[] { nr, nc });
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {

        List<List<Integer>> grid = new ArrayList<>();

        grid.add(Arrays.asList(0, 0, 1));
        grid.add(Arrays.asList(0, 0, 0));
        grid.add(Arrays.asList(0, 0, 0));

        int ans = maximumSafenessFactor(grid);

        System.out.println(ans);
    }
}