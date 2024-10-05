/**
 * 
 */
package com.kerby;
import java.util.Scanner;

public class PresentValueCalculator {

    // Method to calculate present value
    public static double presentValue(double futureValue, double annualInterestRate, int years) {
        return futureValue / Math.pow(1 + annualInterestRate, years);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the future value, annual interest rate, and years from the user
        System.out.print("Enter the future value: ");
        double futureValue = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (as a decimal): ");
        double annualInterestRate = scanner.nextDouble();

        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();

        // Calculate and display the present value
        double presentValue = presentValue(futureValue, annualInterestRate, years);
        System.out.printf("The amount you need to deposit today is: $%.2f%n", presentValue);

        scanner.close();
    }
}

/**
 * Explanation:
	The presentValue method calculates the 
	present value using the formula P = (F)/(1+r)^n where F
	is the future value, r is the annual interest rate, and
	n is the number of years. The main method asks the user 
	for the future value, interest rate, and years, then calculates 
	and displays the present value.
 */

