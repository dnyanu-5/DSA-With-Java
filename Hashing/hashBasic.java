import java.util.HashMap;
import java.util.Set;

public class hashBasic {
    public static void main(String[] args) {
        HashMap<String, Integer> hp = new HashMap<>();
        hp.put("India", 100);
        hp.put("China", 150);
        hp.put("Indonesia", 90);
        System.out.println(hp);
        System.out.println(hp.get("India"));  // present

        System.out.println(hp.get("US"));   //not present

        System.out.println(hp.containsKey("US"));
        System.out.println(hp.containsKey("India"));

        System.out.println(hp.remove("China"));  // returns value of key

        System.out.println(hp.size());

        System.out.println(hp.isEmpty());

        hp.clear();  // clear hashmap

        System.out.println(hp);

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 80);
        hm.put("Peru", 10);
        hm.put("Bhutan", 40);
        hm.put("Indonesia", 90);

        Set<String> keys =hm.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println("keys="+k+",values="+hm.get(k));
        }

    }

}