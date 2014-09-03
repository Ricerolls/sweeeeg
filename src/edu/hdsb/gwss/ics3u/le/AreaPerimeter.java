/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.hdsb.gwss.ics3u.le;

import java.util.Scanner;



/**
 * Name:    Steven Le
 * Date:    Sept 11, 2013
 * Version: v0.1
 * Description: This program shows how to calculate area and perimeter
 * @author 1leste
 */
public class AreaPerimeter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner input = new Scanner ( System.in);
        System.out.println( "Length of your rectangle");
        int l = input.nextInt();
        System.out.println( "Width of your rectangle");
        int w = input.nextInt();
        int area = l * w;
        int perimeter = (l + w)*2;

        System.out.println("The area is:" + area);
        System.out.println("The perimeter is:" + perimeter);

        
    }

}
