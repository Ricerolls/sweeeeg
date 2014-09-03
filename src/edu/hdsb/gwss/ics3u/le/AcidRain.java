/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.hdsb.gwss.ics3u.le;

import java.util.Scanner;

/**
 * Name:    Steven Le
 * Date:    Sept 16, 2013
 * Version: v0.1
 * Description: This program will measure the acidity in water and other substances.
 * @author 1leste
 */
public class AcidRain {

    public static void main(String[] args) {

        //Variable swagggggggg
        Scanner input = new Scanner ( System.in );

        //Message
        System.out.println( "Acid rain is a environmental problem. This program will determine if the pH lever in water is safe for fish");
        System.out.println( " ");
        System.out.println( "What is the PH of the water?");

        //User Input and Varible
        double pH = input.nextDouble();

        //If Statement
        if (pH >= 6.5 && pH <= 7.5) {
        System.out.println( "NEUTRAL - FISH IN STREAMS, RIVERS AND LAKES WILL SURVIVE.");
        } else if (pH < 0 || pH > 14 ) {
        System.out.println("pH is invaild");
        } else if (pH <= 6.5) {
        System.out.println("TOO ACIDIC - FISH IN STREAMS, RIVERS AND LAKES WILL NOT SURVIVE.");
        } else if (pH >= 7.5) {
        System.out.println("TOO ALKALINE - FISH IN STREAMS, RIVERS AND LAKES WILL NOT SURVIVE.");
        
            
        }

    }

}
