/**
 * ChessQueenMoves
 */
// import java.util.*;
public class ChessQueenMoves {

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int row = 5, col = 5;
        int sourceRow = 2, sourceCol = 1;
        int board[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == sourceRow && j == sourceCol)
                    board[i][j] = 1;
                else
                    board[i][j] = 0;
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int drow = 1, dcol = 0;
        if (drow == sourceRow || sourceCol == dcol || drow + dcol == sourceRow + sourceCol
                || drow - dcol == sourceRow - sourceCol) {
            System.out.println("valid");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (i == drow && j == dcol)
                        board[i][j] = 1;
                    else
                        board[i][j] = 0;
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
        } else
            System.out.println("not valid");
    }
}