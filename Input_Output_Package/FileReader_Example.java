
import java.io.*;
import java.util.Scanner;

public class FileReader_Example {
    public static void main(String[] args) {
        File readfile = new File("example.txt");
        try {
            Scanner scan = new Scanner(readfile);
            while (scan.hasNextLine()) {
                String Line = scan.nextLine();
                System.out.println(Line);

            }
            scan.close();

        } catch (Exception e) {
            System.out.println("exceptional handled");
        }

    }
}
