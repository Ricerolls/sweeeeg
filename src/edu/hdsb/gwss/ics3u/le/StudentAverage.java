/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.hdsb.gwss.ics3u.le;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author 1leste
 */
public class StudentAverage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);
        NumberFormat percent = NumberFormat.getPercentInstance();
        
        System.out.println("What is your name?");
        String name = input.nextLine();
        System.out.println("What is your average for your first subject? (in decimal)");
        double mark1 = input.nextDouble();
        System.out.println( percent.format( mark1 ) );
        System.out.println("What is your average for your second subject? (in decimal)");
        double mark2 = input.nextDouble();
        System.out.println( percent.format( mark2 ) );
        System.out.println("What is your average for your thrid subject? (in decimal)");
        double mark3 = input.nextDouble();
        System.out.println( percent.format( mark3 ) );
        System.out.println("What is your average for your forth subject? (in decimal)");
        double mark4 = input.nextDouble();
        System.out.println( percent.format( mark4 ) );
        
        double subtotal = (mark1 + mark2 + mark3 + mark4);
        double total = (subtotal / 4 );
        
        System.out.println( name + " your total average is :" + total);
        

    }

}
