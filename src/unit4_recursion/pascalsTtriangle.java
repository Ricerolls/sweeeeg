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
public class pascalsTtriangle {

    public static void generateTri(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(pascal(i, j));

            }
            System.out.println(" ");

        }

    }

    public static int pascal(int i, int j) {
        if (j == 0) {
            return 1;
        } else if (j == i) {
            return 1;
        } else {
            return pascal(i - 1, j - 1) + pascal(i - 1, j);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How much rows?: ");
        int row = scanner.nextInt();
        generateTri(row);
    }
}
