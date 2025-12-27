import java.util.*;

public class linkedHashmap {
    public static void main(String[] args) {
        //order wise insertion --> maintains order ,same functions as hashmap 

        LinkedHashMap<String, Integer> hp = new LinkedHashMap<>();

        hp.put("India", 100);
        hp.put("China", 150);
        hp.put("Indonesia", 90);

        System.out.println(hp);

        TreeMap<String, Integer> ht = new TreeMap<>(); 
        // keys are sorted
        ht.put("India", 100);
        ht.put("China", 150);
        ht.put("Us", 90);
        ht.put("Bhutan", 100);
        ht.put("Peru", 150);
        ht.put("Malesia", 90);

        System.out.println(ht);
    }
}
