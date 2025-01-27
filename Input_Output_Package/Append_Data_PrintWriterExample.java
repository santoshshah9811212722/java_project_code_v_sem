
//writing data in file sequentially without overwriting.
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

// import javax.print.attribute.standard.PrinterMessageFromOperator;

public class Append_Data_PrintWriterExample {
    public static void main(String[] args) {
        File file = new File("example.txt");

        try (FileWriter fw = new FileWriter(file, true); PrintWriter pw = new PrintWriter(fw);) {

            pw.println("hello");
            pw.println("hi");
            pw.println("appending both text in file ");
            System.out.println("data written to file successfully");
            pw.close();
        } catch (IOException e) {
            System.out.println("An error occured " + e.getMessage());
        }
    }
}
