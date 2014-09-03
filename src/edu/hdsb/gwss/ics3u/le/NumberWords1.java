/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics3u.le;

import java.util.Scanner;

/**
 * Name: Steven Le 
 * Date: October 24th, 2013 
 * Version: v0.1 
 * Description: This program will convert any number you put into words.
 *
 * @author 1leste
 */
public class NumberWords1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //input user number
        System.out.println("Enter your number: ");
        int number = input.nextInt();

        //declares what number type it is
        if (number >= 10 && number <= 19) {
            teens(number);
        } else if (number % 100 >= 10 && number % 100 <= 19) {
            hundreds(number);
            teens(number % 100);
        } else {
            hundreds(number);
            tens(number);
            ones(number);
        }

    }
    //goes to hundred method if the number isn't a teen or a ten

    public static void hundreds(int number) {
        int hundreds = (number / 100) % 10;
        switch (hundreds) {
            case 1:
                System.out.println("one hundred");
                break;
            case 2:
                System.out.println("two hundred");
                break;
            case 3:
                System.out.println("three hundred");
                break;
            case 4:
                System.out.println("four hundred");
                break;
            case 5:
                System.out.println("five hundred");
                break;
            case 6:
                System.out.println("six hundred");
                break;
            case 7:
                System.out.println("seven hundred");
                break;
            case 8:
                System.out.println("eight hundred");
                break;
            case 9:
                System.out.println("nine hundred");
                break;

        }
    }
//goes to tens method if the number isn't a hundred or a one

    public static void tens(int number) {
        int tens = (number / 10) % 10;
        switch (tens) {
            case 1:
                System.out.println("ten");
                break;
            case 2:
                System.out.println("twenty");
                break;
            case 3:
                System.out.println("thrity");
                break;
            case 4:
                System.out.println("fourty");
                break;
            case 5:
                System.out.println("fifty");
                break;
            case 6:
                System.out.println("sixty");
                break;
            case 7:
                System.out.println("seventy");
                break;
            case 8:
                System.out.println("eighty");
                break;
            case 9:
                System.out.println("ninety");
                break;
        }
    }
//goes to ones method if the number isn't a hundred or a ten

    public static void ones(int number) {

        int ones = number % 10;
        switch (ones) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 9:
                System.out.println("nine");
                break;

        }
    }
//goes to teens method if the number isn't a hundred, tens, or a one

    public static void teens(int number) {
        switch (number) {
            case 10:
                System.out.println("ten");
                break;
            case 11:
                System.out.println("eleven");
                break;
            case 12:
                System.out.println("twelve");
                break;
            case 13:
                System.out.println("thirteen");
                break;
            case 14:
                System.out.println("fourteen");
                break;
            case 15:
                System.out.println("fithteen");
                break;
            case 16:
                System.out.println("sixteen");
                break;
            case 17:
                System.out.println("seventeen");
                break;
            case 18:
                System.out.println("eighteen");
                break;
            case 19:
                System.out.println("nineteen");
                break;
        }

    }
}
