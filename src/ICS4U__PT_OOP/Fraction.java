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
public class Fraction implements FractionInterface {
    public int numerator;
    public int denominator;
    private double value;


    
    
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    private Fraction() {
        
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
    
    public double size() {
       return this.value;
    }
    public Fraction larger(Fraction f) {
        Fraction g = null ;
        
        if (f.equals(g)) {
            return f;
        } else 
            return g;
    
}
    public Fraction larger(Fraction f, Fraction g) {
        if (f.size() < g.size()) {
            return g;
        } else
       return f;
}
    public Fraction times(Fraction f) {
        Fraction newFraction = new Fraction();
         if ((denominator == 0) || (f.denominator == 0)) {      
            newFraction.denominator = denominator * f.denominator; 
            newFraction.numerator = numerator * f.numerator; 
            newFraction = newFraction.reduce(); 
            
         } return newFraction;
       
  
         
}
    public Fraction times(Fraction f, Fraction g) {
       
}
    public Fraction reduce() {
        Fraction f = new Fraction();
        int number = 0;
        int numrator = Math.abs(this.numerator);
        int demrator = Math.abs(this.denominator);
        
        
        
    }
    public  boolean equals (Fraction f) {
        Fraction g = f;
        if (f.equals(g)) {
            return true;
        } else
            return false;
    }
    public static void invert (){
        Fraction f = null;
        if (f.numerator < 0) {
            int newNumerator;
            newNumerator = f.numerator * -1;
            int temp;
            temp = newNumerator;
            
            
        }
        else if (f.denominator < 0) {
            int newDem;
            newDem = f.denominator * -1;
        }
            
        
    }
    
    @Override
    public String toString() {
        return "Fraction{" + "numerator=" + numerator + ", denominator=" + denominator + ", value=" + numerator/denominator + '}';
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
