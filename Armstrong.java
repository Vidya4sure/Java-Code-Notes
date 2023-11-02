
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int num = in.nextInt();
        int temp = num;
        int p = 0 ;

        while (num > 0){
            int rem = num % 10 ;
            p = p + (rem * rem * rem);
            num = num / 10 ;
        }


        if (temp == p){
            System.out.println("Yes. it is Armstrong number");
        }else {
            System.out.println("No. It is not an Armstrong number.");
        }
    }
}
