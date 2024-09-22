/**
 * 
 */
package com.kerby;
public class DistanceTraveled {

    // Method to calculate the distance traveled
    public static double distance(double speed, double time) {
        return speed * time;
    }

    public static void main(String[] args) {
        // Example usage of the distance method
        double speed = 60.0; // Speed in miles per hour
        double time = 2.0;   // Time in hours

        double distanceTraveled = distance(speed, time);
        System.out.printf("The vehicle traveled %.2f miles.%n", distanceTraveled);
    }
}

/**
 * Explanation:
	The distance method calculates and returns the distance traveled 
	by a vehicle using the formula  Distance = Speed × Time
	The main method demonstrates the use of the distance method 
	with example values for speed and time.
 */
