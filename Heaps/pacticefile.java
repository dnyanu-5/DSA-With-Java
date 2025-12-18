package Heaps;

import java.util.*;

public class pacticefile {

    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            arr.add(data);
            int x = arr.size() - 1;
            int parent = (x - 1) / 2;

            while (x > 0 && arr.get(x) < arr.get(parent)) {

                int temp = arr.get(x);
                arr.set(x, arr.get(parent));
                arr.set(parent, temp);

                x = parent;
                parent = (x - 1) / 2;
            }
        }

        public int peek() {
            return arr.get(0);
        }

        public boolean isEmpty() {
            return arr.size() == 0;
        }

        public void heapify(int i) {
            int min = i;
            int left = 2 * i + 1;
            int right = 2 * i + 2;

            if (left < arr.size() && arr.get(left) < arr.get(min)) {
                min = left;
            }
            if (right < arr.size() && arr.get(right) < arr.get(min)) {
                min = right;
            }

            if (min != i) {
                int temp = arr.get(i);
                arr.set(i, arr.get(min));
                arr.set(min, temp);

                heapify(min);
            }

        }

        public int remove() {
            // min element is deleted from heap
            int data = arr.get(0);

            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);

            arr.remove(arr.size() - 1);

            heapify(0);

            return data;

        }
    }

    public static void main(String[] args) {
        Heap p = new Heap();
        p.add(5);
        p.add(6);
        p.add(9);
        p.add(2);
        p.add(1);

        while (!p.isEmpty()) {
            System.out.println(p.peek());
            p.remove();
        }

    }

}
