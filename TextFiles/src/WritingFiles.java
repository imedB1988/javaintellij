import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WritingFiles {
    public static void main(String[] args) {
        // create file and open it
        // if exists replace file
        try {
            PrintWriter output = new PrintWriter("outputFile.txt");
            output.println("this is line 1");
            output.println("this is line 2");
            output.println("this is line 3");
            output.println("this is line 4");
            output.println("this is line 5");
            output.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
