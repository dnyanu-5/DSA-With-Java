package Recursion;

public class Ocurrannce {
    // first occurance
    public static int firstsolution(int arr[], int i, int key) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstsolution(arr, i + 1, key);
    }

    // last occurance
    public static int lastsolution(int arr[], int i, int key) {

        if (i == arr.length) {
            return -1;
        }

        int isfound = lastsolution(arr, i + 1, key);
        if (isfound == -1 && arr[i] == key) {
            return i;
        }
        return isfound;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, 6, 8, 9, 5, 1 };
        System.out.println(firstsolution(arr, 0, 5));
        System.err.println(lastsolution(arr, 0, 5));
    }
}
