/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coffee;
import java.util.Scanner;
/**
 * @author RR
 */
public class Coffee {
    public static void main(String[] args) {
        final int QUIT = 0;
	final int AMERICAN = 1;
	final int ESPRESSO = 2;
	final int LATTE = 3;
	double total = 0;
	int choice;
	int numSelections = 0;
	String thank = "Thank you for your order of ";
	Scanner input = new Scanner(System.in);
	do {
            System.out.println(
"                           (1)American       1.99\"  \n" +
"                           (2)Espresso       2.50\"  \n" +
"                           (3)Latte          2.15\"  \n" +
"                           (0)For the bill       \"  \n" +
"                           ______________________\"  \n" +
"                              Choose an item: ");
            choice = input.nextInt();
            numSelections++;
            switch (choice) {
                case(AMERICAN):
                    total += 1.99;
                    System.out.println(thank + "American coffee.");
                    break;
		case(ESPRESSO):
                    total += 2.50;
                    System.out.println(thank + "Espresso coffee.");
                    break;
		case(LATTE):
                    total += 2.15;
                    System.out.println(thank + "Latte coffee.");
                    break;
                case(QUIT):
                    break;
		default:
                    System.out.println("That menu option is not available.");
			}
		} while (choice != 0 && numSelections < 3);
		
		System.out.println("Thank you!! Your total order is $" + total + ".");
	}
}