package Heaps;
import java.util.PriorityQueue;

public class NearestCars {

    static class Points implements Comparable<Points> {
        int idx;
        int x;
        int y;
        int distSq;

        public Points(int idx, int x, int y, int d) {
            this.idx = idx;
            this.x = x;
            this.y = y;
            this.distSq = d;
        }

        @Override
        public int compareTo(Points p) {
            return this.distSq - p.distSq; 
        }
    }

    public static void main(String[] args) {
        int pts[][] = { { 3, 3 }, { 5, -1 }, { -2, 4 } };
        int k = 2;

        PriorityQueue<Points> pq = new PriorityQueue<>();

        for (int i = 0; i < pts.length; i++) {
            int distSq = pts[i][0] * pts[i][0] + pts[i][1] * pts[i][1];
            pq.add(new Points(i, pts[i][0], pts[i][1], distSq));
        }

        for (int i = 0; i < k; i++) {
            System.out.println("C"+pq.poll().idx);
        }
    }
}
