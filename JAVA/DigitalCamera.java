/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package digitalcamera;

/**
 *
 * @author u6023321
 */
public class DigitalCamera {
    private String brand;
    private int megapixels;
    private double price;

    public DigitalCamera(String brand, int megapixels) {
        this.brand = brand;
        if (megapixels > 10) {
            this.megapixels = 10;
        } else {
            this.megapixels = megapixels;
        }
        if (this.megapixels <= 6) {
            this.price = 99.0;
        } else {
            this.price = 129.0;
        }
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Megapixels: " + megapixels);
        System.out.println("Price: $" + price);
        System.out.println();
    }
}
