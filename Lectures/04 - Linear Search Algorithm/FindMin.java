public class FindMin {
    public static void main(String[] args) {
    int []arr = { 1,2,4,5,6,7,8,9,};
        System.out.println(findMin(arr));
    }
    static int findMin(int [] arr){
        int ans = arr[0];
        for (int i = 0; i< arr.length;i++){
            if ( arr[i] < ans){
                ans = arr[i];
            }
        }
        System.out.print("Minimum number of array is ");
        return ans;
    }
}
