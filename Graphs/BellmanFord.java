package Graphs;

import java.util.ArrayList;
import java.util.Arrays;

public class BellmanFord {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int wt) {
            this.src = s;
            this.dest = d;
            this.wt = wt;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 2, -4));

        graph[2].add(new Edge(2, 3, 2));

        graph[3].add(new Edge(3, 4, 4));

        graph[4].add(new Edge(4, 1, -1));
    }

    public static int[] bellmanFordAlgo(ArrayList<Edge> graph[], int src) {
        int dist[] = new int[graph.length];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;
        //o(v)                                T.C --> o(V*E)
        int v=graph.length-1;
        for (int i = 0; i <v; i++) {
            // deduce edges --> o[E]
            for (int j = 0; j < graph.length; j++) {
                for (int k = 0; k < graph[j].size(); k++) {
                    Edge e = graph[j].get(k);
                    if (dist[e.src] != Integer.MAX_VALUE && dist[e.src] + e.wt < dist[e.dest]) {
                        dist[e.dest] = dist[e.src] + e.wt;
                    }
                }
            }
        }
        return dist;
    }
    public static void main(String[] args) {
        int V = 6;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[V];

        createGraph(graph);
        System.out.println(Arrays.toString(bellmanFordAlgo(graph, 0)));
    }
}
// static int[] bellmanFord(int V, int[][] edges, int src) {

//         int[] dist = new int[V];
//         Arrays.fill(dist, (int)1e8);
//         dist[src] = 0;

//         // V-1 relaxations
//         for(int i = 0; i < V-1; i++){
//             for(int[] e : edges){
//                 int u = e[0];
//                 int v = e[1];
//                 int wt = e[2];

//                 if(dist[u] != (int)1e8 && dist[u] + wt < dist[v]){
//                     dist[v] = dist[u] + wt;
//                 }
//             }
//         }

//         // Optional: check negative cycle
//         for(int[] e : edges){
//             int u = e[0];
//             int v = e[1];
//             int wt = e[2];

//             if(dist[u] != (int)1e8 && dist[u] + wt < dist[v]){
//                 return new int[]{-1};
//             }
//         }

//         return dist;
//     }
// }
// Input: V = 5, edges[][] = [[1, 3, 2], [4, 3, -1], [2, 4, 1], [1, 2, 1], [0, 1, 5]], src = 0

