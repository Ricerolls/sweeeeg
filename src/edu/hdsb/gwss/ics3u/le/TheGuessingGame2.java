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
public class TheGuessingGame2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);


        double randomRealNumber = Math.random();
        int userNumber;
        int guessCounter = 0;
        String retry;
        int secretNumber = (int) (Math.random() * 20) + 1;
        System.out.println("Enter a number between 1 - 20: ");
        userNumber = input.nextInt();
        
        while (userNumber != secretNumber) {
                
            if (userNumber > secretNumber && userNumber >= 1 && userNumber <= 20) {
                System.out.println("Secret Number: " + secretNumber);
                System.out.println("The Number you guessed: " + userNumber);
                System.out.println("Too high");
                System.out.println("Try again.");
                guessCounter++;
                
                
            } else if (userNumber < secretNumber) {
                System.out.println("Secret Number: " + secretNumber);
                System.out.println("The Number you guessed: " + userNumber);
                System.out.println("Too Low");
                System.out.println("Try again.");
                guessCounter++;       
                break;
                
            } else {
                System.out.println("Secret Number: " + secretNumber);
                System.out.println("The Number you guessed: " + userNumber);
                System.out.println("You Won!");
                System.out.println("It took you " + guessCounter + " guesses.");
                
            }
        }




    }
}
