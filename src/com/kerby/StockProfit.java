/**
 * 
 */
package com.kerby;
import java.util.Scanner;

public class StockProfit {

    // Method to calculate the profit or loss from the sale of stock
    public static double calcProfit(int numberOfShares, double purchasePrice, double purchaseCommission, double salePrice, double saleCommission) {
        double totalSale = (numberOfShares * salePrice) - saleCommission;
        double totalPurchase = (numberOfShares * purchasePrice) + purchaseCommission;
        return totalSale - totalPurchase;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the stock information from the user
        System.out.print("Enter the number of shares: ");
        int numberOfShares = scanner.nextInt();

        System.out.print("Enter the purchase price per share: ");
        double purchasePrice = scanner.nextDouble();

        System.out.print("Enter the purchase commission paid: ");
        double purchaseCommission = scanner.nextDouble();

        System.out.print("Enter the sale price per share: ");
        double salePrice = scanner.nextDouble();

        System.out.print("Enter the sale commission paid: ");
        double saleCommission = scanner.nextDouble();

        // Calculate the profit or loss
        double profit = calcProfit(numberOfShares, purchasePrice, purchaseCommission, salePrice, saleCommission);

        // Display the result
        if (profit > 0) {
            System.out.printf("You made a profit of $%.2f%n", profit);
        } else if (profit < 0) {
            System.out.printf("You incurred a loss of $%.2f%n", Math.abs(profit));
        } else {
            System.out.println("You broke even.");
        }

        scanner.close();
    }
}

/**
 * Explanation:
	The calcProfit method calculates the profit or loss from a stock sale 
	using the formula provided. It subtracts the total cost 
	(purchase price + commission) from the total sale (sale price - commission).
	The main method gathers input from the user about the number 
	of shares, purchase price, commission, sale price, and commission. 
	It then calls calcProfit to calculate the result and displays the 
	profit or loss.
 */
