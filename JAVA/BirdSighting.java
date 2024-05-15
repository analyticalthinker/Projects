/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package birdsighting;


public final class BirdSighting {
    private String species;
    private int numberSeen;
    private int dayOfYear;
    // Default constructor
    public BirdSighting() {
        species = "robin";
        numberSeen = 1;
        dayOfYear = 1;
    }
    // Overloaded constructor 1
    public BirdSighting(String species, int numberSeen, int dayOfYear) {
        this.species = species;
        this.numberSeen = numberSeen;
        this.dayOfYear = dayOfYear;
    }
    // Overloaded constructor 2
    public BirdSighting(String species) {
        this.species = species;
        this.numberSeen = 1;
        this.dayOfYear = 1;
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