import java.util.Arrays;

public class SearchIn2dArray {
    public static void main(String[] args) {
    int[][] arr = {
            {5,6,7 },
            {45,3,435},
            {35,355,23}
    };
    int target = 45;
//    int[] ans = findTarget(arr);
//        System.out.println(Arrays.toString(ans));
//        System.out.println(ans); // If you use this it gives you result in this form [I@7b23ec81
        System.out.println(findMin(arr));

    }
    static  int[] findTarget(int [][] arr, int target){
        for (int row = 0; row<arr.length;row++){
            for (int col = 0; col< arr[row].length;col++){
                if (arr[row][col] == target) {

                  return new int[] {row,col};   /* new int[] why we use this? --> The answer is above you created the array with that type of format so java understood that you're assigning an array but here it didn't
                       understand so we created an object for it. */
                }
            }
        }
        return new int[] {0};
    }
    static  int findMin(int [][] arr){
        int max = Integer.MIN_VALUE;
        for (int row = 0; row<arr.length;row++){
            for (int col = 0; col< arr[row].length;col++){
                if (arr[row][col] > max) {
                    max = arr[row][col];
                   /*  return new int[] {row,col}; new int[] why we use this? --> The answer is above you created the array with that type of format so java understood that you're assigning an array but here it didn't
                       understand so we created an object for it. */
                }
            }
        }
        return max;
    }
}
