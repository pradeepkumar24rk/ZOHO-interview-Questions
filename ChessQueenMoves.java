/**
 * ChessQueenMoves
 */
// import java.util.*;
public class ChessQueenMoves {

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int row = 5,col = 5;
        int sourceRow = 2, sourceCol = 1;
        int board[][] = {
            {0,0,0,0,0},
            {0,0,0,0,0},
            {0,1,0,0,0},
            {0,0,0,0,0},
            {0,0,0,0,0},
        };
        int drow = 1,dcol = 0;
        if(drow == sourceRow || sourceCol == dcol ) {
            System.out.println("valid");
        } 
        else if(drow+dcol == sourceRow+sourceCol || drow-dcol == sourceRow-sourceCol){
            System.out.println("valid");
        }
        else 
            System.out.println("not valid");
    }
}