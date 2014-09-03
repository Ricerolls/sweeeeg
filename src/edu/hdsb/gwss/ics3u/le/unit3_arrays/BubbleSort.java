/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics3u.le.unit3_arrays;

/**
 *
 * @author 1leste
 */
public class BubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] data = new int[10];
        randomNumber(data);
        bubble(data);
        displayNumber(data);

    }

    public static void randomNumber(int[] data) {

        for (int i = 0; i < data.length; i++) {
            data[i] = (int) (Math.random() * 1000) + 1;
        }

    }

    public static void displayNumber(int[] data) {

        for (int i = 0; i < data.length; i++) {
            data[i] = (int) (Math.random() * 1000) + 1;
            System.out.println(data);
        }
    }

    public static void bubble(int[] data) {
        for (int move = 0; move < data.length; move++) {
            for (int i = 0; i < data.length - move - 1; i++) {
                int temp;
                if (data[i] > data[i + 1]) {
                    temp = data[i + 1];
                    data[i + 1] = data[i];
                    data[i] = temp;

                }
            }

        }

    }
}
