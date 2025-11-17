package ArrayList;
import java.util.*;;

public class Questions {

    public static void swap(ArrayList<Integer> list, int idx1 ,int idx2){
        int temp = list.get(idx1);
        list.set(idx1 ,list.get(idx2));
        list.set(idx2 ,temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> listName = new ArrayList<>();
        listName.add(4);
        listName.add(2);
        listName.add(7);
        listName.add(9);
        listName.add(5);

        // 1. maximum number 
        int max=Integer.MIN_VALUE;  // o(n)
        for(int i=0;i<listName.size();i++){
            // if(listName.get(i) > max){
            //     max=listName.get(i);
            // }
            max= Math.max(max, listName.get(i));
        }
        System.out.println("maximum element:"+max);

        // 2. swap two numbers
        System.out.println(listName);
        swap(listName, 2,4);
        System.out.println(listName);

        // sorting
        System.out.println("sorting AL");
        Collections.sort(listName);
        System.out.println(listName);

        System.out.println("sorting in decending order");
        Collections.sort(listName, Collections.reverseOrder());
        System.out.println(listName);
    }
}

