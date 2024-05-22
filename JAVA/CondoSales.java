/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package condosales;
import java.util.Scanner;
/**
 * @author RR
 */
public class CondoSales {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Choose the view of the condominium:");
        System.out.println("1. Park view");
        System.out.println("2. Golf course view");
        System.out.println("3. Lake view");
        int viewChoice = input.nextInt();
        int price = 0;
        String viewName = "";

        if (viewChoice == 1) {
            viewName = "Park view";
            price = 150000;
        } else if (viewChoice == 2) {
            viewName = "Golf course view";
            price = 170000;
        } else if (viewChoice == 3) {
            viewName = "Lake view";
            price = 210000;
        } else {
            System.out.println("Invalid view choice. Price set to 0.");
        }
        System.out.println("The chosen view is: " + viewName);
        System.out.println("The price of the condo is: $" + price);
    }
}
