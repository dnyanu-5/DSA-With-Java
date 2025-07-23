package TwoDArrays;
import java.util.Scanner;

public class BasicsOf2D {

    public static void search(int matrix[][],int key){
        int n= matrix.length;
        int m= matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j] == key){
                    System.out.println("key found at"+i+","+j);
                }
            }
        }
         System.out.println("key not found");   
    }

     public static void maxVal(int matrix[][]){
        int n= matrix.length;
        int m= matrix[0].length;
        int maxVal= Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j] > maxVal){
                    maxVal= matrix[i][j];
                }
            }
        }
        System.out.println("the maximum element is 2d arrays is:"+maxVal);
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[][]=new int[3][3];
        int n= matrix.length;
        int m= matrix[0].length;
        int key=2;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
         for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.err.println();
        }
        search(matrix, key);
        maxVal(matrix);

        sc.close();
    }
    
}
