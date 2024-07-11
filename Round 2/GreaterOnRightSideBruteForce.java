public class GreaterOnRightSideBruteForce {
    public static void main(String[] args) {
        int arr[] = { 2, -1, 0, -1, 3 };
        int n = arr.length, index = 0, flag = 0, min = Integer.MAX_VALUE;
        while (index < n) {
            for (int i = index + 1; i < n; i++) {
                if (arr[i] > arr[index]) {
                    if (arr[i] - arr[index] < min) {
                        min = arr[i] - arr[index];
                        // System.out.println(min);
                        flag = 1;
                    }
                }
            }
            // System.out.println(flag);
            if (flag == 0) {
                arr[index] = -1;
            } else {
                arr[index] = min + arr[index];
            }
            index++;
            flag = 0;
            min = Integer.MAX_VALUE;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
