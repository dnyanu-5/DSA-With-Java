package Greedy_Algorithm;

import java.util.*;

public class activitySelection {
    public static void main(String[] args) {

        System.out.println("greedy algorithm");
        ArrayList<Integer> list = new ArrayList<>();

        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };

        int maxcount = 0;

        // ading first activity
        maxcount = 1;
        list.add(0);
        int lastend = end[0];
        for (int i = 1; i < start.length; i++) {
            if (start[i] >= lastend) {
                list.add(i);
                maxcount++;
                lastend = end[i];
            }
        }

        System.out.println("max activity:" + maxcount);
        for (int i = 0; i < list.size(); i++) {
            System.out.print("A" + list.get(i) + " ");
        }

        // if array is not sorted
        // int activites[][] = new int[start.length][3];

        // for (int i = 0; i < start.length; i++) {
        //     activites[i][0] = i;
        //     activites[i][1] = start[i];
        //     activites[i][2] = end[i];
        // }
        // Arrays.sort(activites, Comparator.comparingDouble(o -> o[2]));

        // int maxcount = 0;

        // // ading first activity
        // maxcount = 1;
        // list.add(activites[0][0]);
        // int lastend = activites[0][2];
        // for (int i = 1; i < start.length; i++) {
        //     if (activites[i][1] >= lastend) {
        //         maxcount++;
        //         list.add(activites[i][0]);
        //         lastend = activites[i][2];
        //     }
        // }

    }

}
