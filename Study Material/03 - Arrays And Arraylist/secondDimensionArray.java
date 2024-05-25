import java.util.Arrays;

public class secondDimensionArray {
    public static void main(String[] args) {
        /* 
            1 2 3
            4 5 6
            7 8 9
         */
        // int [][] arr = new int [3][]; row size is mandatory.
        int [][] arr2d = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        // for ( int row = 0 ; row < arr2d.length; row++){
        //     for (int col = 0; col < arr2d[row].length; col++){
        //         System.out.print(arr2d[row][col]+ " ");
        //     }
        //     System.out.println();
        // }
        // for ( int row = 0 ; row < arr2d.length; row++){
        //     System.out.println(Arrays.toString(arr2d[row]));
        // }
        for ( int [] a : arr2d){ // int [] a here we use this because of 2d array becuase every element in this array is an array itself
            System.out.println(Arrays.toString(a));
        }
        
    }
}
