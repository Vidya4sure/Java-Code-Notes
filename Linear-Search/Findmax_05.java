// Q: Find maximum value in the array.

public class Findmax_05 {
    public static void main(String[] args) {
        int [] nums = {100, 22 , -10, 25 , 0, 1};
        System.out.println(maximum(nums));

    }

    //Assuming the arr.length != 0
    // return the maximum value
    static int maximum(int[] arr){
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > ans) {
                ans = arr[i];
            }
        }

        return ans ;
    }
}
