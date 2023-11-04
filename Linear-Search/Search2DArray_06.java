// Q: Searching value in 2D Array
// Q: Find the number availibilty YES/NO

import java.util.Arrays;

public class Search2DArray_06 {
    public static void main(String[] args) {
        int[][] nums = {
            {23 ,99, 44, 65},
            {6, 9, 15, 36, 85},
            {-2, 84, 87},
            {3, 12}
        };

        // Want to Search target value 
        int target = 15 ;

        // The value will return the index value [row,col]
        int[] ans = search2D(nums, target); // format of retun value {i , j}
        System.out.println(Arrays.toString(ans));

        // Output the availibilty of the value Yes or No
        System.out.println("Is this number availabe :"+ findYesorNo(nums, target) );
    }
    
    // Find the value in 2D array
    static int[] search2D(int[][] arr , int ans){

        // itrate the 2D Array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                if (arr[i][j] == ans) {
                    return new int[]{i, j}; // create array object that will return the value  [row,col]
                }
            }
        }

        // if value is not there then if will retun [-1, -1]
        return new int[]{-1 , -1};
    }


    // Lets Find that the value is available or not TRUE/FALSE
    static boolean findYesorNo(int[][] arr , int ans){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (ans == arr[i][j]) {
                    return true;
                }
            }
        }

        return false;
    }
}
