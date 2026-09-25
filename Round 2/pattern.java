//You need to print the pattern for this question 
//EX: num = 5
//Excepted output:
// 1
// 2 6 
// 3 7 10
// 4 8 11 13
// 5 9 12 14 15

public class pattern {

    public void Pattern(int num) {
        int num1 = 1;

        for (int i = num; i > 0; i--) {
            int diff = num - 1;
            int temp = num1;
            for (int j = i; j <= num; j++) {
                System.out.print(temp + " ");
                temp += diff;
                diff--;
            }

            num1++;
            System.out.println();
        }
    }
}
