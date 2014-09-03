/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.hdsb.gwss.ics3u.le;

import java.util.Scanner;

/**
 *
 * @author 1leste
 */
public class WordEcho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int wordRepeatition = 0;
        int wordLength;
        String word;

        System.out.println("Type in your word.");
        word = input.nextLine();

        wordLength = word.length();

        while (wordRepeatition > wordLength  ) {
            System.out.println(word);
            wordLength ++;
            
        }

    }

}
