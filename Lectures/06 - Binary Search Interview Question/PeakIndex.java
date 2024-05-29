public class PeakIndex {
    public static void main(String[] args) {
        int [] dec = { 9,8,7,6,5,4,3,2,1};
        int []  acc = { 1,2,3,4,5,6,7,8,9};
//        System.out.println(peak(dec));
        System.out.println(peak(acc));
    }
    static int peak(int [] arr) {
        int start =0;
        int end = arr.length-1;
        while ( start < end ){
            int mid = start + (end - start )/2;
            if ( arr[mid] > arr[mid + 1]){
                end = mid ;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }
}
