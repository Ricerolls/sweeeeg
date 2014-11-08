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
public class Function {
    //normal function
    public static int f(int x, int y) {
        //return inverse function
        if (x < y) {
            return f(y, x);
        }
        //returns 0 if x and y are the same
        if (x == y) {
            return 0;
        }
        //if x is greater, return this value
        if (x > y) {
            return 1 + f(x - 1, y);
        }
        //returns value of x and y
        return f(x, y);
    }
    //Akerman Function
    public static int a(int m, int n) {
        //if m equals 0, add 1 to n and return it
        if (m == 0) {
            return a(m, n + 1);
        }
        //if M is greater and n = 0, return m - 1 and 1
        if (m > 0 && n == 0) {
            return a(m - 1, 1);
            //if any of these cases are invalid, return m-1, and a(m, n-1)
        } else {
            return a(m - 1, a(m, n - 1));
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //Normal Recursion Function
        //Set Values and prints out method
//        System.out.print("Select a x value: ");
//        int x = s.nextInt();
//        System.out.print("Select a y value: ");
//        int y = s.nextInt();
//        System.out.println(f(x, y));
        
        //Akerman Recursion Function
        //Set Values and prints out the method
        System.out.print("Select a n value: ");
        int n = s.nextInt();
        System.out.print("Select a m value: ");
        int m = s.nextInt();
        System.out.println(a(m,n));
        
        
    }

}
