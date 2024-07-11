// 48.
public class NumericDiamondPattern {
    public static void main(String[] args) {
        int n = 4, count = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            
            count+=i;
            for (int j = 1; j <= i; j++) {
            
                System.out.print(count+" ");
                if(j<i) count--; else count+=i-1;
            }
            System.out.println();
        }
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            
            for (int j = i; j <= n; j++) {
                System.out.print(count+" ");
                count--;
            }
            
            System.out.println();
        }
    }
}

// Input:
// n = 4

// Output:
//    1  
//   3 2
//  6 5 4
// 10 9 8 7
// 10 9 8 7 
//  6 5 4 
//   3 2 
//    1
   
// Explaination:
// First upperTriangle like reverse number printing
// Add the row value to count value minus each columns when last column is reached then add current row value - 1 (to reach the initial value)