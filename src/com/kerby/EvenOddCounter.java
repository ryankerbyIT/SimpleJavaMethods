/**
 * 
 */
package com.kerby;
import java.util.Random;

public class EvenOddCounter {

    // Method to check if a number is even
    public static boolean isEven(int number) {
        return (number % 2 == 0);
    }

    public static void main(String[] args) {
        Random random = new Random();
        int evenCount = 0;
        int oddCount = 0;

        // Generate 100 random integers and count even and odd numbers
        for (int i = 0; i < 100; i++) {
            int randomNumber = random.nextInt(1000); // Generate random numbers between 0 and 999
            if (isEven(randomNumber)) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // Display the number of even and odd numbers
        System.out.println("Number of even numbers: " + evenCount);
        System.out.println("Number of odd numbers: " + oddCount);
    }
}

/**
 * Explanation:
	The isEven method checks if a number is even.
	The main method generates 100 random integers 
	and uses isEven to count how many are even and 
	how many are odd. It then displays the counts.
 */

