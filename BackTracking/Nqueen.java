package BackTracking;

public class Nqueen {

    //1 all solution
    public static boolean isSafe(char chessBoard[][], int row, int col) {
        // up
        for (int i = row - 1; i >= 0; i--) {
            if (chessBoard[i][col] == 'Q') {
                return false;
            }
        }
        // diagonally left up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (chessBoard[i][j] == 'Q') {
                return false;
            }
        }
        // diagonally right up
        for (int i = row - 1, j = col + 1; i >= 0 && j < chessBoard.length; i--, j++) {
            if (chessBoard[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static boolean nQueen(char chessBoard[][], int row) {
        // base case
        if (row == chessBoard.length) {
            printBoard(chessBoard);
            //2 number of ways 
            countWays++;
            return true;
        }

        // place queen in each row
        for (int j = 0; j < chessBoard.length; j++) {
            if (isSafe(chessBoard, row, j)) {
                chessBoard[row][j] = 'Q';
                if(nQueen(chessBoard, row + 1)){
                    return true;
                }
                //3 only one solution
                chessBoard[row][j] = 'X';
            }
        }
        return false;
    }
    public static void printBoard(char arr[][]) {
        System.out.println("----------- Chess Board -------------");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int countWays=0;
    public static void main(String[] args) {
        int n = 4;
        char chessBoard[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                chessBoard[i][j] = 'X';
            }
        }
        //1
        // nQueen(chessBoard, 0);
        // //2 
        // System.out.println("Total ways to solve N-Queen "+countWays);
        //3 
        if(nQueen(chessBoard, 0)){
            System.out.println("solution is possible");
            printBoard(chessBoard);
        }else{
            System.out.println("solution is not possible");
        }

    }

}
