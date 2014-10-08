/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit2_objectsOrientedProgram.Pacman;

import java.awt.Color;

/**
 *
 * @author 1leste
 */
public class Pacman extends PacmanCharacter {

    private int xLoc;
    private int yLoc;
    private Color color;

    private int score;
    private int livesRemaining;
    private int orientation;
    private boolean living;
    private int mouthopen;
    
    public Pacman(int xLoc, int yLoc, Color color, boolean alive) {
        this.xLoc = xLoc;
        this.yLoc = yLoc;
        this.color = color;
    }

    public void die() {

    }

    public void reborn() {

    }

    public void powerUp() {

    }

    public void powerDown() {

    }

    public void IncreaseScore() {

    }

    public void eatGhost() {

    }

    public void draw() {
//c.drawOval(xLoc, yLoc, radius, radius);
        c.setColor(Color.ORANGE);
        c.fillArc(xLoc, yLoc, radius, radius, 30, 300);
    }
}
