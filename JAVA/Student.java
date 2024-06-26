/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package student;

/**
 *
 * @author u6023321
 */
public class Student {
    private String studentNumber;
    private String firstName;
    private String lastName;
    private double overallGPA;
    private String major;

    public Student(String studentNumber, String firstName, String lastName, double overallGPA, String major) {
        this.studentNumber = studentNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.overallGPA = overallGPA;
        this.major = major;
    }

    // Getters and Setters
    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getOverallGPA() {
        return overallGPA;
    }

    public void setOverallGPA(double overallGPA) {
        this.overallGPA = overallGPA;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}

