/**
 * 
 */
package com.kerby;
import java.util.Scanner;

public class PrimeNumber {

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false; // Number is divisible by another number, so not prime
            }
        }
        return true; // Number is prime
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get a number from the user
        System.out.print("Enter a number to check if it's prime: ");
        int number = scanner.nextInt();

        // Check if the number is prime and display the result
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        scanner.close();
    }
}

/**
 * Explanation:
	The isPrime method checks if a number is prime. 
	It returns true if the number is prime and false 
	otherwise.The main method asks the user to input 
	a number, calls the isPrime method, and displays 
	whether the number is prime.
 */

