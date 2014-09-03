/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.hdsb.gwss.ics3u.le;

/**
 *
 * @author 1leste
 */
public class FibonacciSequence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int a = 1;
        int b = 1;
        int c = a + b;
        int counter = 1;

        while (counter < 20 ) {
            a = b;
            b = c;
            c = a + b;
            counter++;
            System.out.print(c +", ");
            
        }

    }

}
