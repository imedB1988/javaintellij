import javax.swing.*;
import java.text.DecimalFormat;

public class RunningTotals {

    public static void main(String[] args) {

        int days;
        double sales;
        double totalSales = 0.0; // running  total

        DecimalFormat dollar= new DecimalFormat("#0.000");

        String input = JOptionPane.showInputDialog("how many do you have sales");

        days=Integer.parseInt(input);

        for(int count = 1; count <days; count++)
        {
            input = JOptionPane.showInputDialog("enter the sales for day " + count);
            sales = Double.parseDouble(input);
            totalSales = totalSales + sales;
            JOptionPane.showMessageDialog(null,"total sales "+dollar.format(totalSales));

        }
        JOptionPane.showMessageDialog(null,"total sales"+dollar.format(totalSales));
        System.exit(0);

    }
}
