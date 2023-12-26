// 21.
public class SnakePattern {
    public static void main(String[] args) {
        int n = 4, count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(count + " ");
                if (i % 2 == 0 && j != n)
                    count -= 1;
                else if (i % 2 != 0 && j != n)
                    count += 1;
            }
            count += n;
            System.out.println();
        }
    }
}

// Input:
// n = 4

// Output:
// 1   2   3   4
// 8   7   6   5
// 9   10  11  12
// 16  15  14  13

// Explaination:

// for the snake pattern consider the old row and even two calculate the action
// the last column of each row is increased by the given size(4) of the pattern
// odd number row each element is increased by 1 and 
// even number row each element is decreased by 1.