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
public class Triangle {

 /**
 * Name:    Steven Le
 * Date:    Sept 24, 2013
 * Version: v0.1
 * Description: This program will declare if the given value of a triangle
 *		is an actual triangle.
 * @author 1leste
 */

    public static void main(String[] args) {
        // TODO code application logic here
	
	//Variable
        Scanner input = new Scanner(System.in);

        int a;
        int b;
        int c;
        int temp;
	
	//User input and Output
        System.out.println("What is the side length of a");
        a = input.nextInt();
        System.out.println("What is the side length of b");
        b = input.nextInt();
        System.out.println("What is the side length of c");
        c = input.nextInt();
	
	//Switching variable with lower values 
        if ( a > c ) {
           temp = a;
           a = b;
           b = temp;
        }
        if ( b > c) {
            temp = b;
            b = c;
            c = temp;

        }
	
	//Adding the sum of 2 sides and declaring if its a triangle
        if (a + b > c && b + c > a && a + c > b) {
         System.out.println("This is a triangle.");
        } else
          System.out.println("This is not a triangle.");

    }


}
