package Assignments;
import java.util.Scanner;
public class Greater {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    System.out.println("Enter n1:");
    int n1 = input.nextInt();
    System.out.println("Enter n2:");
    int n2 = input.nextInt();
    if(n1 == n2){
        System.out.println("Both are equal.");
    }
    else if(n1 > n2){
        System.out.println("n1 is greater than n2.");
    }
    else{
        System.out.println("n2 is greater than n1.");
    }
    input.close();
    }
}
