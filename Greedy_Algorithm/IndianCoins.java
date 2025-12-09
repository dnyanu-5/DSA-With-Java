import java.util.*;

public class IndianCoins {
    public static void main(String[] args) {
        System.out.println("Indian Conanical Cion Systems");
   
        Integer coins[] = { 1, 2, 5, 10, 20, 50, 100, 500, 2000 };

        Arrays.sort(coins, Comparator.reverseOrder());

        ArrayList<Integer> arr = new ArrayList<>();
        
        int count = 0;
        int amount = 300;

        for (int i = 0; i < coins.length; i++) {
            if (coins[i] <= amount) {
                while (coins[i] <= amount) {
                    count++;
                    amount -= coins[i];
                    arr.add(coins[i]);
                }
            }
        }
        System.out.println("Total min coins and notes used="+count);
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
    }

}
