public class Arrange_the_array {
    public void arr(int[] arr) {

        int j = -1, i = 0;

        for (i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0 && j == -1) {
                j = i;
            }
            if (arr[i] % 2 == 0 && j < arr.length - 1 && j != -1) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
            }
        }
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
