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

    public static int f(int x, int y) {
        if (x < y) {
            return f(y, x);
        }
        if (x == y) {
            return 0;
        }
        if (x > y) {
            return 1 + f(x - 1, y);
        }
        return f(x, y);
    }

    public static int a(int m, int n) {
        if (m == 0) {
            return a(m, n + 1);
        }
        if (m > 0 && n == 0) {
            return a(m - 1, 1);
        } else {
            return a(m - 1, a(m, n - 1));
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.print("Select a x value: ");
//        int x = s.nextInt();
//        System.out.print("Select a y value: ");
//        int y = s.nextInt();
//        System.out.println(f(x, y));
        System.out.print("Select a n value: ");
        int n = s.nextInt();
        System.out.print("Select a m value: ");
        int m = s.nextInt();
        System.out.println(a(m,n));
        
        
    }

}
