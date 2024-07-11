//109.

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

//Input
// arr: 23, 34, 45, 66, 1, 12
// target: 1

// Output
// Founded at the index of: 4

// Explaination:
//     1
// 66      12
// 45      23
//     34
// find the mid element of the array then check the mid with the start index value
// arr[i] <= arr[mid]
//     whether the mid value is greater than or equal to mid then, that part will be 
// [23,34,45,66] are one part of sorted element 
// or
// if arr is [23,34,45,1,2,12] then [1,2,12] is other part of sorted element
// then check the target value is under the sorted part of other 
// according to that change the starting and ending position.