//Arithmetic exceptional handling only using try catch block

// package ExceptionalHandling;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the value of a and b: ");
        a = scan.nextInt();
        b = scan.nextInt();

        try {
            c = a / b;
            System.out.println("result of a/b is : " + c);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage() + "exception occur");
        }
        scan.close();
    }
}
