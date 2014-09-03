/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stevenhomeproject;

import java.util.Scanner;

/**
 *
 * @author jefftruong
 */
public class WhichAlien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Varibles

        Scanner input = new Scanner(System.in);
        // User Input
        System.out.println("How many antennas does the alien have?");
        int numAntennas = input.nextInt();
        System.out.println("How many eyes does the alien have?");
        int numEyes = input.nextInt();

        //If Statements and output
        if (numAntennas >= 3 && numEyes < 4) {
            System.out.println("TroyMartian");
        }
        if (numAntennas < 6 && numEyes >= 2) {
            System.out.println("VladSaturnian");
        }
        if (numAntennas < 2 && numEyes < 3) {
            System.out.println("GraemeMercurian");
        }
        







        }
    }
