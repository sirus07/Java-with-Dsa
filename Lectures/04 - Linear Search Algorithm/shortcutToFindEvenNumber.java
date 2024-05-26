public class shortcutToFindEvenNumber {
    public static void main(String[] args) {
        int [] arr = { 1,22,344,234,4,54,34,234};
        System.out.println(findEven(arr));
    }
    static int findEven (int [] nums){
        int count = 0;
        for (int elements : nums){
            if (evenNumber(elements)){
                count++;
            }
        }
        System.out.print("Even numbers is: ");
        return count;
    }
    public static boolean evenNumber(int nums) {
        int numberOfDigits = digit(nums);
        /*
       if ( numberOfDigits % 2 ==0) return true;
        return false;
         */
        return numberOfDigits % 2 ==0 ; // This is a short cut


    }
    static int digit (int nums){
        if (nums < 0){
            nums = nums * -1;
        }
        return (int)(Math.log10(nums)) + 1; // shortcut to find number of digits
    }
}
