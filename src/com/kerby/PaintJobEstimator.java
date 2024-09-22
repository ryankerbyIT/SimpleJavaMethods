package com.kerby;
import java.util.Scanner;

public class PaintJobEstimator {

    // Constants
    public static final double SQUARE_FEET_PER_GALLON = 115.0;
    public static final double HOURS_PER_GALLON = 8.0;
    public static final double LABOR_COST_PER_HOUR = 18.0;

    // Method to calculate the number of gallons of paint required
    public static double getGallonsOfPaint(double totalSquareFeet) {
        return Math.ceil(totalSquareFeet / SQUARE_FEET_PER_GALLON);
    }

    // Method to calculate the hours of labor required
    public static double getHoursOfLabor(double gallonsOfPaint) {
        return gallonsOfPaint * HOURS_PER_GALLON;
    }

    // Method to calculate the cost of the paint
    public static double getCostOfPaint(double gallonsOfPaint, double pricePerGallon) {
        return gallonsOfPaint * pricePerGallon;
    }

    // Method to calculate the labor charges
    public static double getLaborCharges(double hoursOfLabor) {
        return hoursOfLabor * LABOR_COST_PER_HOUR;
    }

    // Method to calculate the total cost of the paint job
    public static double getTotalCost(double costOfPaint, double laborCharges) {
        return costOfPaint + laborCharges;
    }

    // Main method to get input from the user and display the results
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for the number of rooms
        System.out.print("Enter the number of rooms to be painted: ");
        int numberOfRooms = scanner.nextInt();

        // Ask for the price of the paint per gallon
        System.out.print("Enter the price of the paint per gallon: ");
        double pricePerGallon = scanner.nextDouble();

        // Calculate the total square feet of all rooms
        double totalSquareFeet = 0.0;
        for (int i = 1; i <= numberOfRooms; i++) {
            System.out.print("Enter the square feet of wall space for room " + i + ": ");
            double roomSquareFeet = scanner.nextDouble();
            totalSquareFeet += roomSquareFeet;
        }

        // Calculate necessary values
        double gallonsOfPaint = getGallonsOfPaint(totalSquareFeet);
        double hoursOfLabor = getHoursOfLabor(gallonsOfPaint);
        double costOfPaint = getCostOfPaint(gallonsOfPaint, pricePerGallon);
        double laborCharges = getLaborCharges(hoursOfLabor);
        double totalCost = getTotalCost(costOfPaint, laborCharges);

        // Display the results
        System.out.printf("Gallons of paint required: %.2f%n", gallonsOfPaint);
        System.out.printf("Hours of labor required: %.2f%n", hoursOfLabor);
        System.out.printf("Cost of the paint: $%.2f%n", costOfPaint);
        System.out.printf("Labor charges: $%.2f%n", laborCharges);
        System.out.printf("Total cost of the paint job: $%.2f%n", totalCost);

        // Close scanner
        scanner.close();
    }
}

/**
 * Explanation:
	Constants:
	SQUARE_FEET_PER_GALLON (115 square feet per gallon of paint).
	HOURS_PER_GALLON (8 hours of labor required per gallon).
	LABOR_COST_PER_HOUR ($18.00 per hour for labor).
	Methods:
	getGallonsOfPaint calculates the number of gallons needed based 
	on total square footage. getHoursOfLabor calculates labor hours 
	based on the gallons of paint needed. getCostOfPaint calculates 
	the cost based on the gallons of paint and price per gallon.
	getLaborCharges calculates the total labor cost based on hours 
	of labor. getTotalCost calculates the total cost of the paint 
	job by adding labor charges and paint cost.The main method gets input 
	from the user and calls the appropriate methods to display 
	the results.
	 */

