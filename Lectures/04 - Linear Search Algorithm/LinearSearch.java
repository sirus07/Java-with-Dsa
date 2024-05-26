package com.lectures;
public class LinearSearch {
    public static void main(String[] args) {
        int target = 10;
        int [] arr = { 12,3,5,6,7,7,777,18,10,3};
        int ans = LinearSearch(arr,target);        System.out.println(ans);
    }
    static int LinearSearch(int[] arr, int target){
        if (arr.length ==0) return -1;
        // run a loop
        for (int index = 0; index < arr.length; index++){
            int element = arr[index];
            if (element == target) return index;
        }
        return -1;
    }
}
