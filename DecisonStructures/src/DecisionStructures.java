import javax.swing.*;

public class DecisionStructures {

    public static void main(String[] args) {

      /* int x=5;
        int y=6;
        int z=7;

        boolean express =  !(x < y);

        System.out.println(express);

    */

        int number;
        String input = JOptionPane.showInputDialog(null, "number");
        number=Integer.parseInt(input);
            /*
        if(number == 5)
        {
            JOptionPane.showMessageDialog(null,"egal a 5");
        }
        else if (number >= 5)
        {
            JOptionPane.showMessageDialog(null,"superior a 5");
        } else  {
            JOptionPane.showMessageDialog(null,"inferior a 5");
        }*/


        if(number < 50)
        {
            if(number>=45)
            {
                JOptionPane.showMessageDialog(null,"you can write the assessment");
            }
            else
            {

                JOptionPane.showMessageDialog(null,"failed");
            }
        } else {
            if(number >=75)
            {
                JOptionPane.showMessageDialog(null,"you have a distinction !");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Passed !");
            }

        }


    }
}
