/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit4_recursion;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

/**
 *
 * @author 1leste
 */
public class trianglez extends JFrame {

   
    
    public trianglez() {  
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Triangle tri = new Triangle();
        frame.setSize(600, 600);
        frame.setLocation(100, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(tri);
        frame.setVisible(true);
    }

}
