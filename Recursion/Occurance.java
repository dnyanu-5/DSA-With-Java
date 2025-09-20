package Recursion;

public class Occurance {

    public static void solution(int arr[],int key,int i){

        if(i==arr.length){
            return;
        }
        if(arr[i]==key){
            System.out.print(i+" ");
        }
        solution(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,2,5,4,2};
        solution(arr, 4, 0);
    }
    
}
