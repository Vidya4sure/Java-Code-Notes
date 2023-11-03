// Q : Search for 3 in the range of index [1 , 4]
// arr = {18 , 12 , -7 , 3 , 14 , 28};

public class SearchInRange_03 { 
    public static void main(String[] args) {
        int[] num = {18 , 12 , -7 , 3 , 14 , 28};
        int findIndex = 12 ;
        int ans = SearchRange(num , findIndex);
        System.out.println(ans);
    }

    static int SearchRange (int[] arr ,int target){
        if (arr.length == 0){
            return -1 ;
        }

        for (int i = 1; i <= 4; i++) {
            int element = arr [i];
            if (element == target){
                return i ;
            }
        }

        return -1 ;
    } 
}
