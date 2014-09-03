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
public class HallCost {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = input.nextLine();
        System.out.println("How many people are there?");
        int guest = input.nextInt();
        System.out.println("Cost per person?");
        int per = input.nextInt();

        int cost = (guest * per)+ 350;

        System.out.println("Hello " + name + " the cost will be: $ " + cost);





    }
}
