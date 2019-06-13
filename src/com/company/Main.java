package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        //Declare all variables
        String firstInitial;
        String lastName;
        int houseNumber;
        String streetName;
        String streetType;
        String city;
        // User Input
        System.out.println("Enter first Initial: ");
        firstInitial = keyboard.nextLine();

        System.out.println("Enter last name: ");
        lastName = keyboard.nextLine();

        System.out.println("Enter house number: ");
        houseNumber = keyboard.nextInt();

        //keyboard.nextLine();

        System.out.println("Enter street name: ");
        streetName = keyboard.nextLine();

        System.out.println("Enter street type: ");
        streetType = keyboard.next();

        System.out.println("Enter city: ");
        city = keyboard.next();





        System.out.print(firstInitial + " " + lastName + " " + houseNumber + " ");
        System.out.println(streetName + " " + streetType + " " + city);
    }
}
