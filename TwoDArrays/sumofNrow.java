package TwoDArrays;

public class sumofNrow {

    public static void sumOf2Row(int arr[][]){

        int sum =0;
        int m = arr[0].length;
        for (int j = 0; j < m; j++) {
            sum+=arr[1][j];
            }

            System.out.println("sum of 2nd row is:"+sum);
        }


    public static void main(String[] args) {
        
        int arr[][] ={{1,2,3},{3,4,5},{2,3,4}};
        sumOf2Row(arr);
    }
    
}
