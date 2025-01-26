// package Array_And_Operator;

import java.util.Scanner;

public class Comparision_Operator {
    public static void main(String[] args) {
        int age;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the age: ");
        age = scan.nextInt();
        if (age < 1) {
            System.out.println("enter correct interger greater than one");
        } else if (age >= 1 && age < 18) {
            System.out.println("not eligible for vote");

        } else if (age >= 18 && age <= 65) {
            System.out.println("they are eligible for vote ");
        } else {
            System.out.println("not able to vote someone");
        }
        scan.close();
    }
}
