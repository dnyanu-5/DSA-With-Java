import java.util.*;

public class hashSet {
    public static void main(String[] args) {
        HashSet<Integer> s = new HashSet<>();
        s.add(1);
        s.add(2);
        s.add(1);
        s.add(3);
        s.add(5);
        s.add(8);
        System.out.println(s);

        System.out.println(s.size());

        System.out.println(s.isEmpty());

        System.out.println(s.contains(2));
        System.out.println(s.contains(12));

        System.out.println(s.remove(1));
        s.clear();
        System.out.println(s);

        HashSet<String> sm = new HashSet<>();
        sm.add("pune");
        sm.add("thane");
        sm.add("nashik");
        sm.add("mumbai");

        java.util.Iterator<String> it = sm.iterator();
        System.out.println("Using iterator");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("usig for each or advanced for loop");
        for(String str:sm){
            System.out.println(str);
        }
    }
}
