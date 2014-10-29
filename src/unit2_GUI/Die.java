/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit2_GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author 1leste
 */
public class Die extends JPanel {
    private static int dieLength = 100;
    private static int dotSize = dieLength / 10;
    protected int dieValue;
    
    private Color color;
    private int sizeFactor= 1;

    public Die() {
        Dimension d = new Dimension(100,100);
        this.dieValue=2;
        this.setSize(d);
        this.setPreferredSize(d);
        this.color = Color.black;
        this.dieValue = (int) (Math.random()* 6) + 1;
    }
    
    public void setValue(int dieValue) {
        this.dieValue = dieValue;
    }
    public void setSizeFactor() {
        this.sizeFactor = sizeFactor;
        this.dieLength = this.dieLength * sizeFactor;

    }

    public Die(int dieValue,  Color color) {
        this.dieValue = dieValue;
        this.color = color;
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(this.color);
        g.fillRect(0, 0, dieLength * sizeFactor, dieLength * sizeFactor);
        
        
        if (dieValue == 1) {
           dot(g, 2, 2); 
        } else if (dieValue == 2) {
            dot(g,1,1);
            dot(g, 3,3);
        } else if (dieValue == 3) {
            dot(g, 1, 1);
            dot(g, 2,2);
            dot(g, 3,3);
        } else if (dieValue == 4) {
            dot(g, 1, 1);
            dot(g, 3, 1);
            dot(g, 1, 3);
            dot(g, 3, 3);            
        } else if (dieValue == 5) {
            dot(g, 1, 1);
            dot(g, 3, 1);
            dot(g, 2, 2);
            dot(g, 1, 3);
            dot(g, 3, 3); 
        } else if(dieValue == 6) {
            dot(g, 1, 1);
            dot(g, 3, 1);
            dot(g, 1, 2);
            dot(g, 1, 3);
            dot(g, 3, 3); 
            dot(g, 3, 2);
        }
        
    }
    
    
    public void dot (Graphics g, int col, int row) {
        g.setColor(Color.white);
        col--;
        row--;
        g.drawOval(sizeFactor * (dotSize + (3*dotSize * row)),sizeFactor * 
                (dotSize + (3*dotSize * col)), dotSize * 2, dotSize * 2);

    }
    

public int rollDie(int dieValue) {
    this.dieValue = (int) ( Math.random() * 6 ); 
    return dieValue;
}


}