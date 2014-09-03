/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics3u.le;

/**
 *
 * @author 1leste
 */
public class ClosertoTwo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        double result = 0;
        long dem = 1;

        while (result < 2) {
            System.out.print(result + " + 1/" + dem + " = ");
            result = result + (1.0 / dem);
            dem = dem * 2;
            System.out.print(result+"\n");
        }

    }
}
