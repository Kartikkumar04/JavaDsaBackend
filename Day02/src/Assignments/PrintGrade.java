//#5
package Assignments;

import java.util.Scanner;

public class PrintGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Marks:");
        int marks = input.nextInt();
        if((marks<0) || (marks>100)) {
            System.out.println("Marks must be between 0 and 100");
        }else if (marks >= 90) {
            System.out.println(marks + "Grade A");
        } else if (marks >= 75) {
            System.out.println(marks + "Grade B");
        } else if (marks >= 50) {
            System.out.println(marks + "Grade C");
        } else {
            System.out.println(marks + "Fail");
        }
        input.close();
    }
}
