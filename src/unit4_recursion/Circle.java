/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit4_recursion;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author 1leste
 */
class Circle extends JPanel {

//draws circle
    public void paint(Graphics graphics) {
        
        //radius of first circle
        int radius = 100; 
        //circle starts at the center of the frame
        int xMid = 250;
        int yMid = 250; 
        
        //draws circle
        graphics.drawOval(xMid - radius, yMid - radius, radius * 2, radius * 2);
        
        //calls and draw 4 circles
        drawCircles(graphics, xMid, yMid, radius);

    }

    void drawCircles(Graphics graphics, int xMid, int yMid, int radius) {
        //recursion
        if (radius < 1) {
            return;
        }
        // Draw circle
        graphics.drawOval(xMid - radius, yMid - radius, radius * 2, radius * 2);
        
        //left
        drawCircles(graphics, xMid - radius, yMid, radius / 2);
        //right
        drawCircles(graphics, xMid + radius, yMid, radius / 2);
        //fill right side up and down
        drawCircles(graphics, yMid + radius , xMid, radius / 2);
        //fill left up and down
        drawCircles(graphics, yMid - radius , xMid, radius / 2);

    }
}
