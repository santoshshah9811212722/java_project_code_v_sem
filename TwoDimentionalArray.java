import java.util.Scanner;

public class TwoDimentionalArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter the row required");
        int row = scan.nextInt();
        System.out.println("enter the column required");
        int column = scan.nextInt();

        int[][] array = new int[row][column];
        System.out.println("enter the value of the matrix" + row + " * " + column);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scan.nextInt();
            }
        }
        int[][] array2 = new int[row][column];

        System.out.println("enter the value of the second matrix" + row + " * " + column);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array2[i][j] = scan.nextInt();

            }
        }

        // adding process of two matrix
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = array[i][j] + array2[i][j];
            }
        }

        System.out.println("sum of two matrix: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
                System.out.print(" ");
            }
            System.out.println("\n");
        }
        scan.close();
    }
}
