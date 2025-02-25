package com.dti.workshop;

import java.util.Scanner;

// Class for calculating American Share
class AmericanShare {
    private double totalAmount;
    private int numberOfPeople;

    // Constructor
    public AmericanShare(double totalAmount, int numberOfPeople) {
        this.totalAmount = totalAmount;
        this.numberOfPeople = numberOfPeople;
    }

    // Method to calculate share per person
    public double calculateShare() {
        if (numberOfPeople == 0) {
            throw new ArithmeticException("Number of people cannot be zero.");
        }
        return totalAmount / numberOfPeople;
    }
}

// Main class to run the program
public class MainAS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input total amount
        System.out.print("Enter total amount: ");
        double amount = scanner.nextDouble();

        // Input number of people
        System.out.print("Enter number of people: ");
        int people = scanner.nextInt();

        // Creating an object of AmericanShare class
        AmericanShare share = new AmericanShare(amount, people);

        try {
            // Calculate and display the share per person
            double perPerson = share.calculateShare();
            System.out.printf("Each person should pay: %.2f\n", perPerson);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
