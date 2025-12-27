import java.util.HashSet;

public class setExamples {
    public static void main(String[] args) {
        int nums[] = { 4, 3, 2, 5, 6, 7, 3, 4, 2, 1 };
        HashSet<Integer> s = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
        s.add(nums[i]);
        }
        System.out.println(s);
        System.out.println(s.size());

        int s1[] = { 7, 3, 9 };
        int s2[] = { 6, 3, 9, 2, 9, 4 };

        HashSet<Integer> set = new HashSet<>();
        // union
        for (int i = 0; i < s1.length; i++) {
            set.add(s1[i]);
        }
        for (int i = 0; i < s2.length; i++) {
            set.add(s2[i]);
        }
        System.out.println(set);
        System.out.println("Union = " + set.size());

        // intersection
        set.clear();

        for (int i = 0; i < s1.length; i++) {
            set.add(s1[i]);
        }

        int count = 0;
        for (int i = 0; i < s2.length; i++) {
            if (set.contains(s2[i])) {
                count++;
                System.out.println(s2[i]);
                set.remove(s2[i]);
            }
        }
        System.out.println("Intersection = " + count);

    }
}
