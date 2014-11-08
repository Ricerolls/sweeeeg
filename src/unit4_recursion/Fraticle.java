/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package unit4_recursion;

import java.util.*;
import javax.swing.*;

public class Fraticle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {   
        //creates circle from circle class
        Circle circle = new Circle();

        //Frame for the circle to be displayed
        JFrame frame = new JFrame("Fraticle");
        frame.setSize(500, 500);
        frame.setLocation(100, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //adds circle to the frame as content panel
        frame.getContentPane().add(circle);
        frame.setVisible(true);
    }
}