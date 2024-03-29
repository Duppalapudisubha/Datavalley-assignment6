//A library charges a fine for every book returned late. For the first 7 days, the fine is 50 paise, for 8-14 days the fine is one rupee, and above 14 days fine is 5 rupees. If you return the book after 21 days, your membership will be canceled. Write a program to accept the number of days the member is late to return the book and display the fine or the appropriate message.
import java.util.Scanner;

public class LibraryFineCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of days the member is late to return the book: ");
        int daysLate = scanner.nextInt();

        if (daysLate <= 7) {
            System.out.println("Fine: 50 paise");
        } else if (daysLate <= 14) {
            System.out.println("Fine: Rs. 1/-");
        } else if (daysLate <= 21) {
            System.out.println("Fine: Rs. 5/-");
        } else {
            System.out.println("Membership canceled due to late return.");
        }

        scanner.close();
    }
}
