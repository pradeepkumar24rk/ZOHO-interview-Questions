public class GreaterOnRightSide {
    static void nextGreatest(int arr[], int n) {
        int max = -1;
        int temp = 0;
        for(int i = n-1; i>=0;i--) {
            temp = arr[i];
            if(i == n-1){
                arr[i] = -1;
                max = Math.max(max,temp);
                continue;
            }
            arr[i] = max;
            max = Math.max(max,temp);
        }
    }
    public static void main(String[] args) {
        int arr[] = {16, 17, 4, 3, 5, 2};
        int n = arr.length;
        nextGreatest(arr, n);
        for(int i = 0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
}

// Input:
// N = 6
// Arr[] = {16, 17, 4, 3, 5, 2}
// Output:
// 17 5 5 5 2 -1
// Explanation: For 16 the greatest element 
// on its right is 17. For 17 it's 5. 
// For 4 it's 5. For 3 it's 5. For 5 it's 2. 
// For 2 it's -1(no element to its right). 
// So the answer is 17 5 5 5 2 -1