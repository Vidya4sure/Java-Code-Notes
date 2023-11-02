import java.util.Arrays;
import java.util.Scanner;

public class Two_D_Array_03 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int [][] arr = new int[3][3] ; // 3 rows and 3 column

        System.out.println(arr.length); //Output: number of rows 

        System.out.println("Enter the numbers :");
        // Taking input
        for (int row = 0 ; row < arr.length ; row++){
            
            for (int col = 0 ; col < arr[row].length ; col++ ){
                arr[row][col] = in.nextInt() ;
            }
        }

        // Output 
        for (int row = 0 ; row < arr.length; row++){
            System.out.println(Arrays.toString(arr[row]));
        }
    }
}
