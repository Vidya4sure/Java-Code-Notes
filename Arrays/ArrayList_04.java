// Q : Why do we need ArrayList ?
/*
 Let say I don't know the the size of an array 
 In that case we will use ArrayList 
*/

/*
 ArrayList is a part of collection framework and is present in 
 java.util.package.It provide with Dynamic Arrays in Java. 
 It is slower than standard arrays. 
 
*/

// Syntax 
/*  
  ArrayList<Integer> list = new ArrayList<Integer>();
*/

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_04 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        ArrayList<Integer> list = new ArrayList<>();

        // Now lets adds integer by using .add (method)

        list.add(65);
        list.add(100);
        list.add(457);
        list.add(655);
        list.add(99);

        // There are many methods for ArrayList :
        // Search and try different methods of ArrayLit 
         

        // Output the above numbers 
        System.out.println(list);

        ArrayList<String> name = new ArrayList<>(5);
        
        System.out.println("Enter your five friends name :");
        // input 
        for (int i = 0 ; i < 5 ; i++){
            name.add(in.nextLine());
        }

        // Output
        for (int i = 0 ; i < 5 ; i++){
            System.out.println(name.get(i)); // pass index here, name[index] syntax will not work here 
        }

        System.out.println(name);
    }
}
