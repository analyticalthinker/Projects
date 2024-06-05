/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package createbabysittingjob;
import java.util.Scanner;
/**
 *
 * @author RR
 */
public class CreateBabysittingJob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for year
        int year;
        do {
            System.out.print("Enter a four-digit year (2013 - 2025): ");
            year = scanner.nextInt();
        } while (year < 2013 || year > 2025);

        // Prompt for job number
        int jobNumber;
        do {
            System.out.print("Enter a job number for the year (1 - 9999): ");
            jobNumber = scanner.nextInt();
        } while (jobNumber < 1 || jobNumber > 9999);

        // Prompt for babysitter code
        int babysitterCode;
        do {
            System.out.print("Enter a babysitter code (1, 2, or 3): ");
            babysitterCode = scanner.nextInt();
        } while (babysitterCode < 1 || babysitterCode > 3);

        // Prompt for number of children
        int numberOfChildren;
        do {
            System.out.print("Enter the number of children for the job (1 - 9): ");
            numberOfChildren = scanner.nextInt();
        } while (numberOfChildren < 1 || numberOfChildren > 9);

        // Prompt for hours
        int hours;
        do {
            System.out.print("Enter the number of hours for the job (1 - 12): ");
            hours = scanner.nextInt();
        } while (hours < 1 || hours > 12);

        // Create job number string
        String jobNumberString = String.format("%02d%04d", year % 100, jobNumber);

        // Create BabysittingJob object
        BabysittingJob job = new BabysittingJob(jobNumberString, babysitterCode, numberOfChildren, hours);

        // Display job details
        System.out.println("\nJob Details:");
        job.displayJobDetails();
    }

}
