package Graphs;

import java.util.*;

public class GraphImplimetation {
    static class Edge {
        int src;
        int dest;
        int wgt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wgt = w;
        }
    }
    public static void main(String[] args) {
        int V = 5;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[V];

        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 5));

        graph[1].add(new Edge(1, 3, 3));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 0, 5));

        graph[2].add(new Edge(2, 3, 3));
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 4, 2));

        graph[3].add(new Edge(3, 2, 5));
        graph[3].add(new Edge(3, 1, 1));

        graph[4].add(new Edge(4, 2, 2));

        //2's neighbour

        for(int i=0;i<graph[2].size();i++){
            Edge e= graph[2].get(i);
            System.out.println("2's neighbor:"+e.dest+" and cost to reach "+e.wgt);
        }

        for(int i=0;i<graph[1].size();i++){
            Edge e= graph[1].get(i);
            System.out.println("1's neighbor:"+e.dest+" and cost to reach "+e.wgt);
        }

        for(int i=0;i<graph[0].size();i++){
            Edge e= graph[0].get(i);
            System.out.println("0's neighbor:"+e.dest+" and cost to reach "+e.wgt);
        }

    }

}
