// 112. 
public class NumericPattern {

    public static void main(String[] args) {
        int n = 6,o = 1,e = 2;
        for(int i = 1;i<=n;i++) {
            for(int j=i;j<n;j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i ;j++) {
                if(i%2 == 0){
                    System.out.print(e+" ");
                    e+=2;
                } else {
                    System.out.print(o+" ");
                    o+=2;
                }
            }
            System.out.println();
        }
    }
}

// Input:
// 6

// Output
//                 1 
//               2 4 
//             3 5 7 
//         6 8 10 12 
//     9 11 13 15 17 
// 14 16 18 20 22 24

// Explaination:
// Each row the number is increased by 2
// if row is odd then the row should contain odd number of series
// if row is even then the row should contain even number of series