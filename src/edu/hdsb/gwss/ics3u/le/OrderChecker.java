/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stevenhomeproject;

import java.util.Scanner;

/**
 *
 * @author jefftruong
 */
public class OrderChecker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Varibles
        
        final int blotPrice = 5;
        final int nutPrice = 3;
        final int washerPrice = 1;
        int numBlot;
        int numNut;
        int numWasher;
        int totalCost;
        
        Scanner input = new Scanner(System.in);
          
        //User inputs
        System.out.println("How many blotts?");
        numBlot = input.nextInt();
        System.out.println("How many nuts?");
        numNut = input.nextInt();
        System.out.println("How many washers ?");
        numWasher = input.nextInt();
        totalCost = (numBlot*blotPrice + numNut*nutPrice + numWasher*washerPrice);
        
        System.out.println(" ");
        
        //Statements and out put
        if ( 2 * numBlot>= numWasher )  
        if ( numBlot>= numNut ) {
           System.out.println("Order is ok");
    } 
        if ( numBlot<=numNut ) {
           System.out.println("Check the Order: too few nuts");
        }
        if ( 2 * numBlot<= numWasher) {
            System.out.println("Check the Order: too few washers");
        }
        
        System.out.println("Your total cost is: " + totalCost);
       
        
    }
}

