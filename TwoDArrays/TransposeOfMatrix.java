package TwoDArrays;

public class TransposeOfMatrix {

    public static void printMatrix(int arr[][]){
        System.out.println("The matrix is:");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.err.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int row=2;
        int col=3;
        int matrix[][] ={{1,2,3},{4,5,6}};
        printMatrix(matrix);

        int transpose[][] = new int[col][row];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                transpose[j][i] = matrix[i][j];
            }
        }

        printMatrix(transpose);

    }
    
}
