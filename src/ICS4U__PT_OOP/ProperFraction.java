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
public class ProperFraction extends Fraction  {
     
     public ProperFraction(int numerator, int denominator) {
        super(numerator, denominator);
    }
     public static void toMix() {
         
     }


    @Override
    public String toString() {
        return "Fraction{" + "numerator=" + numerator + ", denominator=" + denominator + ", value=" + value + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + this.numerator;
        hash = 41 * hash + this.denominator;
        return hash;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Fraction other = (Fraction) obj;
        if (this.numerator != other.numerator) {
            return false;
        }
        if (this.denominator != other.denominator) {
            return false;
        }
        return true;
    }
}
