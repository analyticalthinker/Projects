/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aquariumphlevel;
import java.util.Scanner;

public class AquariumPHLevel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the pH level of the aquarium water: ");
        double pHLevel = scanner.nextDouble();

        String healthStatus = getHealthStatus(pHLevel);

        System.out.println("The aquarium water is " + healthStatus);
    }

    public static String getHealthStatus(double pHLevel) {
        if (pHLevel < 7) {
            return "acidic";
        } else if (pHLevel > 7) {
            return "alkaline";
        } else {
            return "neutral";
        }
    }
}
