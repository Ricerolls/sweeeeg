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
public class CompoundInvest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner ( System.in );
    NumberFormat money = NumberFormat.getCurrencyInstance();
    
    double interestTotal;
    double total = 0;
    double amountInAccount;
    
    
    System.out.println("Enter the yearly investment: ");
    double investment = input.nextDouble();
    System.out.println("Enter the interest rate (%): ");
    double interest = input.nextDouble();
    System.out.println("Enter the number of years: ");
    int year = input.nextInt();

    System.out.format("%5s %12s %10s %13s\n", "Year", "Amount in account", "Interest", "Total");

    if (year <=15 ) {
 
        for ( int yearCounter = 1; yearCounter <= year ; yearCounter++ )  {
           
           amountInAccount = total + investment;
           interestTotal = ((interest/100)*amountInAccount);
           total = interestTotal + amountInAccount;
           
           System.out.format("%5s %12s %14s %14s\n", +yearCounter, money.format(amountInAccount), money.format(interestTotal), money.format(total));
        }
        }else System.out.println("Invalid year");


    }

}
