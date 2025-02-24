package com.example.read.JOptionPane;

import javax.swing.*;

public class ReadJoptionPane {
    public static void main(String[] args) {

        String name;
        String surname;

        name= JOptionPane.showInputDialog("firstname");
        surname= JOptionPane.showInputDialog("surname");

        JOptionPane.showMessageDialog(null,name +" "+ surname);

        int first_number;
        int second_number;
        String input;

        input= JOptionPane.showInputDialog("first number");
        first_number= Integer.parseInt(input);
        input= JOptionPane.showInputDialog("second number");
        second_number= Integer.parseInt(input);

        double average = (first_number + second_number)/2.0;
        String res= String.valueOf(average);
        JOptionPane.showMessageDialog(null, "average: "+average);




     
    }
}
