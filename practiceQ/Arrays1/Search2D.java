package practiceQ.Arrays1;

public class Search2D {

    public static boolean solution(int arr[][],int target){
        int row=0;
        int col= arr[0].length -1;

        while(row<arr.length && col>=0){
            if(arr[row][col]==target){
                return true;
            }
            else if(target<arr[row][col]){
                col--;
            }else{
                row++;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        int arr[][]={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.err.println(solution(arr, 13));
    }
}
