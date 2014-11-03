/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit4_recursion;

import javax.swing.*;

/**
 *
 * @author 1leste
 */
public class trianglez extends JFrame {

    Triangle tri = new Triangle();
    JFrame guiWindow = new JFrame("Triangle");
   

    public trianglez() {
        guiWindow.add(tri);
        guiWindow.setSize(600, 600);
        guiWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        guiWindow.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new trianglez().setVisible(true);
            }
        });

    }

}
