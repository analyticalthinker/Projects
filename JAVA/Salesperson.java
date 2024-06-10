/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demosalesperson;

/**
 *
 * @author RR
 */
class Salesperson {
    private int idNumber;
    private double annualSalesAmount;

    // Constructor
    public Salesperson(int idNumber, double annualSalesAmount) {
        this.idNumber = idNumber;
        this.annualSalesAmount = annualSalesAmount;
    }
    // Getter and Setter methods for idNumber
    public int getIdNumber() {
        return idNumber;
    }
    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }
    // Getter and Setter methods for annualSalesAmount
    public double getAnnualSalesAmount() {
        return annualSalesAmount;
    }
    public void setAnnualSalesAmount(double annualSalesAmount) {
        this.annualSalesAmount = annualSalesAmount;
    }
    // Override toString method to display Salesperson details
    @Override
    public String toString() {
        return "Salesperson ID: " + idNumber + ", Annual Sales Amount: $" + annualSalesAmount;
    }
}
