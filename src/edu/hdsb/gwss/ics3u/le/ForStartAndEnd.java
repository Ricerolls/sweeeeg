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
public class ForStartAndEnd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner ( System.in );

        System.out.println("Enter your start value");
        int num = input.nextInt();
        System.out.println("Enter your end value");
        int end = input.nextInt();

        for (  ; num<=end ; num++ ) {
           
            System.out.println(num);
        }
    }

}
