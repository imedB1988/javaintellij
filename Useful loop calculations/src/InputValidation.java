import javax.swing.*;

public class InputValidation {
    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog("Please enter a number in the range of 1 to 100");
        int number = Integer.parseInt(input);

        while (number  < 1 || number >100)
        {
            JOptionPane.showMessageDialog(null, "out of range");
            input = JOptionPane.showInputDialog("Please enter a number in the range of 1 to 100");
            number = Integer.parseInt(input);

        }

        JOptionPane.showMessageDialog(null, "Correct");




    }
}
