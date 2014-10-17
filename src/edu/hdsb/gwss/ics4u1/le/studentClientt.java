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
public class studentClientt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student student1 = new Student();
        
//        System.out.println(student1.firstName);
//        System.out.println(student1.lastName);
//        System.out.println(student1.OEN);
//        System.out.println(student1.networkPassword);
        
        student1.setFirstName("Fred");
        student1.setLastName("Turner");
        student1.setOEN(123456789);
        student1.setNetworkPassword("wasd");
                
                System.out.println(student1.toString());
//        Scanner input = new Scanner( );
//        String string1 = new String();
//        String string2= new String();
//        String string3 = new String();
//        Student student1 = new Student();
//        Student student2 = new Student("Dan");
//        Student student3 = new Student("Fred");
    }
    
}
