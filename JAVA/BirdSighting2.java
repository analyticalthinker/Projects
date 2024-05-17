/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package birdsighting2;

/**
 *
 * @author u6023321
 */
public class BirdSighting2 {
    private String species;
    private int numberSeen;
    private int dayOfYear;

    // Default constructor
    public BirdSighting2() {
        this("robin", 1, 1);
    }

    // Three-parameter constructor
    public BirdSighting2(String species, int numberSeen, int dayOfYear) {
        this.species = species;
        this.numberSeen = numberSeen;
        this.dayOfYear = dayOfYear;
    }

    // Getter methods
    public String getSpecies() {
        return species;
    }

    public int getNumberSeen() {
        return numberSeen;
    }

    public int getDayOfYear() {
        return dayOfYear;
    }
}
