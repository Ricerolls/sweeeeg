/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics3u.le.unit3_arrays;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Name: Steven Le
 * Date: Nov. 23, 2013
 * Version: v0.1
 * @author 1leste
 * Description: This program displays the students mark in specific subjects.
 */

public class StevensMarkBook {

    public static final int First_Name = 0;
    public static final int Last_Name = 1;
    public static final int Student_List = 1;
    public static final int Class_Report = 2;
//    public static final int School_Report = 3;
    static StevensArrayUtilities sau = new StevensArrayUtilities();

    public static void main(String[] args) throws Exception {

        //arrays being stored
        int[][] studentMark = new int[10][4];
        String[] subjects = {"Computer Science", "English", "Math", "Physics"};
        String[][] studentList;
        
        //random student mark and student names being generated
//        studentList = studentList();
        studentMark(studentMark);

        Scanner input = new Scanner(System.in);
        
        //The choice
        int userOption = option();
        if (userOption == Student_List) {
            System.out.println(studentList);
        } else if (userOption == Class_Report) {
            ClassReport(subjects, studentList, studentMark);
//        } else if (userOption == School_Report) {
//            SchoolReport(subjects, studentList, studentMark);
//        }
        }

        
    }
    //User gets to select an option
    /**
     * This method returns the users options
     * @return the user option
     */
    public static int option() {
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("Please select an option: " + "1. Student List " + "2. Class Report " + "3. School Report");
        int userOption = input.nextInt();

        return userOption;

    }
    
    public static void info () throws Exception {
        
        File file = new File ("markbook.txt");
        PrintWriter output = new PrintWriter(file);
        output.write ("output.txt") ; 
        int[][] mark = new int [18][4];
        String [][] student = new String [18][3];
        
        
    }
    public static void stringInfo (String[][]student, int [][] mark) {
        Scanner input = new Scanner(System.in);
        
    }
    
    public static void generate (int[][]mark) throws Exception {
        PrintWriter output = new PrintWriter(new File("markbook.txt"));
        
        
    }
   
    
   
    /**
     * Method creates random numbers as marks for each student in any subject.
     * @param studentMark is an array where the marks will be stored.
     */
//    public static void studentMark(int[][] studentMark) {
//
//        int[][] data = new int[10][4];
//        for (int row = 0; row < data.length; row++) {
//            for (int col = 0; col < data[row].length; col++) {
//                data[row][col] = (int) (Math.random() * 100) + 1;
//            }
//
//        }
//
//    }

    /**
     * This method stores the students last name and first name
     * @return returns the students first name and last name into a 2d array
     */
//    public static String[][] studentList() {
//        String data[][] = {
//            {"Steven", "L"},
//            {"Alex", "L"},
//            {"Francais", "R"},
//            {"Tran", "Z"},
//            {"Thano ", "S"},
//            {"Leon ", "W "},
//            {"Jesus ", "C "},
//            {"Stefano ", "D "},
//            {"Farjaad ", "J "},
//            {"Jordan ", "M "},};
//        return data;
//    }

   
    /**
     * Gives uses the option to select a credit, and displays the students mark, 
     * highest mark, lowest mark, and the average in that specific credit.
     * @param subjects an array that stores the credits name.
     * @param studentList an array that has the first name and last name of the student.
     * @param studentMark an array that has the students mark.
     */
    public static void ClassReport(String[] subjects, String[][] studentList, int[][] studentMark) throws Exception {
        System.out.println("Please select a class: \n" + "1. Computer Science \n"
                + "2. English \n" + "3. Math \n" + "4. Physics \n");
        Scanner input = new Scanner(System.in);
        PrintWriter output = new PrintWriter(new File("markbook.txt"));
        int credit = input.nextInt();
        System.out.println(subjects[credit - 1]);
        ClassReport(studentList, studentMark, credit - 1);
        double average = sau.findAverage(studentMark, credit - 1);
        int HighestMark = sau.findIndexOfMaximumValue(studentMark, credit - 1);
        int LowestMark = sau.findIndexOfMinimumValue(studentMark, credit - 1);
        System.out.println("Average: " + average + "%");
        output.println("Average: " + average + "%");
        System.out.println("Lowest Mark: " + studentMark[LowestMark][credit - 1] + "%");
        output.println("Lowest Mark: " + studentMark[LowestMark][credit - 1] + "%");
        System.out.println("Name: " + studentList[LowestMark][First_Name]);
        output.println("Name: " + studentList[LowestMark][First_Name]);
        System.out.println("Highest Mark: " + studentMark[HighestMark][credit - 1] + "%");
        output.println("Highest Mark: " + studentMark[HighestMark][credit - 1] + "%");
        System.out.println("Name: " + studentList[HighestMark][First_Name]);
        output.println("Name: " + studentList[HighestMark][First_Name]);


    }

    //Displays the class first name, last name, and marks
    public static void ClassReport(String[][] studentInfo, int[][] studentMark, int credit) throws Exception {
        PrintWriter output = new PrintWriter(new File("markbook.txt"));
        System.out.format("%7s %7s %7s ", "Last Name", "First Name", "Mark(%)\n");
        output.format("%7s %7s %7s ", "Last Name", "First Name", "Mark(%)\n");

        
        for (int student = 0; student < studentInfo.length; student++) {
            System.out.format("%7s %7s %7d\n", studentInfo[student][Last_Name], studentInfo[student][First_Name], studentMark[student][credit]);
            output.format("%7s %7s %7d\n", studentInfo[student][Last_Name], studentInfo[student][First_Name], studentMark[student][credit]);
        }

    }

   
    public static void SchoolReport(String[] subject, String[][] studentList, int[][] studentMark) throws Exception {

        //prints mark
        PrintWriter output = new PrintWriter(new File("markbook.txt"));
        sau.displayArray(studentMark);

            //finds the average mark for each student
        for (int i = 0; i < subject.length; i++) {
            double average = sau.findAverage(studentMark, i);
            System.out.println("Average for : " + subject[i] + average + "%");
            output.println("Average for : " + subject[i] + average + "%");
        }

        //finds which students are honorable
        System.out.println("\n Honour Roll: ");
        output.println("\n Honour Roll: ");
        System.out.format("%7s %7s %7s ", "Last Name", "First Name", "Mark(%)\n");
        output.format("%7s %7s %7s ", "Last Name", "First Name", "Mark(%)\n");
        for (int student = 0; student < studentMark.length; student++) {
            double average = sau.findAverage(studentMark[student]);
            if (average >= 80) {
                System.out.format("%7s %7s %7.2f\n", studentList[student][Last_Name], studentList[student][First_Name], average);
                output.format("%7s %7s %7.2f\n", studentList[student][Last_Name], studentList[student][First_Name], average);
            }
        }
    }
}

        
            