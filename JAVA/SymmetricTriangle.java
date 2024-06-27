/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package symmetrictriangle;
import java.util.Scanner;
/**
 *
 * @author u6023321
 */
public class SymmetricTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character to print the triangle: ");
        char character = scanner.next().charAt(0);

        System.out.print("Enter the size of the peak for the triangle (not larger than 10): ");
        int size = scanner.nextInt();

        // Validate the character input, use '*' as default character if invalid
        if (!isValidCharacter(character)) {
            System.out.println("Invalid character input. Using '*' as the default character.");
            character = '*';
        }

        // Validate the size input, use 3 as default size if invalid or larger than 10
        if (size <= 0 || size > 10) {
            System.out.println("Invalid size input or size larger than 10. Using 3 as the default size.");
            size = 3;
        }

        // Print the triangle
        printTriangle(character, size);
    }

    // Check if the character is a valid printable character
    public static boolean isValidCharacter(char ch) {
        return !Character.isWhitespace(ch) && Character.isDefined(ch) && !Character.isISOControl(ch);
    }

    // Print the triangle using the specified character and size
    public static void printTriangle(char character, int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(character + " ");
            }
            System.out.println();
        }
    }
}