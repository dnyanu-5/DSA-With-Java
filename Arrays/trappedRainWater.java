public class trappedRainWater {
    public static void waterLevel(int arr[]) {
        int n = arr.length;
        int leftMax[] = new int[n];
        int rightMax[] = new int[n];

        // Fill leftMax[]
        leftMax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], arr[i]);
        }

        // Fill rightMax[]
        rightMax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], arr[i]);
        }

        // Calculate trapped water
        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel - arr[i];
        }

        System.out.println("Total trapped water is: " + trappedWater);
    }
    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        waterLevel(height);
    }
}
