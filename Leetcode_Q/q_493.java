public class q_493 {
    public static int solutionBruteForce(int nums[]) {
        int count = 0;
        int n = nums.length;
        // o(n2) not optimal
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] > 2 * nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int solutionMergeSort(int nums[], int low, int high) {
        int count = 0;

        if (low < high) {
            int mid = (low + high) / 2;
            count += solutionMergeSort(nums, low, mid);
            count += solutionMergeSort(nums, mid + 1, high);
            count += countPairs(nums, low, mid, high);
            merge(nums, low, mid, high);
        }
        return count;
    }

    public static int countPairs(int nums[], int low, int mid, int high) {
        int count = 0;
        int right = mid + 1;
        for (int i = low; i <= mid; i++) {
            while (right <= high && (long) nums[i] > 2L * nums[right]) {
                right++;
            }
            count += (right - (mid + 1));
        }
        return count;
    }

    public static void merge(int nums[], int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int i = low, j = mid + 1, k = 0;

        while (i <= mid && j <= high) {
            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }
        while (i <= mid)
            temp[k++] = nums[i++];
        while (j <= high)
            temp[k++] = nums[j++];

        System.arraycopy(temp, 0, nums, low, temp.length);
    }
    public static void main(String[] args) {
        int nums[] = { 1, 3, 2, 3, 1 };
        System.out.println(solutionBruteForce(nums));
        int low = 0;
        int high = nums.length - 1;
        System.out.println(solutionMergeSort(nums, low, high));
    }

}
