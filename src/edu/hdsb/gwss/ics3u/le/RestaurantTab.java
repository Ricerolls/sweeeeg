/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.hdsb.gwss.ics3u.le;

import java.util.Scanner;

/**
 *
 * @author 1leste
 */
public class RestaurantTab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner ( System.in);

        System.out.println( "Cost of burger?");
        double burger = input.nextDouble();
        System.out.println( "Cost of drink?");
        double drink = input.nextDouble();;
        System.out.println( "Cost of hotdog?");
        double hotdog = input.nextDouble();
        System.out.println( "Cost of fries?");
        double fries = input.nextDouble();
        
        double tax = 0.13;
        double subtotal = (burger + drink + hotdog + fries);
        double total = (subtotal * tax) + subtotal;

        System.out.println(" ");
        System.out.println("Subtotal : $" + subtotal);
        System.out.println("Tax : $" + tax);
        System.out.println("The total is : $" + total);


    }

}
