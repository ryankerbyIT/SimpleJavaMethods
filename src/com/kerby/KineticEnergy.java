/**
 * 
 */
package com.kerby;
import java.util.Scanner;

public class KineticEnergy {

    // Method to calculate kinetic energy
    public static double kineticEnergy(double mass, double velocity) {
        return 0.5 * mass * velocity * velocity;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the object's mass from the user
        System.out.print("Enter the object's mass (in kilograms): ");
        double mass = scanner.nextDouble();

        // Get the object's velocity from the user
        System.out.print("Enter the object's velocity (in meters per second): ");
        double velocity = scanner.nextDouble();

        // Calculate and display the kinetic energy
        double energy = kineticEnergy(mass, velocity);
        System.out.printf("The kinetic energy of the object is %.2f joules.%n", energy);

        scanner.close();
    }
}

/**
	 * The kineticEnergy method calculates and returns the 
	 * kinetic energy of an object using the formula
	 * KE = 1/2mv^2
	 * The main method prompts the user to input the object's 
	 * mass and velocity, then calls the kineticEnergy method 
	 * to calculate and display the result.
 */

