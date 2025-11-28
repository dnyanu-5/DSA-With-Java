package Stack;

import java.util.Stack;

public class HistrogramArea {
    public static void HistArea(int arr[]) {
        int maxArea = 0;
        int nextR[] = new int[arr.length];
        int nextL[] = new int[arr.length];

        // next smaller right
        Stack<Integer> s = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {

            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nextR[i] = arr.length;
            } else {
                nextR[i] = s.peek();
            }
            s.push(i);
        }
        // next smaller left
        s = new Stack<>();
        for (int i = 0; i < arr.length; i++) {

            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nextL[i] = arr.length;
            } else {
                nextL[i] = s.peek();
            }
            s.push(i);
        }
        // current area
        for (int i = 0; i < arr.length; i++) {
            int height = arr[i];
            int width = nextR[i] - nextL[i] - 1;
            int curArea= height*width;
            maxArea= Math.max(maxArea, curArea);
        }

        System.out.println("max area in histogram is :" + maxArea);
        
    }
    public static void main(String[] args) {
        System.out.println("Max area in histogram");
        int heights[] = { 2, 1, 5, 6, 2, 3 };
        HistArea(heights);
    }

}
