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
public class ScannerTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here



        // Money (localized)
        NumberFormat money = NumberFormat.getCurrencyInstance();

        Scanner input = new Scanner ( System.in );
        System.out.println( "Cost of meal");
        double cost = input.nextDouble();
        cost = cost * 1.1343432;
        System.out.println ( "Cost: " + money.format(cost) );
    }

}
