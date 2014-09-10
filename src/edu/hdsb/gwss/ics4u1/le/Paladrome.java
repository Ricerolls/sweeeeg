/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.hdsb.gwss.ics4u1.le;

import java.util.Scanner;

/**
 *
 * @author 1leste
 */
public class Paladrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner ( System.in );
        System.out.println("This program will determine if the word is a palindrome\n" +
                "Enter your word: ");
        String word = input.next();
        String reverse = "";
        
        for (int i = word.length() - 1 ;i >= 0; i--)
            reverse += word.charAt(i);
//            System.out.print(word.charAt(i));
        System.out.print(reverse);
        
//        if ()
//        
//            }
    }   
    

