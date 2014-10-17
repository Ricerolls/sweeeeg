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

   
    private Color color;
    
    private boolean edible;
    private int score;
    private int livesRemaining;
    private int orientation;
    private boolean living;
    private int mouthopen;
    
    public Pacman(int xLoc, int yLoc, Color color, boolean alive) {
        
        super(alive, xLoc,yLoc);
        this.score = 0;
        this.livesRemaining = 0;
        
    }

    public void die() {
        this.livesRemaining = livesRemaining - 1;
    }

    public void reborn() {

    }

    public void powerUp() {
        this.edible = true;
    }

    public void powerDown() {
        this.edible = false;
    }

    public void IncreaseScore() {
        this.score = score + 10;
    }

    public void eatGhost() {
        
    }

    //draws pacman
    @Override
    public void draw() {
//c.drawOval(xLoc, yLoc, radius, radius);
        c.setColor(Color.ORANGE);
        c.fillArc(xLoc, yLoc, radius, radius, 30, 300);     
    }
    //removes duplicate pacman
    @Override
    public void erase(){
        c.setColor(Color.white);
        c.fillOval(xLoc, yLoc, radius, radius);
        
    }
     @Override
    public void moveLeft() {
        
        super.moveLeft();
    }

    @Override
    public void moveRight() {
        super.moveRight();
    }

    @Override
    public void moveUp() {
        super.moveUp();
    }
    @Override
        public void moveDown(){
            super.moveDown();
        }
    
}
