/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit2_GUI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


/**
 *
 * @author 1leste
 */
public class DieClient extends JFrame implements ActionListener {

    Die die = new Die();
    JFrame guiWindow = new JFrame("Die Game");
    DiePanel dice1 = new DiePanel();
    DiePanel dice2 = new DiePanel();
    JPanel panel = new JPanel();
    JButton button = new JButton("Roll");
    int valueDie = 2;

    public DieClient() {
        guiWindow.setPreferredSize(new Dimension(600, 600));
        guiWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);

        panel.add(dice1);
        panel.add(dice2);

        button.setSize(50, 50);
        panel.add(button);       
        button.addActionListener(this);

        this.setLayout(new BorderLayout());
        this.add(panel, BorderLayout.SOUTH);
        this.add(panel, BorderLayout.LINE_START);
        this.add(button, BorderLayout.CENTER);

        //set visable and size by set value
        this.pack();
        guiWindow.setVisible(true);


    }
    
 
    public void ActionPreformed(ActionEvent e) {

        dice1.dieValue = valueDie;
        dice2.dieValue = valueDie;
        die.totalValue = dice1.dieValue + dice2.dieValue;
        if (e.getSource() == button) {
            dice1.rollDie(valueDie);
            dice1.repaint();
            dice2.rollDie(valueDie);
            this.update(this.getGraphics());
        }
        if (die.totalValue != 7) {
            System.out.println("Roll Again");
        } else if (dice1.dieValue == dice2.dieValue) {
            System.out.println("Win!");
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new DieGame().setVisible(true);
            }
        });
    }
}
