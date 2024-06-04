/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package createbabysittingjob;

/**
 *
 * @author RR
 */
class BabysittingJob {
    private String jobNumber;
    private int babysitterCode;
    private String babysitterName;
    private int numberOfChildren;
    private int hours;
    private double fee;

    public BabysittingJob(String jobNumber, int babysitterCode, int numberOfChildren, int hours) {
        this.jobNumber = jobNumber;
        this.babysitterCode = babysitterCode;
        this.numberOfChildren = numberOfChildren;
        this.hours = hours;

        determineBabysitterName();
        calculateFee();
    }

    private void determineBabysitterName() {
        switch (babysitterCode) {
            case 1:
                babysitterName = "Cindy";
                break;
            case 2:
                babysitterName = "Greg";
                break;
            case 3:
                babysitterName = "Marcia";
                break;
            default:
                babysitterName = "Unknown";
                break;
        }
    }

    private void calculateFee() {
        if (babysitterCode == 1) {
            fee = 7 * numberOfChildren * hours;
        } else {
            fee = (9 + ((numberOfChildren-1) * 4)) * hours;
        }
    }

    public void displayJobDetails() {
        System.out.println("Job Number: " + jobNumber);
        System.out.println("Babysitter Code: " + babysitterCode);
        System.out.println("Babysitter Name: " + babysitterName);
        System.out.println("Number of Children: " + numberOfChildren);
        System.out.println("Hours: " + hours);
        System.out.println("Fee: $" + fee);
    }
}
