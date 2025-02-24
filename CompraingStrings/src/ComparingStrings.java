import javax.swing.*;

public class ComparingStrings {
    public static void main(String[] args) {
        String name1= JOptionPane.showInputDialog("name1");
        String name2=JOptionPane.showInputDialog("name2");
        //String name1= "Peter";
        //String name2="Peter";


        if (name1 == name2)
        {
         System.out.println("operation ==");
        }
        else
        {
            System.out.println("erreur");
        }

        if(name1.equals(name2))
        {
            System.out.println("operation equals");
        }

        if(name1.compareTo(name2)==0)
        {
            System.out.println("operation compare To");
        }

        if(name1.compareTo(name2)>0)
        {
            System.out.println("operation compare To >");
        }
        if(name1.compareTo(name2)<0)
        {
            System.out.println("operation compare To <");
        }

        System.exit(0);

    }
}
