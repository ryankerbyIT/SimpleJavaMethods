/**
 * 
 */
package com.kerby;
public class ShowCharExample {

    // Method to display the character at the specified position in the string
    public static void showChar(String str, int position) {
        if (position >= 0 && position < str.length()) {
            char result = str.charAt(position);
            System.out.println("Character at position " + position + " is: " + result);
        } else {
            System.out.println("Invalid position. Please provide a position within the string length.");
        }
    }

    public static void main(String[] args) {
        // Test the showChar method
        showChar("New York", 2); // Expected output: Character at position 2 is: w
    }
}

/**
	 * Explanation:
	The showChar method takes two arguments: a String and an integer 
	position. The method checks if the position is valid 
	(i.e., within the bounds of the string length).
	If the position is valid, it retrieves the character at the given
	 position using str.charAt(position) and prints it.
	If the position is invalid, it displays an error message.
 */

