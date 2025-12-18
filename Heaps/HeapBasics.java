package Heaps;

import java.util.*;

public class HeapBasics {

    static class Heap {
        ArrayList<Integer> al = new ArrayList<>();

        // ADD
        public void add(int data) {
            al.add(data);
            int x = al.size() - 1;
            int parent = (x - 1) / 2;

            while (x > 0 && al.get(x) < al.get(parent)) {
                int temp = al.get(x);
                al.set(x, al.get(parent));
                al.set(parent, temp);

                x = parent;
                parent = (x - 1) / 2;
            }
        }

        // PEEK
        public int peek() {
            return al.get(0);
        }

        // EMPTY CHECK
        public boolean isEmpty() {
            return al.size() == 0;
        }

        // REMOVE
        public int remove() {
            int data = al.get(0);

            // swap root with last
            al.set(0, al.get(al.size() - 1));
            al.remove(al.size() - 1);

            heapify(0);
            return data;
        }

        // HEAPIFY
        public void heapify(int i) {
            int min = i;
            int left = 2 * i + 1;
            int right = 2 * i + 2;

            if (left < al.size() && al.get(left) < al.get(min)) {
                min = left;
            }

            if (right < al.size() && al.get(right) < al.get(min)) {
                min = right;
            }

            if (min != i) {
                int temp = al.get(i);
                al.set(i, al.get(min));
                al.set(min, temp);

                heapify(min);
            }
        }
    }

    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(2);
        h.add(5);
        h.add(0);
        h.add(8);

        while (!h.isEmpty()) {
            System.out.println(h.peek());
            h.remove();
        }
    }
}
