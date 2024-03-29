public class NumberStaircase {
    public static void main(String[] args) {
        int n = 5,count = 1,flag =1;
        for (int i = 1; i <= n; i++) {
            count=flag;
            for (int j = 1; j <= n; j++) {
                    count = count>n? count-n:count;
                    System.out.print(count + " ");
                    count++;
            }
            flag++;
            System.out.println();
        }
    }
}

// Input: 5

// Output:
// 1 2 3 4 5 
// 2 3 4 5 1 
// 3 4 5 1 2
// 4 5 1 2 3
// 5 1 2 3 4