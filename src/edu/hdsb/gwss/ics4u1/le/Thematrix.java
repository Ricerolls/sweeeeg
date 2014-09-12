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
        generateMatrix();

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
        int[][] random = new int[sizeRow][sizeCol];
        

        
        for (int i = 0; random.length < 9; i++) {
            System.out.println();
            for (int j = 0; random.length[i] < 9; j++) {
            random[i][j] =(int)(Math.random() * 10);   
            System.out.print(random[i][j]);
            }
        }

        return random;
    }
}
