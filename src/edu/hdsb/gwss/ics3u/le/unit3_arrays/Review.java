/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics3u.le.unit3_arrays;

/**
 *
 * @author 1leste
 */
public class Review {

   static StevensArrayUtilities sau = new StevensArrayUtilities();

    public static void main(String[] args) {
        // TODO code application logic here
        String[][] array = new String[20][30];

        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                array[row][col] = "+";
            }
        }
        
        for (int row = 1; row < array.length + 1; row = row + 2) {
            for (int col = 0; col < array[row].length; col++) {
                array[row][col] = "*";
            }
        }
        
        sau.displayArray(array);
    }
}
