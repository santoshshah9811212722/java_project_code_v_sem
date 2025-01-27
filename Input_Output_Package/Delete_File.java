import java.io.*;
import java.io.IOException;

public class Delete_File {
    public static void main(String[] args) throws IOException {

        File file = new File("example.txt");
        if (file.delete()) {
            System.out.println("deleted this file: " + file.getName());
        } else {
            System.out.println("file not deleted");
        }

    }
}
