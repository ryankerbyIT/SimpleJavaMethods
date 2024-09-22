/**
 * 
 */
package com.kerby;
public class FallingDistance {

    // Constant for gravity
    public static final double GRAVITY = 9.8;

    // Method to calculate the falling distance
    public static double fallingDistance(double time) {
        return 0.5 * GRAVITY * time * time;
    }

    public static void main(String[] args) {
        // Loop to calculate and display falling distance for times 1 through 10 seconds
        for (int time = 1; time <= 10; time++) {
            double distance = fallingDistance(time);
            System.out.printf("Time: %d seconds, Falling distance: %.2f meters%n", time, distance);
        }
    }
}

/**
 * The fallingDistance method calculates the distance based on the formula
 * d = ((1/2)gt)^2, where g = 9.8 m/s^2 and t is the time in seconds.
 * The main method loops through times from 1 to 10 seconds and calls 
 * the fallingDistance method to display the falling distance for each time.
 */

