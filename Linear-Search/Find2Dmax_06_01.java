//Q: Find the maximum value in 2D array

public class Find2Dmax_06_01 {
    public static void main(String[] args) {
        int[][] nums = {
            {23 ,99, 44, 65},
            {6, 9, 15, 36, 85},
            {-2, 84, 87},
            {3, 12}
        };

        System.out.println(find2Dmax(nums));
    }

    static int find2Dmax(int[][] arr){
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                // Change the compare operator for finding minimun value
                if (arr[i][j]>max) {
                    max = arr[i][j];
                }
            }
        }

        return max ;
    }
}
