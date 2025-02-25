import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ArraysAndFiles {
    public static void main(String[] args) {
        int [] values = new int[10];

        int i=0;
        File file = new File("values.txt");

        if(file.exists())
        {
            try {
                Scanner scan = new Scanner(file);
                while (scan.hasNext() && i < values.length)
                {
                    values[i]=scan.nextInt();
                    i++;
                }
                scan.close();
                for (int value : values)
                {
                    System.out.println(value);
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
