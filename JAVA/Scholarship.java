/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scholarship;
import java.util.Scanner;
/**
 *
 * @author RR
 */
public class Scholarship {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter student's high school grade point average: ");
        double gpa = input.nextDouble();

        System.out.print("Enter student's number of extracurricular activities: ");
        int extracurricularActivities = input.nextInt();

        System.out.print("Enter student's number of service activities: ");
        int serviceActivities = input.nextInt();

        if (gpa >= 3.8 && extracurricularActivities >= 1 && serviceActivities >= 1) {
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