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
