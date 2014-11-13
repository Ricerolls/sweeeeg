/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit5_ValidRecordData;

import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 *
 * @author 1leste
 */
public class ClassStore extends ClassRecord {

    static RandomAccessFile file;
    static Scanner input;

    public static void menu() {
        System.out.println("Select an option: \n" + "1. Display record \n" + 
                "2. Display all record \n" + "3. Exit");
        switch(1) {
            case 1: 
                displayRecord();
            case 2:
                allDisplayRecord();
            case 3:
                break;
        }
    }

//    public static void writeRecord(Object, fileId) {
//
//    }
//
//    public static void readRecord(fileId) {
//
//    }

    public static void displayRecord() {

    }

    public static void allDisplayRecord() {
        //loop displayer record
    }

    public static void displayRecordMenu() {
        //display record, and displays options.
    }

    public static void openFile() {
        if (file == null) {

        }
    }

    public static void closeFile() {
        file.closeFile();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        openFile();
        closeFile();
        menu();

        System.out.println("Creating 4 Class Records");

        // CHEMISTRY
        ClassRecord c1 = new ClassRecord("Mr. Sanderson", "ICS4U1-01", 31);
        System.out.println("Created Class: " + c1.toString());

        // BIOLOGY
        ClassRecord c2 = new ClassRecord("Ms. Smallbone", "SBI4U1-01", 32);
        System.out.println("Created Class: " + c2.toString());

        // PHYSICS
        ClassRecord c3 = new ClassRecord("Mr. Tennant", "SPH4U1-02", 34);
        System.out.println("Created Class: " + c3.toString());

        // COMPUTER SCIENCE
        ClassRecord c4 = new ClassRecord("Mr. Muir", "ICS4U-01", 20);
        System.out.println("Created Class: " + c4.toString());

        System.out.println("*********************");

        // WRITE FIRST RECORD
        RandomAccessFile recordFile = new RandomAccessFile("classes.txt", "rw");

        // RECORD #1 (start of file)
        recordFile.seek(0);
        recordFile.writeChars(c1.getTeacherName());
        recordFile.writeChars(c1.getSubjectName());
        recordFile.writeInt(c1.getClassSize());
        System.out.println("RECORD SIZE: " + recordFile.length());

        // RECORD #2
        recordFile.writeChars(c2.getTeacherName());
        recordFile.writeChars(c2.getSubjectName());
        recordFile.writeInt(c2.getClassSize());
        System.out.println("RECORD SIZE: " + recordFile.length());

        // RECORD #3
        recordFile.writeChars(c3.getTeacherName());
        recordFile.writeChars(c3.getSubjectName());
        recordFile.writeInt(c3.getClassSize());
        System.out.println("RECORD SIZE: " + recordFile.length());

        // RECORD #4
        recordFile.writeChars(c3.getTeacherName());
        recordFile.writeChars(c3.getSubjectName());
        recordFile.writeInt(c3.getClassSize());
        System.out.println("RECORD SIZE: " + recordFile.length());

    }

}
