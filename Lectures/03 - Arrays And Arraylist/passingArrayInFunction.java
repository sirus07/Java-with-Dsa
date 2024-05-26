package com.lectures;

import java.util.Arrays;

public class passingArrayInFunction {
    public static void main(String[] args) {
        int [] nums = { 2,3,4,5,6};
        System.out.println(Arrays.toString(nums)); // You want to print array without using loop then you have to use arrays.toString  
        //otherwise it gives result in other language forms 
        // System.out.println(nums);
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change (int [] arr){
        arr[0]  = 99;
    }
}
