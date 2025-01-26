// package Array_And_Operator;

import java.util.Scanner;

public class Operators_And {
    public static void main(String[] args) {

        String name;
        int Roll;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your name: ");
        name = scan.nextLine();

        System.out.println("enter your roll: ");
        Roll = scan.nextInt();
        if (name.equals("santosh") && Roll == 34) {
            System.out.println("logical and operation done");
        } else {
            System.out.println("false condition");
        }
        scan.close();
    }
}
