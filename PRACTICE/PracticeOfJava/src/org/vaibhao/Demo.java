package org.vaibhao;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Voting Eligibility Check");
            System.out.println("1. Check Eligibility");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter your age: ");
                    int age = scanner.nextInt();

                    if (age >= 18) {
                        System.out.println("You are eligible to vote!");
                    } else {
                        System.out.println("You are not eligible to vote.");
                    }
                    break;

                case 2:
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter 1 or 2.");
            }
        }
    }
}
