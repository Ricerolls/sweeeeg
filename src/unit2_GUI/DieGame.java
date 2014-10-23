/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit2_GUI;

import javax.swing.*;

/**
 *
 * @author 1leste
 */
public class DieGame extends JFrame implements ActionListener {
    
    Die die = new Die();
    JFrame guiWindow = new JFrame("Die Game");
    DiePanel dice1 = new DiePanel();
    DiePanel dice2 = new DiePanel();
    JPanel dicePanel = new JPanel();
    
    JButton button = new JButton("Roll");
    int valueDie = 2;
    
    
    
//    DiePanel = new JPanel (setLayout(new Flowlayout));
    
    public DieGame(){
    
    
    guiWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    guiWindow.setSize(600,600);
    guiWindow.setVisible(true);
    
    dicePanel.setSize(100, 100);
    dicePanel.setVisible(true);
    
    button.setSize(100,100);
    button.setVisible(true);
    
//    JPanel.setLayout(new FlowLayout);
//    dicePanel.add(dice1);
//    
    
    }
    
        
   public void ActionPreform (ActionListener e) {
    
       
    dice1.dieValue = valueDie;
    dice2.dieValue = valueDie;
    die.totalValue = dice1.dieValue + dice2.dieValue;
    
    dicePanel.repaint();
    
    
    
   }
    
}
