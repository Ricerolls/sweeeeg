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
        //loops the rows
        for (int i = 0; i < n; i++) {
//            for (int r = n; r > i; i--) {
//                System.out.print(" ");
//            }
            //loops the col and prints out the value from the pascal method
            for (int j = 0; j <= i; j++) {
                System.out.print(pascal(i, j) + " ");
            }
            System.out.println(" ");

        }

    }

    public static int pascal(int i, int j) {
        //if the first value starts with a 0, return a 1 for the start of pascal.
        //value of 1 on right side
        if (j == 0) {
            return 1;
            //same applied logic as above, except one is left side
        } else if (j == i) {
            return 1;
            //prints out the values after and before 1
        } else {
            return pascal(i - 1, j - 1) + pascal(i - 1, j);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Ask user for how many rows
        System.out.print("How much rows?: ");
        int row = scanner.nextInt();
        //prints out the amount of rows in pascals triangle for the asked amount
        generateTri(row);
    }
}
