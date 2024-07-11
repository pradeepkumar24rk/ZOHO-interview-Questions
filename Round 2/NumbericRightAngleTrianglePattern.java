import java.util.*;
public class NumbericRightAngleTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =5;
        for(int i=1;i<=n;i++) {
            for(int j=i;j<n;j++) {
                System.out.print("  ");
            }
            for(int j=i;j>=1;j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

// Input: 5

// Output:
//         1 
//       2 1 
//     3 2 1
//   4 3 2 1
// 5 4 3 2 1