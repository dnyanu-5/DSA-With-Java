public class countInversion {

    public static int bruteForceApproch(int nums[]) {
        int count = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] > nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int mergrSort(int nums[], int low, int high) {
        int count = 0;

        if (low < high) {
            int mid = low + (high - low) / 2;
            count += mergrSort(nums, low, mid);
            count += mergrSort(nums, mid + 1, high);
            count += merge(nums, low, mid, high);
            return count;
        }
        return 0;
    }

    public static int merge(int nums[], int low, int mid, int high) {

        int temp[] = new int[high - low + 1];
        int i = low;
        int j = mid + 1;
        int k = 0;
        int count=0;

        while (i <= mid && j <= high) {
            if (nums[i] < nums[j]) {
                temp[k++] = nums[i++];
            } else {   //arr[i] > arr[j] inversion case
                temp[k++] = nums[j++];
                count+=(mid-i+1);
            }
        }

        while (i <= mid) {
            temp[k++] = nums[i++];
        }

        while (j <= high) {
            temp[k++] = nums[j++];
        }

        System.arraycopy(temp, 0, nums, low, temp.length);

        return count;
    }
    public static void main(String[] args) {
        int nums[] = { 6, 3, 5, 2, 7 };
        System.out.println(bruteForceApproch(nums));

        int result = mergrSort(nums, 0, nums.length-1);
        System.out.println(result);
    }

}
