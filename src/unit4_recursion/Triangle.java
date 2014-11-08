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
public class Triangle extends JPanel{
       
     
   public static void drawTriangle(Graphics g, Color color, int level, int x1, int y1, int x2, int y2, int x3, int y3) {
        g.setColor(Color.RED);
        g.drawLine(x1, y1, x2, y2);
        g.drawLine(x2, y2, x3, y3);
        g.drawLine(x3, y3, x1, y1);
        
        
        if (level > 0){
            int px1 = (x1 + x2) / 2;
            int py1 = (y1 + y2) / 2;
            int px2 = (x1 + x3) / 2;
            int py2 = (y1 + y3) / 2;
            int px3 = (x1 + x3) / 2;
            int py3 = (y1 + y3) / 2;     
            
            drawTriangle(g,color, level - 1, x1, y1, px1, py1, px2, py2);
            drawTriangle(g,color, level , x2, y2, px2, py2, px3, py3);
            drawTriangle(g,color, level , x3, y3, px3, py3, px1, py1);
        }
        
       
    }
   
   @Override
   protected void paintComponent(Graphics g) {
       int level = 7;
       g.drawLine(200, 200, 400, 400);
       drawTriangle(g, Color.yellow, level, 50, 50, 200, 200, 350, 350);
   }
    
    
}     
