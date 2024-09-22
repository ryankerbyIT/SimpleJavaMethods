package com.kerby;

import java.util.Scanner;

public class AreaRectangle {

    // Method to get the length of the rectangle
    public static double getLength() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the rectangle's length: ");
        return scanner.nextDouble();
    }

    // Method to get the width of the rectangle
    public static double getWidth() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the rectangle's width: ");
        return scanner.nextDouble();
    }

    // Method to calculate the area of the rectangle
    public static double getArea(double length, double width) {
        return length * width;
    }

    // Method to display the rectangle's length, width, and area
    public static void displayData(double length, double width, double area) {
        System.out.printf("Rectangle Length: %.2f%n", length);
        System.out.printf("Rectangle Width: %.2f%n", width);
        System.out.printf("Rectangle Area: %.2f%n", area);
    }

    public static void main(String[] args) {
        // Get the length and width from the user
        double length = getLength();
        double width = getWidth();

        // Calculate the area
        double area = getArea(length, width);

        // Display the data
        displayData(length, width, area);
    }
}
/** 
 * Explanation:

	getLength and getWidth methods ask the user to enter 
	the rectangle's dimensions and return those values as double.
	getArea takes the length and width as arguments and returns 
	the calculated area. displayData accepts the length, width, 
	and area as arguments and prints them in a formatted manner.
	The main method orchestrates the flow by calling these methods
	 in sequence.
	 */
