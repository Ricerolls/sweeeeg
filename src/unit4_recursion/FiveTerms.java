/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit4_recursion;

import java.util.Scanner;

/**
 *
 * @author 1leste
 */
public class FiveTerms {

    //sequance 1 of five term
    public static int seq1(int n) {
        //term equals 1 return 1
        if (n == 1) {
            return 1;
        }
        //term equals 2 reutrn 3
        if (n == 2) {
            return 3;
        }
        //returns the nth term of the 2 added values 
        return seq1(n - 1) + seq1(n - 2);

    }
    
    //sequance 2 of 5 terms
    public static double seq2(int n){
        //returns 2 if the term is 1
        if (n == 1) {
            return 2;
        }  
        //formula that returns the nth term
        return Math.sqrt(((seq2(n-1))*3)+4);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nth value: ");
        int n = scanner.nextInt();
        //sequance 1 prints out terms
//        for (int i = 1; i < n; i++) {
//            System.out.println(seq1(i));
//        }
        //sequance 2 prints out terms
        for (int i = 1; i < n; i++) {
            System.out.println(seq2(i));
        }
        
              
        
    }

}
