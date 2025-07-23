package TwoDArrays;

public class DaigonalSum {

    public static int daigonal(int matrix[][]){
        int sum =0;

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i==j){
                    sum+=matrix[i][j];
                }else if(i+j ==matrix.length-1){
                    sum+=matrix[i][j];
                }
            }
        }
        return sum;
    }
    public static int OptimizedDaigonalSum(int matrix[][]){
        int sum =0;
        for(int i=0;i<matrix.length;i++){
            sum+=matrix[i][i];
            if(i!= matrix.length-1-i){
                sum+=matrix[i][matrix.length-1-i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        int result = daigonal(matrix);    //TC o(n)^2
        System.out.println(result);
        int res= OptimizedDaigonalSum(matrix);  //TC o(n)
        System.out.println(res);
    } 
}
