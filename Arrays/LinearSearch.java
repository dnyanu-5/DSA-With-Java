// find the index of the key in an array 

public class LinearSearch {

    public static int linearSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int arr[] = { 1, 22, 31, 47, 5, 90, 77, 56 };
        int key = 5;
        int result = linearSearch(arr, key);
        if(result==-1){
            System.out.println("Key not found in array!");
        }else{
            System.out.println("Key found in array at "+result);
        }
    }
}
