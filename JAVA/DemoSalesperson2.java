/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demosalesperson2;

/**
 *
 * @author RR
 */
public class DemoSalesperson2 {
    public static void main(String[] args) {
        // Create an array of 10 Salesperson objects
        Salesperson[] salespeople = new Salesperson[10];

        // Initialize each Salesperson object with successive ID number (111 to 120)
        // and sales value ranging from $25,000 to $70,000
        double salesAmount = 25000;
        for (int i = 0; i < 10; i++) {
            salespeople[i] = new Salesperson(111 + i, salesAmount);
            salesAmount += 5000; // Increase sales value by $5,000 for each successive Salesperson
        }

        // Display the 10 Salesperson objects
        for (int i = 0; i < 10; i++) {
            System.out.println(salespeople[i]);
        }
    }
}

