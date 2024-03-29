//While purchasing certain items, a discount of 10% is offered if the quantity purchased is more than 50. If the quantity purchased is between 25 and 50 (inclusive), a discount of 5% is offered. If the quantity purchased is less than 25, no discount is offered. Write a program to calculate the total expenses given the quantity and price per item entered through the keyboard.
import java.util.Scanner;
public class TotalExpensesCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the quantity purchased: ");
        int quantity = scanner.nextInt();

        System.out.print("Enter the price per item: ");
        double pricePerItem = scanner.nextDouble();

        double totalExpenses = quantity * pricePerItem;

        if (quantity > 50) {
            totalExpenses *= 0.9; // Apply 10% discount
        } else if (quantity >= 25) {
            totalExpenses *= 0.95; // Apply 5% discount
        }

        System.out.println("Total expenses: Rs. " + totalExpenses);

        scanner.close();
    }
}
