/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bargraph;
import java.util.Scanner;
/**
 *
 * @author RR
 */
public class BarGraph {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter cars sold by Pam>> ");
        int pamCarsSold = scanner.nextInt();

        System.out.print("Enter cars sold by Leo>> ");
        int leoCarsSold = scanner.nextInt();

        System.out.print("Enter cars sold by Kim>> ");
        int kimCarsSold = scanner.nextInt();

        System.out.print("Enter cars sold by Bob>> ");
        int bobCarsSold = scanner.nextInt(); 
        // Print "X" for each car sold by each salesperson
        System.out.println("Car Sales for Month");
        System.out.println("Pam " + getXString(pamCarsSold));
        System.out.println("Leo " + getXString(leoCarsSold));
        System.out.println("Kim " + getXString(kimCarsSold));
        System.out.println("Bob " + getXString(bobCarsSold));   
    }
    private static String getXString(int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append("X");
        }
        return sb.toString();
    }
}