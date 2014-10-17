/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics4u1.le;

/**
 *
 * @author 1leste
 */
public class Dice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variable
        int[][] outcomes = new int [6][6];
        int []sum = new int[11];
        int die1, die2;
        
        for (int roll = 0; roll < 36000;roll++) {
            die1 = (int) (Math.random() * 6) + 1;
            die2 = (int) (Math.random() * 6) + 1;
            
            outcomes[die1-1][die2-1]++;
            
            System.out.format("\t Dice 1 Dice 2");
            System.out.format("%6s %7s %7s %7s %7s %7s \n", 
                             "Die 1", "1", "2", "3", "4", "5", "6" );
            
            
            //Displays row
            for (int row = 0; row < 6; row++) {
            System.out.format("%6d", row +1);
             for (int col  = 0; col < 6; col++) {
            System.out.format("%7d", outcomes[row][col]);
            
        }
             System.out.println("\n");
        }
            
//            for (int i = 0; i <sum.length; i++){
                
            }
    }}
    
}
