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
public class RightTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
	
	//Variables
        Scanner input = new Scanner(System.in);

        int a;
        int b;
        int c;
        int temp;
	
	//User input and output
        System.out.println("What is the side length of a");
        a = input.nextInt();
        System.out.println("What is the side length of b");
        b = input.nextInt();
        System.out.println("What is the side length of c");
        c = input.nextInt();


	//Switching variables for higher variables.
        if ( a > c ) {
            temp = a;
            a = c;
            c = temp;
            }
        if ( b > c) {
            temp = b;
            b = c;
            c = temp;
        }
	//Squaring the 2 variables to get a sum equal to a squared c
        if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2) ) {
        System.out.println("This is a right triangle.");
	
	//If the values aren't the same, than it declared as not a right triangle
        } else
            System.out.println("This is not a right triangle");
        }


}
