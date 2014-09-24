/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics4u1.le;

import java.util.Scanner;

/**
 * Name: Steven Le
 * Date: 17, 2014
 * Version: v0.1
 * @author 1leste
 * Description: This program generates a matrix which is than used to be multiplied, 
 *              by a constant or transposed.
 */
public class TheMatrix {

//    public static void int The_Random_Matrix == 1;
//    public static void int The_Transpose_Matrix == 2;
//    public static void int Multiply_Matrix == 3;
//    public static void int Multiply_two_Matrix == 4;
      public static int [][] matrixCopy;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        boolean quit = false;   
        int[][] matrix;
        boolean checkOption = false;//used to check the option
        boolean matrixExist = false;//checks to see if a matrix is generated
        int userOption = 0;
        
        System.out.println("----------Welcome to the Matrix Program----------");
        //loops when the user wants to quit
        while (quit == false) {
            //options are displayed through a method
            userOption = menu(userOption);
            //checks if options are valid otherwise the user will have to select again
            if (userOption > 0 && userOption <= 4) {
                checkOption = true;
            } else {
                System.out.println("Opps! Choice entered is not possible. Try again!");
                userOption = menu(userOption);
            }
            //quits the program
            if (userOption == 4) {
                quit = true;
            }
            //if the right selected number is chosen, than a option will preform a function
            //based on the method
            if (checkOption == true) {
                switch (userOption) {
                    case 1:
                        //Generates the matrix
                        matrixExist = true;
                        matrix = generateMatrix();
                        matrixCopy = matrix;
                        System.out.println(matrixCopy);
                        break;
                    case 2:
                        //Transposes the Matrix
                        if (matrixExist == true) {
                            generateTranspose(matrixCopy);
                            System.out.println(matrixCopy);
                        } else {
                            //creates a matrix if they haven't created one yet
                            matrix = generateMatrix();
                            matrixCopy = matrix;
                            generateTranspose(matrix);
                        }
                        break;
                    //Matrix is multiplied by a constant
                    case 3:
                        if (matrixExist == true) {
                            multiplyMatrixByConstant(matrixCopy);
                        } else {
                            //creates a matrix if they haven't created one yet
                            matrix = generateMatrix();
                            matrixCopy = matrix;
                            multiplyMatrixByConstant(matrix);
                            matrixCopy = matrix;
                            System.out.println(matrixCopy);
                        }
                        break;
                }
            }
            //end of loop
        }
    }


    public static int menu(int userOption) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please select one of the following options:\n"
                + "1: The Random Matrix\n"
                + "2: The Transpose Matrix\n"
                + "3: Multiplying a Matrix by a Constant\n"
                + "4: Quit\n"
                + "Your choice is:");
        userOption = input.nextInt();

        return userOption;
    }

    //Generates the matrix
    public static int[][] generateMatrix() {
        Scanner input = new Scanner(System.in);
        
        //Program ask the user to input how many rows and col they want in their matrix
        System.out.println("How many rows would you like?");
        int sizeRow = input.nextInt();
        System.out.println("How many col would you like?");
        int sizeCol = input.nextInt();
        //Matrix is created by the size of row and col from user
        int[][] matrix = new int[sizeRow][sizeCol];
        
        //Randomly prints out random # in each row and col
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
        
        //Flips the Rows by Columns to Columns by Rows
        for (int row = 0; matrix.length < row; row++) {
            for (int col = 0; matrix[row].length < col; col++) {
                matrix[row][col] = matrix[col][row];
                System.out.print(matrix[col][row]);
            }
//            }transpose[row][col] = copy[col][row];
        }
        //returns the matrix that was transposed
        return matrix;
    }

    public static int[][] multiplyMatrixByConstant(int[][] matrix) {
        Scanner input = new Scanner(System.in);
        //Ask user what they like to multiply their matrix by
        System.out.println("What constant would you like ot multiply the matrix by?");
        //Input constant value
        int constant = input.nextInt();
        for (int row = 0; matrix.length < row; row++) {
            for (int col = 0; matrix[row].length < col; col++) {
                //matrix is equal to the the values that was multiplied by the constant
                matrix[row][col] *= constant;
            }
        }
        //returns matrix that was multiplied
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
    
    
