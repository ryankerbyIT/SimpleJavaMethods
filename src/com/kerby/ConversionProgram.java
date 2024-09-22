/**
 * 
 */
package com.kerby;
import java.util.Scanner;

public class ConversionProgram {

    // Method to display the menu
    public static void menu() {
        System.out.println("1. Convert to kilometers");
        System.out.println("2. Convert to inches");
        System.out.println("3. Convert to feet");
        System.out.println("4. Quit the program");
        System.out.print("Enter your choice: ");
    }

    // Method to convert meters to kilometers
    public static void showKilometers(double meters) {
        double kilometers = meters * 0.001;
        System.out.printf("%.2f meters is %.4f kilometers.%n", meters, kilometers);
    }

    // Method to convert meters to inches
    public static void showInches(double meters) {
        double inches = meters * 39.37;
        System.out.printf("%.2f meters is %.2f inches.%n", meters, inches);
    }

    // Method to convert meters to feet
    public static void showFeet(double meters) {
        double feet = meters * 3.281;
        System.out.printf("%.2f meters is %.2f feet.%n", meters, feet);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        double meters;

        do {
            menu();
            choice = scanner.nextInt();

            if (choice != 4) {
                // Get the number of meters from the user
                System.out.print("Enter the distance in meters: ");
                meters = scanner.nextDouble();

                if (meters < 0) {
                    System.out.println("Error: The distance cannot be negative.");
                } else {
                    // Call the appropriate conversion method based on the choice
                    switch (choice) {
                        case 1:
                            showKilometers(meters);
                            break;
                        case 2:
                            showInches(meters);
                            break;
                        case 3:
                            showFeet(meters);
                            break;
                        default:
                            System.out.println("Error: Invalid selection.");
                    }
                }
            }

        } while (choice != 4);

        System.out.println("Goodbye!");
        scanner.close();
    }
}

/**
 * Explanation:
Menu Method: Displays the menu options for the user.
showKilometers, showInches, showFeet: Convert the 
distance in meters to the respective units.
The program runs in a loop, allowing the user to 
continue converting distances until they choose to 
quit by selecting option 4.
The program ensures that negative distances are not 
allowed and displays an error message if the user 
enters a negative number or an invalid menu choice.
 */

