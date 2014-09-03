/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics3u.le.lib;

/**
 *
 * @author 1leste
 */
public class ArrayMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public static int findMax(int[] data) {

        int max = data[0];
        for (int i = 0; i < data.length; i++) {
            if (data[i] > max) {
                max = data[i];
            }
        }
        return max;
    }

    public static int findLow(int[] data) {

        int low = data[0];
        for (int i = 0; i < data.length; i++) {
            if (data[i] < low) {
                low = data[i];
            }
        }
        return low;
    }

    public static int avg(int[] data) {
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum = sum + data[i];
        }
        return sum / data.length;
    }

}
