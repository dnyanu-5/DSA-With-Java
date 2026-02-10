import java.util.Stack;

public class q_84 {

    public static int largestRectangle(int heights[]) {
        int n = heights.length;
        int maxArea = 0;
        int nextleft[] = new int[heights.length];
        int nextright[] = new int[heights.length];

        Stack<Integer> s = new Stack<>();

        // next right
        for (int i = n - 1; i >= 0; i--) {

            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nextright[i] = heights.length;
            } else {
                nextright[i] = s.peek();
            }
            s.push(i);
        }
        // next left
        for (int i = 0; i < n; i++) {

            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nextleft[i] =-1;
            } else {
                nextleft[i] = s.peek();
            }
            s.push(i);
        }
        for (int i = 0; i < n; i++) {
            int height = heights[i];
            int width = nextright[i] - nextleft[i] - 1;
            int curArea = height * width;
            maxArea = Math.max(maxArea, curArea);
        }
        return maxArea;

    }
    public static void main(String[] args) {
        int heights[] = { 1};
        System.out.println(largestRectangle(heights));
    }
}
