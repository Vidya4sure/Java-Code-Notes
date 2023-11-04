//Q: Find the minimum value 2D array

public class Find2Dmin_06_02 {
    public static void main(String[] args) {
        int[][] nums = {
            {23 ,99, 44, 65},
            {6, 9, 15, 36, 85},
            {-2, 84, 87},
            {3, 12}
        };

        System.out.println("Minimum value in the array is :");
        System.out.println(find2Dmin(nums));
    }

    static int find2Dmin(int[][] arr){
        int min = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                // Change the comparing operator for find minimum value
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }

        return min ;
    }
}
