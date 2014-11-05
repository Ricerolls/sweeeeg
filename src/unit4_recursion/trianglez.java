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

    Triangle tri = new Triangle();
    
    public trianglez() {
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
      
        
    }

    public static void main(String[] args) {
    
    SwingUtilities.invokeLater(new Runnable() {           
            public void run() {
                new trianglez().setVisible(true);
            }
        });

    }

}
