/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scholarship2;
import java.util.Scanner;
/**
 *
 * @author RR
 */
public class Scholarship2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter student's high school grade point average: ");
        double gpa = input.nextDouble();

        System.out.print("Enter student's number of extracurricular activities: ");
        int extracurricularActivities = input.nextInt();

        System.out.print("Enter student's number of service activities: ");
        int serviceActivities = input.nextInt();

        if (gpa < 0 || gpa > 4.0 || extracurricularActivities < 0 || serviceActivities < 0) {
            System.out.println("Error: Invalid input values.");
        } else if (gpa >= 3.8 && extracurricularActivities >= 1 && serviceActivities >= 1) {
            System.out.println("Scholarship candidate");
        } else if (gpa >= 3.4 && extracurricularActivities + serviceActivities >= 3) {
            System.out.println("Scholarship candidate");
        } else if (gpa >= 3.0 && extracurricularActivities >= 2 && serviceActivities >= 3) {
            System.out.println("Scholarship candidate");
        } else {
            System.out.println("Not a candidate");
        }
    }
}
