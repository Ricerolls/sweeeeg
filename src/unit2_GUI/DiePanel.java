/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit2_GUI;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author 1leste
 */
public class DiePanel extends  Die {

    private int dotHeight;
    private int dotWidth;
    private int diceHeight;
    private int diceWidth;
    private int xLoc;
    private int yLoc;

    public DiePanel() {
        this.dotHeight = 20;
        this.dotWidth = 20;
        this.diceHeight = 100;
        this.diceWidth = 100;
        this.xLoc = 50;
        this.yLoc = 50;
    }

    public DiePanel(int dotHeight, int dotWidth, int diceHeight, int diceWidth, int xLoc, int yLoc) {
        this.dotHeight = dotHeight;
        this.dotWidth = dotWidth;
        this.diceHeight = diceHeight;
        this.diceWidth = diceWidth;
        this.xLoc = xLoc;
        this.yLoc = yLoc;

    }

    public void paintComponent(Graphics g) {
        
        g.setColor(this.color);
        g.drawRect(xLoc, yLoc, diceWidth, diceHeight);
        
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
        g.setColor(Color.WHITE);
        col--;
        row--;
        g.drawOval(dotWidth + (3 * dotWidth*row), dotWidth + (3 * dotHeight*col), diceHeight /10, diceWidth/10);
    }
    

}
