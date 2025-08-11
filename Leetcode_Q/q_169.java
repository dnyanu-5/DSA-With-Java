public class q_169 {

     public static int majorityElement(int arr[]) {

        int n = arr.length;
        int maxCount = n / 2;

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }
            if (count > maxCount) {
                return arr[i];
            }

        }
        return -1;

    }

    public static void main(String[] args) {

        int arr[] = { 2, 2,1,1,2,2 };
        int result = majorityElement(arr);
        System.out.println(result);

    }
    
}
