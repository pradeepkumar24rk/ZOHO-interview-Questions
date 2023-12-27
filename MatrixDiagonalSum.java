// 34.
public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int row = 3, col = 3, upperTriangle = 0, lowerTriangle = 0;
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (j <= col - (i + 1))
                    upperTriangle += arr[i][j];
                if (j >= col - (i + 1))
                    // System.out.print(arr[i][j]+" ");
                    lowerTriangle += arr[i][j];
            }
        }
        System.out.println(upperTriangle + " " + lowerTriangle);
        System.out.println(upperTriangle > lowerTriangle ? upperTriangle : lowerTriangle);
    }
}

// Input:
// 3 3
// 1 2 3
// 4 5 6
// 7 8 9

// Output:
// 38

// Explaination:
// split the matrix by diagonal from top right to bottom left
// sum the two triangle and then find greater value 
// upperTriangle = 1 2 3
//                 4 5
//                 7
//                 1+2+3+4+5+6+7 = 22

// lowerTriangle =     3
//                   5 6
//                 7 8 9
//                 3+5+6+7+8+9 = 38
// The greater value is lowerTriangle


