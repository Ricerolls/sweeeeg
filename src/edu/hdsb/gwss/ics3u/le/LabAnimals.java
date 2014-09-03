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
public class LabAnimals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        int hour = 1;

        System.out.println("Enter the initial population");
        int population = input.nextInt();
        System.out.println("Enter the inital food supply");
        int foodsupply = input.nextInt();
        System.out.println("Enter amount of food added each hour");
        int foodEachHour = input.nextInt();

        System.out.format("%5s %12s %10s %13s %10s\n", "Hour", "Animal at start", "Food at start", "Food at end", "Animal at end");


    }
}
