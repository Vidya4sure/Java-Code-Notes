// Here we will search tha character of a string 

public class SearchInString_02 {
    public static void main(String[] args) {
        String name = "Vidya" ;
        char target = 'y' ;
        boolean ans = SearchChar(name, target);
        System.out.println(ans);
    }


    // Function for searching a String
    static boolean SearchChar (String str , char target){
        if (str.length() == 0){
            return false ;
        }

        // Run a for loop 
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)){
                return true ;
            }
        }

        return false ;
    }
}
