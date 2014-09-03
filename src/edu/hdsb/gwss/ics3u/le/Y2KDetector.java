/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stevenhomeproject;

import java.util.Scanner;

/**
 *
 * @author jefftruong
 */
public class Y2KDetector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Varible
        
        int age;
        Scanner input = new Scanner(System.in);

        //User Input
        System.out.println("What was your birth year? (ex: 19'97')");
        int birthYear = input.nextInt();
        System.out.println("What is the last two digits of the current year?");
        int currentYear = input.nextInt();     
        
        age = (100 - birthYear) + currentYear;
        
        //statement and out put
        if (age <= 100) {
        System.out.println("Your age is: " + age);
     }  else if (age > 100 )
        System.out.println("Your age is invalid");
        
    }
}
