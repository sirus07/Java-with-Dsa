import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
//    int [] arr = { 1,2,3,4,5,6,7,8,9};
    int [] arr = { 9,8,7,6,5,4,3,2,1};


        /*
    int [] arr1 = { 34,435,-234,1,74443,35};
        Arrays.sort(arr1);
        System.out.println("\nThe sorted array is: ");
        for (int num : arr1) {
            System.out.print(num + " ");
        }
        System.out.println(Arrays.toString(arr1));
*/


    int target =4;
    int ans = binarySearch(arr,target);
    int ans1 = binarySearchInDes(arr,target);
        System.out.println(ans1);
    }
    // This is for accending order

    static int binarySearch ( int [] arr, int target){
        int start = 0;
        int end = arr.length -1;
        while (start <= end){
            int mid = start + (end - start )/2;
            if ( target < arr[mid]){
                end = mid - 1;
            }else if ( target > arr[mid]){
                start = mid + 1;
            }else return  mid;
        }
        return -1;
    }
    // This is for descending order
    static int binarySearchInDes ( int [] arr, int target){
        int start = 0;
        int end = arr.length -1;
        while (start <= end){
            int mid = start + (end - start )/2;
            if ( target < arr[mid]){
                start = mid - 1;
            }else if ( target > arr[mid]){
                end = mid + 1;
            }else return  mid;
        }
        return -1;
    }
}
