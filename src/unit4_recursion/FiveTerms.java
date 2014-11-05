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

    public static int seq1(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 3;
        }
        return seq1(n - 1) + seq1(n - 2);

    }
    
    public static double seq2(int n){
        if (n == 1) {
            return 2;
        }  
        return Math.sqrt(((seq2(n-1))*3)+4);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nth value: ");
        int n = scanner.nextInt();
//        for (int i = 1; i < n; i++) {
//            System.out.println(seq1(i));
//        }
        
        for (int i = 1; i < n; i++) {
            System.out.println(seq2(i));
        }
        
              
        
    }

}
