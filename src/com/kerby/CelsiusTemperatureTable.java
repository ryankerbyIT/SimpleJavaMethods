/**
 * 
 */
package com.kerby;
public class CelsiusTemperatureTable {

    // Method to convert Fahrenheit to Celsius
    public static double celsius(double fahrenheit) {
        return (5.0 / 9.0) * (fahrenheit - 32);
    }

    public static void main(String[] args) {
        // Loop to display the Fahrenheit to Celsius table for temperatures 0 through 20
        System.out.printf("%-10s %-10s%n", "Fahrenheit", "Celsius");
        for (int fahrenheit = 0; fahrenheit <= 20; fahrenheit++) {
            double celsiusTemp = celsius(fahrenheit);
            System.out.printf("%-10d %-10.2f%n", fahrenheit, celsiusTemp);
        }
    }
}

/**
 * Explanation:
The celsius method converts Fahrenheit to Celsius using the formula
C = (5/9) * (F-32).
The main method loops from 0 to 20 Fahrenheit and prints the corresponding 
Celsius temperature using the celsius method.
 */
