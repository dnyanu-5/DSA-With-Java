package Heaps;

import java.util.*;

public class BasicsPQ {

    // how to store class and objects in PQ
    static class students implements Comparable<students> {
        int rank;
        String name;

        public students(int rank, String name) {
            this.rank = rank;
            this.name = name;
        }

        @Override
        public int compareTo(students s) {
            return this.rank - s.rank;
        }

    }
    public static void main(String[] args) {
        PriorityQueue<Integer> pr = new PriorityQueue<>();
        // PriorityQueue<Integer> pr= new PriorityQueue<>(Comparator.reverseOrder());for descending order

        pr.add(2);
        pr.add(7);
        pr.add(3);
        pr.add(1);
        pr.add(4);

        while (!pr.isEmpty()) {
            System.out.println(pr.peek());
            pr.remove();
        }

        PriorityQueue<students> s = new PriorityQueue<>(Comparator.reverseOrder());
        s.add(new students(2, "A"));
        s.add(new students(8, "B"));
        s.add(new students(1, "D"));
        s.add(new students(7, "C"));

        while (!s.isEmpty()) {
            students st = s.poll();
            System.out.println(st.name + " -> " + st.rank);
        }
    }

}
