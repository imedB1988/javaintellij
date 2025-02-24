package com.reading.input.scanner;

import java.util.Scanner;

public class ReadingInput
{
    public static void main(String[] args) {
        int firstnumber;
        int secondnumber;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("first number");
        firstnumber=keyboard.nextInt();
        System.out.println("second number");
        secondnumber=keyboard.nextInt();

        double average= (firstnumber+secondnumber)/2.0;

        System.out.println(average);

        String name, surname;

        keyboard.nextLine();
        System.out.println("NAME");
        name=keyboard.nextLine();
        System.out.println("surname");
        surname=keyboard.nextLine();

        String fullname=name + " " + surname;
        System.out.println(fullname);





    }
}
