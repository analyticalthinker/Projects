/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package invoice2;

/**
 *
 * @author RR
 */
public class Invoice2 {
    private int invoiceNumber;
    private double balanceDue;
    private int month;
    private int day;
    private int year;

    public Invoice2(int invoiceNumber, double balanceDue, int month, int day, int year) {
        if (invoiceNumber < 1000) {
            this.invoiceNumber = 0;
        } else {
            this.invoiceNumber = invoiceNumber;
        }
        this.balanceDue = balanceDue;
        if (month < 1 || month > 12) {
            this.month = 0;
            this.day = 0;
        } else {
            this.month = month;
            if (day < 1) {
                this.day = 1;
            } else if (day > 31) {
                switch (month) {
                    case 2:
                        this.day = 28; // Set day to maximum 28 for February
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        this.day = 30; // Set day to maximum 30 for April, June, September, and November
                        break;
                    default:
                        this.day = 31; // Set day to maximum 31 for all other months
                        break;
                }
            } else {
                this.day = day;
            }
        }

        if (year < 2011 || year > 2017) {
            this.year = 0;
        } else {
            this.year = year;
        }
    }

    public void display() {
        System.out.println("Invoice Number: " + invoiceNumber);
        System.out.println("Balance Due: $" + balanceDue);
        System.out.println("Due Date: " + month + "/" + day + "/" + year);
        System.out.println();
    }
}