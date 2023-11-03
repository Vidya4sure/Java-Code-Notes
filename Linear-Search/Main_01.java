// Here we will learn about linear search 

public class Main_01 {
    public static void main(String[] args) {
        int[] nums = {100, 23, 25, 99, 88, 7, 54, 65};
        int target = 7 ;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }


    // Function for linear search 

    // Search in the array : return the index if item found 
    // otherwise if item not found return -1

    static int linearSearch(int[] arr , int target){
        if (arr.length == 0){
            return -1 ;
        }

        // Run a for loop 
        for (int index = 0; index < arr.length; index++) {
            // check for element at every index if it is = target 
            int element = arr [index] ;
            if (element == target){
                return index;
            }
        }

        // This line will execute if none of the return statements above have executed 
        // Hence the target not found 
        return -1 ;
    }
}
