// package ExceptionalHandling;

import java.util.Scanner;

public class ThrowsExample {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter age:");
        try {
            int age = scan.nextInt();
            scan.close();
            if (age > 100) {
                throw new MyException("jabardasti throw exception");
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}

class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}
