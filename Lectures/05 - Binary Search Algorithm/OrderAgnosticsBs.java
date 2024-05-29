

public class OrderAgnosticsBs {
    public static void main(String[] args) {
        int [] arr = { 9,8,7,6,5,4,3,2,1};
        int target =4;
        int ans = orderAgnostics(arr,target);

    }
    // this method works both for acc and decc;
    static int orderAgnostics ( int [] arr, int target){
        int start = 0;
        int end = arr.length -1;
        // check if the array is accending or descending
        Boolean isAcc = (arr[start] < arr[end]) ;
//        System.out.println(isAcc);

        while (start <= end){
            int mid = start + (end - start )/2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAcc) {
                if ( target < arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }

            }else {
                if (target < arr[mid]) {
                    start = mid - 1;
                } else  {
                    end = mid + 1;
                }
            }
        }
        return -1;
    }

}
