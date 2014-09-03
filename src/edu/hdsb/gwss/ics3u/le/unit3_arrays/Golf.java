/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics3u.le.unit3_arrays;

import java.util.Scanner;

/**
 *
 * @author 1leste
 */
public class Golf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int[] scores = new int[18];

        for( int i = 0; i < scores.length; i++ ) {
            System.out.print( "Hole #" + (i+1) + " Score: " );
            scores[i] = input.nextInt();
        }
        //int sum = 0
        for( int i = 0; i < scores.length; i++ ) {
            System.out.println( "Score Hole #" + (i+1) + " Score: " + scores[i] );
        
            //to find the sum
        // sum = sum + scores [i];
        // System.out.println (sum / score.length);
        }
        
        
        
//        System.out.println();
//        hole[0] = input.nextInt();
//        hole[1] = input.nextInt();
//        hole[2] = input.nextInt();
//        hole[3] = input.nextInt();
//        hole[4] = input.nextInt();
//        hole[5] = input.nextInt();
//        hole[6] = input.nextInt();
//        hole[7] = input.nextInt();
//        hole[8] = input.nextInt();
//        hole[9] = input.nextInt();
//        System.out.println();

    }
}
