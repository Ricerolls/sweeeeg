/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.hdsb.gwss.ics3u.le;

/**
 *
 * @author 1leste
 */
public class OunceAndGrams {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int ounce = 1;
        double grams = 0;

        System.out.println("This program will print out a titled table that\n" + "be used to convert ounces to grams, for values\n" + " from 1 to 15. (1 ounce = 28.35 grams)");

        System.out.format("%-8s %-8s", "Ounces", "Grams");
        System.out.println(" ");
                
        while (ounce <=15) {
            
            grams=grams+28.35;
            System.out.format("%-8s %-8.2f\n", ounce, grams);
            ounce++;
        }
        
        
        
        
    }

}
