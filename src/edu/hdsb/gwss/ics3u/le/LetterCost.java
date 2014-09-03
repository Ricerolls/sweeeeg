
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Name:    Steven Le
 * Date:    Sept 24, 2013
 * Version: v0.1
 * Description: This program will calculate the cost of sending a first class or
 *              second class letter depending on the mass of the letter
 * @author 1leste
 */
public class LetterCost {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Objects

        Scanner input = new Scanner(System.in);

        //Varibles

        int choice;
        double cost;
        double mass = 0;

        //script

        System.out.println("This program will calculate the cost of sending a first class\n"
                + "or second class letter depending on the mass of the letter");
        System.out.println("");
        System.out.println("Enter a 1 for class 1 and 2 for class 2: ");
        choice = input.nextInt();
        
        //User Choice
        if (choice != 1 && choice != 2) {
            System.out.println("Invalid, please enter 1 or 2");
        } else if (choice == 1) {
            System.out.println("Please enter the mass of the letter (in grams): ");
            mass = input.nextDouble();
        
            //First Class
            if (mass <= 30) {
                System.out.println("Cost will be: $0.38");
            } else if (mass <= 50) {
                System.out.println("Cost will be: $0.55");
            } else if (mass <= 100) {
                System.out.println("Cost will be: $0.73");
            } else if (mass > 100) {
                cost = ((((mass - 101)/50)+1)*0.24+0.73);
                System.out.println("Cost will be: $"+ cost);
            }
        }

            //Second Class
            if (choice == 2) {
            System.out.println("Please enter the mass of the letter (in grams): ");
            mass = input.nextDouble();
            
            if (mass <= 30) {
                System.out.println("Cost will be: $0.28");
            } else if (mass <= 50) {
                System.out.println("Cost will be: $0.40");
            } else if (mass <= 100) {
                System.out.println("Cost will be: $0.55");
            } else if (mass > 100) {
                cost = ((((mass - 101)/50)+1)*0.19+0.55);
                System.out.println("Cost will be: $"+ cost);
            }
            

    }
    }
}
