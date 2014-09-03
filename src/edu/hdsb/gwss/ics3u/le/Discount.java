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
public class Discount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Varibles
       int price;
       int total;

       Scanner input = new Scanner(System.in);
       
       // User Input
       System.out.println("What is your price?");
       price = input.nextInt();
       
       // If Statement an out put
       if (price >= 1000) {
           total = (price/10) * 9;
           System.out.println("your price is: " + total);
       } else if (price < 1000) {
           total = price;
           System.out.println("your price is: " + total);
           }

    }
}
