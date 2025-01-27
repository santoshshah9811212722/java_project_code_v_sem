import java.io.*;

public class FileCreate {
    public static void main(String[] args) {
        try {
            File file = new File("example.txt");
            if (file.createNewFile()) {
                System.out.println("file created successfully...");
            } else {
                System.out.println("file already exists...");
            }

        } catch (IOException e) {
            e.getMessage();
        }
    }
}
