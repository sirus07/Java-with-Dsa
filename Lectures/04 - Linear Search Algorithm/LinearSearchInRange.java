import java.util.Stack;

public class LinearSearchInRange {
    public static void main(String[] args) {
        int[] arr= { 1,23,4,5,65,6,6,67};
        int target = 5;
        int start = 1;
        int end = 5;
        System.out.println(searchInRange(arr,target,start,end));
    }
    static int searchInRange( int[] arr, int target, int start , int end){
        if ( arr.length == 0 ) return -1;
        for (int index = start; index <= end; index++){
            int element = arr[index];
            if(element == target){
                System.out.print("your target index is ");
                return index;
            }
        }

        return -1;
    }
}
