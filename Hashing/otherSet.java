import java.util.LinkedHashSet;
import java.util.TreeSet;

public class otherSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> s = new LinkedHashSet<>();
        s.add(1);
        s.add(2);
        s.add(1);
        s.add(3);
        System.out.println(s);

       TreeSet<Integer>t= new TreeSet<>();
       t.add(1);
       t.add(2);
       t.add(9);
       t.add(0);
       t.add(7);
       System.out.println(t);

    }
    
}
