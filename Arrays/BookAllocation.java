public class BookAllocation {

    public static boolean isValid(int arr[], int s, int maxPage) {
        int student = 1;
        int page = arr[0];
        for (int i = 1; i < arr.length; i++) {
            page += arr[i];
            if (page > maxPage) {
                student++;
                page = arr[i];
            }                                       //O(logN*n)
        }
        return (student <= s);
    }

    public static int allocateBooks(int arr[], int s) {
        int n = arr.length;
        if (s > n) {
            return -1;
        }
        int min = 0;
        int max = arr[0];
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            max += arr[i];
        }
        while (min <= max) {
            int mid = min + (max - min) / 2;
            if (isValid(arr, s, mid)) {
                ans = mid;
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return ans;
    }    
    public static void main(String[] args) {
        int book[] = { 15,17,20};
        int s = 2;
        int result = allocateBooks(book, s);
        System.out.println(result);
    }
}
