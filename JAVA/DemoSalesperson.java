/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demosalesperson;

/**
 *
 * @author RR
 */
public class DemoSalesperson {
    public static void main(String[] args) {
        // Create an array of 10 Salesperson objects
        Salesperson[] salespeople = new Salesperson[10];

        // Initialize each Salesperson object with ID number 9999 and sales value 0
        for (int i = 0; i < 10; i++) {
            salespeople[i] = new Salesperson(9999, 0);
        }

        // Display the 10 Salesperson objects
        for (int i = 0; i < 10; i++) {
            System.out.println(salespeople[i]);
        }
    }
}
