/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit2_GUI;

/**
 *
 * @author 1leste
 */
public class DiePanel {
    
    private int dotHeight;
    private int dotWidth;
    private int diceHeight;
    private int diceWidth;
    private int xLoc;
    private int yLoc;

    public DiePanel() {
        this.dotHeight = 20;
        this.dotWidth = 20;
        this.diceHeight = 10;
        this.diceWidth = 10;
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
}


