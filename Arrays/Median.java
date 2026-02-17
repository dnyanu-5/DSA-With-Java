import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Median {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> merged = new ArrayList<>();
        for (int num : nums1) {
            merged.add(num);
        }
        for (int num : nums2) {             //time ->O((m+n)log(m+n))	   and space //O(m+n)
            merged.add(num);
        }
        Collections.sort(merged);
        double median;
        int totalSize = merged.size();
        if (totalSize % 2 == 0) {
            median = (merged.get(totalSize / 2) + merged.get(totalSize / 2 - 1)) / 2.0;
        } else {
            median = merged.get(totalSize / 2);
        }
        return median;
    }
    public static void main(String[] args) {
        int num1[] = { 1, 2 };
        int num2[] = { 3};
        double median=findMedianSortedArrays(num1, num2);
        System.out.println("edian of 2 sorted array is:"+median);

    }

}
