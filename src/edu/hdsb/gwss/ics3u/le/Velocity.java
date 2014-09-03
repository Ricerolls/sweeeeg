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
public class Velocity {

    public static double velocity;
    public static double distance;
    public static double time;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        getData();
        CalAndDisplay();
    }

    public static void getData() {

        Scanner input = new Scanner(System.in);
        System.out.println("What is the displacement?");
        distance = input.nextDouble();
        System.out.println("What is the time?");
        time = input.nextDouble();
    }
    public static void CalAndDisplay() {

        velocity = distance / time;
        System.out.println("Your velocity is: " + velocity + "m/s");
    }
}
