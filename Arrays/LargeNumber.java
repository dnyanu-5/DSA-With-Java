// Largest number in an array 
import java.util.*;
public class LargeNumber {

    public static int LargestNumber(int arr[]) {
        int largeNum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > largeNum){
                largeNum = arr[i];
            }
        }
        return largeNum;
    }

    public static void main(String[] args) {
        int array[] = { 23, 45, 78, 98, 34,10, 55 };
        System.out.println("The largest number in an array is:"+ LargestNumber(array));

    }

}
