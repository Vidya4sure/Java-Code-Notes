// Q : Fint the minimum value in the array

public class Findmin_04 {
    public static void main(String[] args) {
      int[] arr = {18, 12, -7, 3, 14, 20};
        System.out.println(minimum(arr));

    }

    // Assume arr.length != 0
    // return the minimum value in the array
    static int minimum(int[] arr){

        // Here I am assuming thar index 0 is a minimum value
        // Later on I am checking with other value [index]
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < ans){
                ans = arr[i];
            }
        
        }

        return ans ;
    }
}
