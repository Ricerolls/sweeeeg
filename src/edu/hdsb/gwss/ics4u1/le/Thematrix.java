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
public class Thematrix {

//    public static void int The_Random_Matrix == 1;
//    public static void int The_Transpose_Matrix == 2;
//    public static void int Multiply_Matrix == 3;
//    public static void int Multiply_two_Matrix == 4;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int userOption = choice();
        System.out.println("----------Welcome to the Matrix Program!---------------\n");
        choice();
        generateMatrix();

        if (userOption == 1) {
            generateMatrix();

            if (userOption == 2) {
//                generateTranspose();
            }

        }

    }

    public static int choice() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please select one of the following options:\n"
                + "1: The Random Matrix\n"
                + "2: The Transpose Matrix\n"
                + "3: Multiplying a Matrix by a Constant\n"
                + "4: Multiplying Two Matrices\n"
                + "Your choice is:");
        int userOption = input.nextInt();

        return userOption;
    }

    public static int[][] generateMatrix() {
        Scanner input = new Scanner(System.in);

        System.out.println("How many rows would you like?");
        int sizeRow = input.nextInt();
        System.out.println("How many col would you like?");
        int sizeCol = input.nextInt();
        int[][] matrix = new int[sizeRow][sizeCol];

        for (int i = 0; matrix.length < sizeRow; i++) {
            for (int j = 0; matrix.length < sizeCol; j++) {
                matrix[i][j] = (int) (Math.random() + 10);
                System.out.print(matrix[i][j]);
            }
        }

        return matrix;
    }

    public static int[][] generateTranspose(int[][] matrix) {
//        int[][] transpose = generateMatrix(); //new int[copy.length][copy[0].length];

        for (int row = 0; matrix.length < row; row++) {
            for (int col = 0; matrix[row].length < col; col++) {
                System.out.print(matrix[col][row]);
            }
//            }transpose[row][col] = copy[col][row];
        }

        return matrix;
    }

    public static int[][] multiplyMatrixbyConstant(int[][] matrix) {
        Scanner input = new Scanner(System.in);
        System.out.println("What constant would you like ot multiply the matrix by?");
        int constant = input.nextInt();
        for (int row = 0; matrix.length < row; row++) {
            for (int col = 0; matrix[row].length < col; col++) {
                matrix[row][col] *= constant;
            }
        }
        return matrix;
    }
    public static int[][] multiplyMatrix(int[][] matrix) {
        return matrix;
}
    }
    
    
