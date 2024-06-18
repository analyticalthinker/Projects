/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package knots;

/**
 *
 * @author RR
 */
public class Knots {
    public static void main(String[] args) {
        System.out.println("Knots\tKilometers per Hour\tMiles per Hour");
        System.out.println("--------------------------------------------");

        for (int knots = 15; knots <= 30; knots++) {
            double kilometersPerHour = knots * 1.852;
            double milesPerHour = knots * 1.151;

            System.out.printf("%d\t%.2f\t\t\t%.2f\n", knots, kilometersPerHour, milesPerHour);
        }
    }
}
