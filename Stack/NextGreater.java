package Stack;
import java.util.Stack;

public class NextGreater {
    public static void main(String[] args) {
        int arr[] = { 6, 8, 0, 1, 3 };
        int nextG[] = new int[arr.length];

        Stack<Integer> s = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {

            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }

            if (s.isEmpty()) {
                nextG[i] = -1;
            } else {
                nextG[i] = arr[s.peek()];
            }
            s.push(i);
        }

        for(int i=0;i<nextG.length;i++){
            System.out.print(nextG[i]+" ");
        }

    }

}
