import java.util.Scanner;
    public class Typecasting {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
//        int num = input.nextFloat();
//        float num = input.nextInt();0
//        here float is bigger because it also holds decimal number , it automatically typecast int to float
//       ~CONVERTING float into int(compressing a bigger no into a smaller type
//        int num = (int) (3.14f);
//        System.out.println(num);
//        Char to int
//        int number = 'A';
//        System.out.println(number);

//        ====EXAMPLE======

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i =50000;
        float f = 5.67f;
        double d =0.1234;
        double result = (f * b) + (i / c) - (d - s);
        System.out.println ((f * b) + " " + (i / c) + " " + (d - s) );
        System.out.println(result);
    }
}
