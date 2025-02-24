import javax.swing.*;

public class UserControlledLoop {
    public static void main(String[] args) {

        int maxvalue;

        String input = JOptionPane.showInputDialog("How high should I go ?");

        maxvalue = Integer.parseInt(input);

        System.out.println("Number"+maxvalue+ "squarred");

        for(int i = 1; i<=maxvalue; i++)
        {
            System.out.println(i + "\t\t\t" + i*i);
        }

    }
}
