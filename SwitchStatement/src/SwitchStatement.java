import javax.swing.*;

public class SwitchStatement {
    public static void main(String[] args) {

        int number;

        String input = JOptionPane.showInputDialog("Please enter 1,2,3");
        number = Integer.parseInt(input);
/*
        if(number == 1){
            JOptionPane.showMessageDialog(null, "you entered 1");
        }
        else if(number == 2){
            JOptionPane.showMessageDialog(null, "you entered 2");
        }
        else if(number == 3){
            JOptionPane.showMessageDialog(null, "you entered 3");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "you entered different number");
        }*/

        switch (number){
            case 1:
                JOptionPane.showMessageDialog(null, "you entered 1");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "you entered 2");
                break;

            case 3:
                JOptionPane.showMessageDialog(null, "you entered 3");
                break;
            default:
                JOptionPane.showMessageDialog(null, "you entered different number");

        }


        char letter;

        input =JOptionPane.showInputDialog("a,b,c");
        letter = input.charAt(0);

        switch (letter){
            case 'a':
            case 'A':

                JOptionPane.showMessageDialog(null, "you entered a");
                break;
            case 'b':
            case 'B':
                JOptionPane.showMessageDialog(null, "you entered b");
                break;

            case 'c':
            case 'C':
                JOptionPane.showMessageDialog(null, "you entered c");
                break;
            default:
                JOptionPane.showMessageDialog(null, "you entered different letter ");

        }
        System.exit(0);

    }
}
