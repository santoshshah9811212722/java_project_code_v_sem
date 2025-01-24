package Array_And_Operator;

import java.util.Scanner;

public class OneDimentionalArray {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array element: ");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] marks = new int[size];
        System.out.println("enter the marks of the students of " + size);

        for (int i = 0; i < marks.length; i++) {
            System.out.println("student " + (i + 1) + ": ");
            marks[i] = scan.nextInt();
        }
        int sum = 0;
        for (int num : marks) {
            sum += num;
        }
        System.out.println("Sum of all students mark is: " + sum);
        scan.close();
    }
}
