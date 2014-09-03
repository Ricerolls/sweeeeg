/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics3u.le;

import java.util.Scanner;

/**
 * Name:    Steven Le
 * Date:    Oct 3rd, 2013
 * Version: v0.1
 * Description: You start with 50 coins, and it will ask the user to press enter 
 * if they want to pull the slot machine. If they get the same number of digits,
 * they get bonus coins for the slot machine. Once the user uses all of his/her 
 * coins, the program will than stop.
 * @author 1leste
 */
public class SlotMachine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Varibles
        Scanner input = new Scanner(System.in);
        double randomRealNumber;
        randomRealNumber = Math.random();
        int coins = 50;
        int reward;
        String retry = "y";
        
        //Outputs 
        System.out.println("Press enter to start the slot machine\n");
        retry = input.nextLine();
        System.out.println("Slot Machine\n");
        System.out.println("Coins left: " + coins + "\n");
        
        //loops the entire slot machine
        while (coins > 0) {
            int varA = (int) (Math.random() * 4) + 1;
            int varB = (int) (Math.random() * 4) + 1;
            int varC = (int) (Math.random() * 4) + 1;
            System.out.println("| Slot 1 | Slot 2 | Slot 3 |");
            System.out.format("%6s %7s %9s" + "\n", varA, varB, varC);
            coins--;
            
            //Logic of winning
            if (varA == 1 && varB == 1 && varC == 1) {
                reward = 4;
                System.out.println("You won +4 coins");
                coins = reward + coins;
            } else if (varA == 2 && varB == 2 && varC == 2) {
                reward = 6;
                System.out.println("You won +6 coins");
                coins = reward + coins;
            } else if (varA == 3 && varB == 3 && varC == 3) {
                reward = 8;
                System.out.println("You won +8 coins");
                coins = reward + coins;
            } else if (varA == 4 && varB == 4 && varC == 4) {
                reward = 10;
                System.out.println("You won +10 coins");
                coins = reward + coins;
            } else if (varA == varB && varA == varC && varB == varC) {
                reward = 0;
                System.out.println("You won nothing :)");
                coins = reward + coins;
            }
            //prints out the total
            System.out.println("You now have " + coins + " coins.\n");
            
            //option to retry the slot machine
            System.out.println("Press enter to pull the handle again.");
            retry = input.nextLine();

        }
    }
}
