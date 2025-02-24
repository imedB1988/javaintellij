import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReadingFiles {
    public static void main(String[] args) {
    int sum  = 0;
    int count = 0;
    double average;
    File file = new File("outputFile.txt");
    if(file.exists()) {
            try {
            Scanner scan = new Scanner(file);

           while (scan.hasNext())
           {
             //  System.out.println(scan.nextLine());
                sum=sum+scan.nextInt();
                count++;

           }
                scan.close();
           average = sum / (double) count;
           JOptionPane.showMessageDialog(null, "Summ of all values :"+sum);
                JOptionPane.showMessageDialog(null, "number of all values :"+count);
                JOptionPane.showMessageDialog(null, "average of all values :"+average);



            } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
    else
    {
        JOptionPane.showMessageDialog(null, "file not exist");
    }

    }
}
