public class EvenDigits {
    public static void main(String[] args) {
    int [] arr = { 1,22,344,234,4,54,34,234};
        System.out.println(findnumber(arr));
    }
    static int findnumber (int [] nums){
        int count = 0;
        for (int elements : nums){
            if (even(elements)){

                count++;
            }
        }
        System.out.println("Even numbers is: ");
        return count;
    }

    public static boolean even(int nums) {
        int numberOfDigits = digits(nums);
        /*
       if ( numberOfDigits % 2 ==0) return true;
        return false;
         */
        return numberOfDigits % 2 ==0 ; // This is a short cut


    }
    static int digits(int nums){
        int count = 0;
        while (nums > 0) {
            count++;
            nums /= 10;
        }
        return count;
    }
}
