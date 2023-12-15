public class SortedAndRotatedArray {

    static String findingValue(int arr[], int target) {
        int i = 0, j = arr.length - 1;
        while(i<=j) {
            int mid = (i+j)/2;
            if(arr[mid] == target){
                return "Founded at the index of: "+mid;
            }
            if(arr[i] <= arr[mid]) {
                if((target >= arr[i]) && (target <= arr[mid]) )
                    j = mid - 1;
                else
                    i = mid + 1;
            } else {
                if((target >= arr[mid]) && (target <= arr[j])) 
                    i = mid + 1;
                else
                    j = mid - 1;
            }
        }
        return "Not Founded";
    }
    public static void main(String[] args) {
        int arr[] = { 23, 34, 45, 66, 77, 1, 12 };
        int target = 1;
        System.out.println(findingValue(arr, target));
    }
}
