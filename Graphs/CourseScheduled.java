package Graphs;

import java.util.ArrayList;

public class CourseScheduled {
    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        @SuppressWarnings("unchecked")
        ArrayList<Integer>[] graph = new ArrayList[numCourses];
        for (int i = 0; i < numCourses; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int[] pre : prerequisites) {
            int a = pre[0];
            int b = pre[1];
            graph[b].add(a); // b → a
        }

        boolean visited[] = new boolean[graph.length];
        boolean stack[] = new boolean[graph.length];

        for (int i = 0; i < numCourses; i++) {
            if (!visited[i]) {
                if (detectCycle(graph, i, visited, stack)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean detectCycle(ArrayList<Integer>[] graph, int cur, boolean[] visited, boolean[] stack) {

        visited[cur] = true;
        stack[cur] = true;
        for (int neighbor : graph[cur]) {

            if (stack[neighbor]) {
                return true;
            }

            if (!visited[neighbor] &&
                    detectCycle(graph, neighbor, visited, stack)) {
                return true;
            }
        }
        stack[cur] = false;
        return false;
    }
    public static void main(String[] args) {
        int numCourses = 2;
        int[][] prerequisites = {
                {1,0},{0,1}
        };
        boolean result = canFinish(numCourses, prerequisites);
        System.out.println(result); 
    }

}
