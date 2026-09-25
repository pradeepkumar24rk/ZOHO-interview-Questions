//In this question you need to pick the first and second maximum occurance in the sorted array(ascending order)
// EX: [1,1,1,1,1,3,3,3,5,5,6,6,7,9,9]
// excepted output :
// First maximum: 1
// Second maximum: :3


public class First_second_ocuurance{
public static void findMaxOccurrences(int[] arr) {
    int firstNum = -1;
    int secondNum = -1;

    int firstFreq = 0;
    int secondFreq = 0;

    int count = 1;

    for (int i = 1; i <= arr.length; i++) {

        if (i == arr.length || arr[i] != arr[i - 1]) {

            int currentNum = arr[i - 1];
            int currentFreq = count;

            if (currentFreq > firstFreq) {

                secondFreq = firstFreq;
                secondNum = firstNum;

                firstFreq = currentFreq;
                firstNum = currentNum;
            }

            else if (currentFreq > secondFreq) {

                secondFreq = currentFreq;
                secondNum = currentNum;
            }

            count = 1;
        }
        else {
            count++;
        }
    }

    System.out.println("First maximum: " + firstNum);
    System.out.println("Second maximum: " + secondNum);
 }
}