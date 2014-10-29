
package unit2_GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.*;
import javax.swing.*;


/**
 *
 * @author 1leste
 */
public class DieClient extends JFrame implements ActionListener {

    Die die1 = new Die();
    Die die2 = new Die();
    JFrame guiWindow = new JFrame("Die Game");
    JLabel label = new JLabel();
    JPanel panel = new JPanel();
    JButton button = new JButton("Roll");
    int valueDie = 2;

    public DieClient() {

        guiWindow.setSize(600, 600);
        guiWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        
        panel.add(label);
        
        panel.add(die1);
        panel.add(die2);

        button.setSize(50, 50);
        panel.add(button);
        panel.setBackground(Color.yellow);
        button.addActionListener(this);
        panel.setVisible(true);

        this.setLayout(new BorderLayout());
        this.add(panel, BorderLayout.SOUTH);
        this.add(panel, BorderLayout.LINE_START);
        this.add(label, BorderLayout.LINE_END);
        this.add(button, BorderLayout.CENTER);
        setContentPane(panel);
        //set visable and size by set value
        this.pack();
        guiWindow.setVisible(true);


    }

    public void actionPerformed(ActionEvent e) {
        
          die1.dieValue = valueDie;
        die2.dieValue = valueDie;
        int totalValue = die1.dieValue + die2.dieValue;
        if (e.getSource() == button) {
            die1.rollDie(valueDie);
            die1.repaint();
            die2.rollDie(valueDie);
            this.update(this.getGraphics());
        }
        if (totalValue != 7) {
            this.label.setText("Roll Again");
        } else if (die1.dieValue == die2.dieValue) {
            this.label.setText("Win!");
        } else if (die1.dieValue != die2.dieValue) {
            this.label.setText("You rolled a : " + 
        (die1.dieValue + die2.dieValue) + (" Try again!"));
        
    }
    
    }
}
