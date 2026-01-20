package Assignments;
import java.util.Scanner;
public class PositiveOrNegative {
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        System.out.print("Enter a number: ");
        int n1 = input.nextInt();

        if(n1 > 100){
            System.out.println("The number is greater than 100.");
        }
        else if(n1 > 0){
            System.out.println("The number is Positive.");
        }
        else if(n1 < 0){
            System.out.println("The number is negative.");
        }
//        else if(n1 == ""){
//            System.out.println("Characters not allowed.");
//        }
        else{
            System.out.println("The number is equal to zero.");
        }
    }
}
