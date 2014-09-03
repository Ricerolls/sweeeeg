/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics3u.le;

/**
 *
 * @author jefftruong
 */
public class Erosion {

     /**
 * Name:    Steven Le
 * Date:    Oct 3rd, 2013
 * Version: v0.1
 * Description: This program will calculate the depth of canada's soil and the 
 * amount of years it will take to reach 9cm of soil
 * @author 1leste
 */
    public static void main(String[] args) {
       
        // Varibles
        int years = 0;
        double canadaSoil = 30;
        double canadaSoilErode;
        
        // While loops if canada's soil is greater than 9cm
        while (canadaSoil >= 9){
            
            //Year counter, and the equation behind this
            years++;
            System.out.print("Years: " + years + "  Canada's Top Soil: ");
            canadaSoilErode = canadaSoil / 100;
            canadaSoil = canadaSoil - canadaSoilErode;
            System.out.print(canadaSoil+ "cm\n");
            

        }
        
        
        
    }
}
