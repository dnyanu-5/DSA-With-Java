package ArrayList;

import java.util.*;

public class ContainerWithMostWater {

    // o(n^2)
    public static int mostWater(ArrayList<Integer> list) {

        int max = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                int height = Math.min(list.get(i), list.get(j));
                int width = j - i;
                int water = height * width;
                max = Math.max(max, water);
            }
        }
        return max;
    }
 
    // o(n)
    public static int optimizedSolution(ArrayList<Integer> list) {
        int maxWater = 0;
        int lp = 0;
        int rp = list.size() - 1;

        while (lp < rp) {
            int height = Math.min(list.get(lp), list.get(rp));
            int width = rp-lp;
            int waterStored = width * height;

            maxWater = Math.max(maxWater, waterStored);

            if (list.get(lp) < list.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }

        return maxWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);

        int result = mostWater(list);
        System.out.println(result);

        int res = optimizedSolution(list);
        System.out.println(res);
    }

}
