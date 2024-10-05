/**
 * 
 */
package com.kerby;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    // Method to get the computer's choice
    public static String getComputerChoice() {
        Random rand = new Random();
        int choice = rand.nextInt(3) + 1; // Generate random number 1, 2, or 3

        switch (choice) {
            case 1:
                return "rock";
            case 2:
                return "paper";
            case 3:
                return "scissors";
        }
        return "";
    }

    // Method to determine the winner
    public static String determineWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return "It's a tie!";
        } else if (userChoice.equals("rock") && computerChoice.equals("scissors") ||
                userChoice.equals("scissors") && computerChoice.equals("paper") ||
                userChoice.equals("paper") && computerChoice.equals("rock")) {
            return "You win!";
        } else {
            return "Computer wins!";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the user's choice
        System.out.print("Enter rock, paper, or scissors: ");
        String userChoice = scanner.next().toLowerCase();

        // Get the computer's choice
        String computerChoice = getComputerChoice();
        System.out.println("Computer chose: " + computerChoice);

        // Determine the winner
        String result = determineWinner(userChoice, computerChoice);
        System.out.println(result);

        scanner.close();
    }
}

/**
 * Explanation:
	The getComputerChoice method randomly generates 
	a number to represent rock, paper, or scissors.
	The determineWinner method checks the user's and 
	computer's choices and determines the winner 
	based on the game rules. The main method allows 
	the user to enter their choice and then displays 
	both the computer's choice and the game result.

 */

