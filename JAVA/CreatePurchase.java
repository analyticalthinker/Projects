/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package createpurchase;
import java.util.Scanner;
/**
 *
 * @author RR
 */
public class CreatePurchase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Prompt for invoice number
        int invoiceNumber;
        do {
            System.out.print("Enter invoice number (between 1,000 and 8,000): ");
            invoiceNumber = scanner.nextInt();
        } while (invoiceNumber < 1000 || invoiceNumber > 8000);
        // Prompt for sale amount
        double saleAmount;
        do {
            System.out.print("Enter sale amount (nonnegative value): ");
            saleAmount = scanner.nextDouble();
        } while (saleAmount < 0);
        // Create Purchase object
        Purchase purchase = new Purchase();
        purchase.setInvoiceNumber(invoiceNumber);
        purchase.setSaleAmount(saleAmount);
        // Display purchase details
        System.out.println("\nPurchase Details:");
        purchase.display();
        scanner.close();
    }
}
