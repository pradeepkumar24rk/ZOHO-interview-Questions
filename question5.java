public class ZigZagMatrix {
    public static void printZigZag(int[][] matrix) {
        int n = matrix.length;        // Rows
        int m = matrix[0].length;     // Columns

        for (int d = 0; d < n + m - 1; d++) {
            // If even, move upwards (↗)
            if (d % 2 == 0) {
                int row = Math.min(d, n - 1);
                int col = d - row;
                while (row >= 0 && col < m) {
                    System.out.print(matrix[row][col] + " ");
                    row--;
                    col++;
                }
            }
            // If odd, move downwards (↙)
            else {
                int col = Math.min(d, m - 1);
                int row = d - col;
                while (col >= 0 && row < n) {
                    System.out.print(matrix[row][col] + " ");
                    row++;
                    col--;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        printZigZag(matrix);
    }
}
