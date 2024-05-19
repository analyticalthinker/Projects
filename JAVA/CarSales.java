/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carsales;

import java.util.Scanner;

public class CarSales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of cars sold by Pam: ");
        int pamCarsSold = scanner.nextInt();

        System.out.print("Enter the number of cars sold by Leo: ");
        int leoCarsSold = scanner.nextInt();

        System.out.print("Enter the number of cars sold by Kim: ");
        int kimCarsSold = scanner.nextInt();

        // Print "X" for each car sold by each salesperson
        System.out.println("Pam: " + getXString(pamCarsSold));
        System.out.println("Leo: " + getXString(leoCarsSold));
        System.out.println("Kim: " + getXString(kimCarsSold));
    }

    private static String getXString(int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append("X");
        }
        return sb.toString();
    }
}
