/**
 * 
 */
package com.kerby;
import java.util.Scanner;

public class TestAverageAndGrade {

    // Method to calculate the average of five test scores
    public static double calcAverage(double score1, double score2, double score3, double score4, double score5) {
        return (score1 + score2 + score3 + score4 + score5) / 5.0;
    }

    // Method to determine the letter grade based on a score
    public static char determineGrade(double score) {
        if (score >= 90) {
            return 'A';
        } else if (score >= 80) {
            return 'B';
        } else if (score >= 70) {
            return 'C';
        } else if (score >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter five test scores
        System.out.print("Enter the first test score: ");
        double score1 = scanner.nextDouble();

        System.out.print("Enter the second test score: ");
        double score2 = scanner.nextDouble();

        System.out.print("Enter the third test score: ");
        double score3 = scanner.nextDouble();

        System.out.print("Enter the fourth test score: ");
        double score4 = scanner.nextDouble();

        System.out.print("Enter the fifth test score: ");
        double score5 = scanner.nextDouble();

        // Display the letter grade for each score
        System.out.println("Letter grade for first score: " + determineGrade(score1));
        System.out.println("Letter grade for second score: " + determineGrade(score2));
        System.out.println("Letter grade for third score: " + determineGrade(score3));
        System.out.println("Letter grade for fourth score: " + determineGrade(score4));
        System.out.println("Letter grade for fifth score: " + determineGrade(score5));

        // Calculate and display the average score and its letter grade
        double averageScore = calcAverage(score1, score2, score3, score4, score5);
        System.out.printf("Average score: %.2f%n", averageScore);
        System.out.println("Letter grade for average score: " + determineGrade(averageScore));

        // Close the scanner
        scanner.close();
    }
}

/**
 * Explanation:
The calcAverage method calculates the average of the 
five test scores passed to it.
The determineGrade method determines the letter grade 
based on the score according to the grading scale 
(A for 90-100, B for 80-89, etc.).
The main method prompts the user to input five test 
scores, displays the letter grade for each score, 
calculates the average of the five scores, and displays
the letter grade for the average score.
 */
