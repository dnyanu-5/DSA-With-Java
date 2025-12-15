import java.util.*;

public class Chocola {
    public static void main(String[] args) {
        System.out.println("Chocola Problem");
        // int n = 4;
        // int m = 6;
        Integer costver[] = { 2, 1, 3, 1, 4 };
        Integer costhor[] = { 4, 1, 2 };

        // sort
        Arrays.sort(costhor, Collections.reverseOrder());
        Arrays.sort(costver, Collections.reverseOrder());

        // variables
        int hp = 1;
        int vp = 1;
        int h= 0;
        int v=0;
        int cost = 0;

        while (h < costhor.length && v < costver.length) {
            if (costhor[h] >= costver[v]) {
                cost += (costhor[h] * vp);
                hp++;
                h++;
            } else {
                cost += (costver[v] * hp);
                vp++;
                v++;
            }
        }
        while (h < costhor.length) {
            cost += (costhor[h] * vp);
            hp++;
            h++;
        }
        while(v < costver.length){
            cost += (costver[v] * hp);
            vp++;
            v++;
        }
        System.out.println("Minimum cost of cutes is:"+cost);

    }

}
