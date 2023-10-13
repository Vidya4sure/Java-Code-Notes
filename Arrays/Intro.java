package Arrays;


// Syntax 
/*
 datatype[] variable_name = new datatype[size];
*/

// Eg : Storing marks of 5 students
public class Intro {
    public static void main(String[] args) {
        int[] marks ;      // Decleration of an array 
        marks = new int[5]; // Memory Allocation/ initialisation : Actually here object is being created in the memory (heap)
        marks [0] = 60 ;
        marks [1] = 70 ;
        marks [2] = 50 ;
        marks [3] = 40 ;
        marks [4] = 30 ;

        System.out.println(marks[4]); // output the marks which is in index 4


        //Storing name of 5 students 
        String[] name = new String [5]; // Decleration + Memory Allocation 
        name [0] = "Vidya Sagar" ;
        name [1] = "Mantu Yadav" ;
        name [2] = "Prince Raj" ;
        name [3] = "Ankit Kumar" ;
        name [4] = "Aditya Kumar" ;

        System.out.println(name[3]); // Output the name which is stored in index 3 \


        // Store the Roll no of 5 students
        int[] roll = {20 , 25 , 26 , 55 ,62}; // Declare + initilize
        System.out.println(roll[4]);  // Out the roll no stored in index 4 
    }
}