/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics3u.le.unit3_arrays;

/**
 *
 * @author 1leste
 */
public class PowerTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int table[][];
        table = new int[15][15];

        for (int i = 0; i < 15; i++) {
            table[i][0] = i + 1;
            for (int j = 1; j < 15; j++) {
                table[i][j] = table[i][j - 1] * (i + 1);
        System.out.println(table.length);
            }

        }
    }
}
