/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package purchase;

/**
 *
 * @author u6023321
 */
public class Purchase {
    private int invoiceNumber;
    private double saleAmount;
    private double salesTax;

    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public void setSaleAmount(double saleAmount) {
        this.saleAmount = saleAmount;
        calculateSalesTax();
    }

    private void calculateSalesTax() {
        this.salesTax = saleAmount * 0.05; // 5% sales tax
    }

    public void display() {
        System.out.println("Invoice Number: " + invoiceNumber);
        System.out.println("Sale Amount: $" + saleAmount);
        System.out.println("Sales Tax: $" + salesTax);
    }
}
