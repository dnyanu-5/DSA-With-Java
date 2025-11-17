package ArrayList;

import java.util.ArrayList;

public class BasicOperations {
    public static void main(String[] args) {
        ArrayList<Integer> listName = new ArrayList<>();

        // 1 add element o(1)
        listName.add(1);
        listName.add(2);
        listName.add(3);
        listName.add(3, 4);
        System.out.println(listName);

        // loops on AL
        System.out.println("size of an AL:" + listName.size());

        for (int i = 0; i < listName.size(); i++) {
            System.out.print(listName.get(i) + " ");
        }
        System.out.println();

        System.out.println("reverse array");   // o(n)
        for (int i = listName.size() - 1; i >= 0; i--) {
            System.out.print(listName.get(i) + " ");
        }
        System.out.println();

        // 2 get element o(1)
        System.out.println(listName.get(2));

        // 3 remove element o(n)
        listName.remove(1);
        System.out.println(listName);

        // 4 set element o(n)
        listName.set(2, 2);
        System.out.println(listName);

        // 5 contains element
        System.out.println(listName.contains(2));
        System.out.println(listName.contains(22));

    }

}
