/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics3u.le;

import java.util.Scanner;

/**
 * Name: Steven Le Date: October 25th, 2013 Version: v0.1 Description: This
 * program calculates your weekly gross wage depending on how many hours you
 * work. Also shows you how much money you would make if you were working in
 * Bangladesh, China, Dominican Republic, or Haiti
 *
 * @author Steven
 */
public class GrossWagie2 {

    //these are the pay every hour in each country
    public static final double BANGLADESH = 0.15;
    public static final double CHINA = 0.48;
    public static final double DOMINICAN_REPUBLIC = 1.60;
    public static final double HAITI = 0.55;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //the variblies are declared through the respective methods as they return values for the varibles
        double TotalHours = TotalHours();
        double hourlyWage = hourlyWage();
        double GrossPay = GrossPay(TotalHours, hourlyWage);

        //program prints out your total pay depending on your hours worked & calculates
        //the total pay in other countrys
        System.out.println("Your gross pay will be: $" + GrossPay);
        System.out.println("In Bangladesh your total would be: $" + (TotalHours * BANGLADESH));
        System.out.println("In China your total would be: $" + (TotalHours * CHINA));
        System.out.println("In the Domincan Republic your total would be: $" + (TotalHours * DOMINICAN_REPUBLIC));
        System.out.println("In Haiti your total would be: $" + (TotalHours * HAITI));
    }

    public static double TotalHours() {

        //method gets input for the number of hours and returns the input to the method
        Scanner input = new Scanner(System.in);
        System.out.println("This program will tell you your total pay"
                + " every week depending on your wage and the hours you work");
        double TotalHours;
        System.out.println("please enter the number of hours that you work a week: ");
        TotalHours = input.nextDouble();
        return TotalHours;

    }

    public static double GrossPay(double TotalHours, double hourlyWage) {

        //method calculates the persons gross wage depending on thier hours and wages and returns a varible
        double GrossPay;
        if (TotalHours <= 40) {
            GrossPay = TotalHours * hourlyWage;
        } else {
            GrossPay = (40 * hourlyWage) + (TotalHours - 40) * (hourlyWage * 1.5);
        }
        return GrossPay;
    }

    public static double hourlyWage() {

        //method gets input for the amount of money someone gets and returns the input to the method
        Scanner input = new Scanner(System.in);
        double hourlyWage;
        System.out.println("please enter your hourly wage: ");
        hourlyWage = input.nextDouble();
        return hourlyWage;
    }
}