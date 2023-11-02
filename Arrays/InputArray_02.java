
import java.util.Arrays; // This is pakage for : Arrays.toString(variable_name) method 
import java.util.Scanner;

/*
 [HERE WE ARE TAKING INPUT FROM USER IN ARRAY]
*/

// variable_name.length : is a method used for find the size of an array 
// Arrays.toString(variable_name) : 

public class InputArray_02 {
    public static void main(String[] args) {

        // Taking input of Roll number from students and printout them 
        Scanner input = new Scanner (System.in);
        int[] roll = new int [5] ; // Here the size of the roll is 5 

        
        // input using for loop
        System.out.println("Enter the Roll no : ");
        for (int i = 0 ; i < roll.length ; i++){
            roll [i] = input.nextInt();
        }

        // Output loop for given input
        for (int i = 0 ; i < roll.length ; i++){
            System.out.print(roll[i] + " ");
        }


        // We can use Arrays.toString(variable_name) for storing the number and printout it without using extra loop
        
        // Array.toString (array): Internally uses for loop and gives the output in proper format.

        System.out.print(Arrays.toString(roll));

        System.out.println();
        // Taking input of name from student 
        String [] name = new String[5] ;

        System.out.println("Enter your name : ");
        // for loop taking input of name
        for (int i = 1 ; i < name.length ; i++) {
            name [i] = input.next();
        }

        System.out.println(Arrays.toString(name));
        
        name [1] = "sura" ;

        System.out.println(Arrays.toString(name));

        input.close();
    }
}
