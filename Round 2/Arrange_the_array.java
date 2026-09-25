// In this question you need to rearrange the given array by even numbers
// in front and odd number in back 
// EX: [2,3,4,5,6,7,8] -> excepted output [2,4,6,8,3,5,7]
//Note: The order of the array is do not matter and you did not use new array to solve this problem 
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
