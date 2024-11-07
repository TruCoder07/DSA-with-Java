// 22 Backtracking
public class Backtracking{
    
    public static boolean isSafe(char board[][], int row, int col){

        // Vertically Up
        for (int i = row-1; i >= 0; i--) {
            if ( board[i][col]=='Q') {
                return false;
            }
        }

        // diag left up

        for (int i = row-1, j = col-1; i >= 0 && j >= 0; i--,j--) {
            if (board[i][j] =='Q') {
                return false;
            }
        }

        // diag left up

        for (int i = row-1, j = col+1; i >= 0 && j < board.length; i--,j++) {
            if (board[i][j] =='Q') {
                return false;
            }
        }

        return true;
    } 

    public static void nQueens(char board[][], int row){
        if (row == board.length) {
            // printBoard(board);
            count++;
            return;
        }
        for (int i = 0; i < board.length; i++) {
            if (isSafe(board, row, i)) {
                board[row][i] = 'Q';
                nQueens(board, row+1);
                board[row][i] = '_';
            }
        }
    }

    //N Queeen print 1 Solution
    public static boolean nQueens1sol(char board[][], int row){
        if (row == board.length) {
            // printBoard(board);
            count++;
            return true;
        }
        for (int i = 0; i < board.length; i++) {
            if (isSafe(board, row, i)) {
                board[row][i] = 'Q';
                if(nQueens1sol(board, row+1)){
                    return true;
                }
                board[row][i] = '_';
            }
        }
        return false;
    }
    
    public static void printBoard(char board[][]){
        System.out.println("---------Chess Boars---------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    static int count=0;
    public static void main(String[] args) {
        int n = 2;
        char board[][] = new char [n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '_';
            }
            
        }
        // nQueens(board, 0);
        // System.out.println("The total to solve n queen = "+count);

        if (nQueens1sol(board, 0)) {
            System.out.println("Solution is Possible...");
            printBoard(board);
        }else{
            System.out.println("Solution is Not Possible...");
        }
    }
}
