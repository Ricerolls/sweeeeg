/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit2_GUI;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
        guiWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        guiWindow.setSize(600, 600);

        panel.add(button);
        
        
        button.setSize(100, 100);

        guiWindow.setVisible(true);
    }

    public void ActionEvent(ActionListener e) {

        
        if ( e.) {
            
        }
        dice1.dieValue = valueDie;
        dice2.dieValue = valueDie;
        die.totalValue = dice1.dieValue + dice2.dieValue;

        if (die.totalValue != 7) {
            System.out.println("Roll Again");
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
        }
        );

//    JFrame guiWindow = new JFrame("DieGame");
//    guiWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    guiWindow.setSize(600,600);
//    
//    
//    
//   
//    DiePanel dice1 = new DiePanel();
//    DiePanel dice2 = new DiePanel();
//   
//    guiWindow.setVisible(true);
    //JPanel dicePanel = new JPanel():
        //dicePanel = new JPanel (setLayout(new Flowlayout));
        //JPanel.setLayout(new FlowLayout);
        //dicePanel.add(dice1)
    //jButton button = new jButton();
//    window.setLayout(BoarderLayout(20,20);
//    window.add(diePanel, BoarderLayout.PAGE_START)
//    window.add (new JButton(1));
   //oubkic void actionPreform (ActionListener e)
        //die1.roll();
    }

}
