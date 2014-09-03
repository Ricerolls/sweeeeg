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
 * Description: This
 * program is a game of rock,paper,scissors. The user is given a option to
 * choose any of these 3 option against a computer that will randomly generate
 * there own option.
 *
 * @author 1leste
 */
public class RockPaperScissors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //the variblies are declared through the respective methods as they return values for the varibles
        int userChoice = userChoice();
        int computerChoice = computerChoice();
        outcome(userChoice, computerChoice);

    }
//user chooses a option by typing in a number

    public static int userChoice() {
        Scanner input = new Scanner(System.in);
        int userChoice;
        System.out.println("1. Rock\n2. Paper\n3. Scissors\n");
        System.out.println("Select a option:");
        userChoice = input.nextInt();
        return userChoice;
    }

    //random option the user chooses
    public static int computerChoice() {

        int computerChoice;
        computerChoice = (int) (Math.random() * 3) + 1;
        return computerChoice;

    }

    //outcome of the option deciding if you win,lose,or have a draw
    public static void outcome(int userChoice, int computerChoice) {

        if (computerChoice == userChoice) {
            //draw
            System.out.println("Draw: User choice #" + userChoice + "and computer #" + computerChoice);

        } else if (userChoice() == 1 && computerChoice == 3 || userChoice == 2 && computerChoice == 1 || userChoice == 3 && computerChoice == 2) {
            //win
            System.out.println("User choice #" + userChoice + " beats computer choices #" + computerChoice);

        } else {
            //lose
            System.out.println(" Computer choice #" + computerChoice + " beats user choices #" + userChoice);

        }
    }
}
