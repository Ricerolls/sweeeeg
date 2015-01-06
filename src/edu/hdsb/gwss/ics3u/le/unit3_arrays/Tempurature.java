/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics3u.le.unit3_arrays;

import java.util.Scanner;

/**
 *
 * @author 1leste
 */
public class Tempurature {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        String[ ] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"} ;
        int[] temperature = new int[7];

        for( int i = 0; i < temperature.length; i++ ) {
            
            System.out.print( "On " + days[i] + " the tempurature is: " );
            temperature[i] = input.nextInt();
        }
        for( int i = 0; i < temperature.length; i++ )
            System.out.print( days[i] + ": " + temperature[i] + " degree " );
        
    }
}
