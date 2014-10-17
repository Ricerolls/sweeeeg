/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit2_objectsOrientedProgram;

/**
 *
 * @author 1leste
 */
public class Candy {
    
    public final int id = 0;
    
    private String colourOfWrapper;
    private String flavour;
    private String brand;
    private double mass;
    private double height;
    private int amountOfCandy;

    public Candy() {
    }

    public Candy(String colourOfWrapper) {
        this.colourOfWrapper = colourOfWrapper;
    }
   
    public String getColourOfWrapper() {
        return colourOfWrapper;
    }

    public void setColourOfWrapper(String colourOfWrapper) {
        this.colourOfWrapper = colourOfWrapper;
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAmountOfCandy() {
        return amountOfCandy;
    }

    public void setAmountOfCandy(int amountOfCandy) {
        this.amountOfCandy = amountOfCandy;
    }
    
    
}
