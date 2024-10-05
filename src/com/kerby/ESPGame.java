/**
 * 
 */
package com.kerby;
import java.util.Random;
import java.util.Scanner;

public class ESPGame {

    // Method to get the computer's color choice
    public static String getComputerColor() {
        Random rand = new Random();
        int choice = rand.nextInt(5); // Generate random number 0-4

        switch (choice) {
            case 0:
                return "Red";
            case 1:
                return "Green";
            case 2:
                return "Blue";
            case 3:
                return "Orange";
            case 4:
                return "Yellow";
        }
        return "";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int correctGuesses = 0;

        // Repeat the game 10 times
        for (int i = 0; i < 10; i++) {
            // Get the computer's choice
            String computerColor = getComputerColor();

            // Ask the user for their guess
            System.out.print("Guess the color (Red, Green, Blue, Orange, Yellow): ");
            String userGuess = scanner.next();

            // Check if the user's guess is correct
            if (userGuess.equalsIgnoreCase(computerColor)) {
                correctGuesses++;
                System.out.println("Correct!");
            } else {
                System.out.println("Wrong! The correct color was " + computerColor);
            }
        }

        // Display the number of correct guesses
        System.out.println("You guessed correctly " + correctGuesses + " out of 10 times.");

        scanner.close();
    }
}

/**
 * Explanation:
	The getComputerColor method randomly selects 
	a color (Red, Green, Blue, Orange, Yellow).
	The main method runs a loop 10 times, allowing 
	the user to guess the computer's randomly 
	selected color and keeps track of how many 
	correct guesses the user makes.
 */

