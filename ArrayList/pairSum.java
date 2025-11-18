package ArrayList;
import java.util.ArrayList;

public class pairSum {
    // o(n^2)
    public static boolean pairSum1(ArrayList<Integer> list, int target) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == target) {
                    return true;
                }
                System.out.println();
            }
        }
        return false;
    }
    // o(n)
    public static boolean pairSum1Optimize(ArrayList<Integer> list, int target) {

        int lp = 0;
        int rp = list.size() - 1;

        while (lp < rp) {
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            } else if (list.get(lp) + list.get(rp) < target) {
                lp++;
            } else {
                rp--;
            }
        }
        return false;
    }
    // pair sum for sorted and rotated AL using mod    O(n)
    public static boolean pairSum2(ArrayList<Integer> list, int target) {

        int bp = -1;
        int n = list.size();
        for (int i = 0; i < list.size()-1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                bp = i;
                break;
            }
        }
        int lp = bp + 1;
        int rp = bp;

        while (lp != rp) {
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            } else if (list.get(lp) + list.get(rp) < target) {
                lp = (lp + 1) % n;
            } else {
                rp = (n + rp - 1) % n;
            }
        }
        return false;
    }
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int target = 6;
        System.out.println(pairSum1(list, target));

        System.out.println(pairSum1Optimize(list, target));

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(11);
        list1.add(15);
        list1.add(6);
        list1.add(8);
        list1.add(9);
        list1.add(10);

        int target1 = 16;
        System.out.println(pairSum2(list1, target1));

    }

}
