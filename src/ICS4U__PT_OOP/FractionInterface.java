/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ICS4U__PT_OOP;

/**
 *
 * @author 1leste
 */
public interface FractionInterface {
    public double size();
    public Fraction larger(Fraction f);
    public Fraction larger(Fraction f, Fraction g); 
    public Fraction times(Fraction f);
    public boolean equals (Fraction f);
    public Fraction times(Fraction f, Fraction g);
    public Fraction reduce();
}
