//#4
package Assignments;
import java.util.Scanner;
public class VowelOrConstant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Character:");
        char ch = input.next().charAt(0);
        ch = Character.toLowerCase(ch);
        if(ch == 'a' || ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u'){
            System.out.println(ch + " Is Vowel");
        }
        else{
            System.out.println(ch + " Is Not Vowel");
        }
    }
}
