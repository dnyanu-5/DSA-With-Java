package ArrayList;

import java.util.*;

public class MultiAL {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> outerList = new ArrayList<>();

        //NOT NECESSARY TO HAVE SAME SIZE  

        ArrayList<Integer> innerList1 = new ArrayList<>();
        innerList1.add(1);
        innerList1.add(2);
        innerList1.add(3);
        innerList1.add(4);
        innerList1.add(5);

        outerList.add(innerList1);

        ArrayList<Integer> innerList2 = new ArrayList<>();
        innerList2.add(3);
        innerList2.add(6);
        innerList2.add(9);
        innerList2.add(12);
        innerList2.add(15);

        outerList.add(innerList2);

        ArrayList<Integer> innerList3 = new ArrayList<>();
        innerList3.add(5);
        innerList3.add(10);
        innerList3.add(15);
        innerList3.add(20);
        innerList3.add(25);

        outerList.add(innerList3);

        // for(int i=0;i<=5;i++){
        //     innerList1.add(i*1);
        //     innerList2.add(i*2);
        //     innerList3.add(i*3);
        // }

        // outerList.add(innerList1);
        // outerList.add(innerList2);
        // outerList.add(innerList3);


        for (int i = 0; i < outerList.size(); i++) {
            ArrayList<Integer> currList = outerList.get(i);

            for (int k = 0; k < currList.size(); k++) {
                System.out.print(currList.get(k) + " ");
            }
            System.out.println();
        }

        System.out.println(outerList);

    }

}
