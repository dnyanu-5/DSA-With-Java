// Largest number in an array 

public class Large_and_Small_Number {

    public static int LargestNumber(int arr[]) {
        int largeNum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largeNum) {
                largeNum = arr[i];
            }
        }
        return largeNum;
    }

    public static int SmallestNumber(int arr[]) {
        int SmallNum = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < SmallNum) {
                SmallNum = arr[i];
            }
        }
        return SmallNum;
    }

    public static void main(String[] args) {
        int array[] = { 23, 45, 78, 98, 34, 10, 55 };
        System.out.println("The largest number in an array is:" + LargestNumber(array));

        System.out.println("The smallest number in an array is:" + SmallestNumber(array));

    }

}
