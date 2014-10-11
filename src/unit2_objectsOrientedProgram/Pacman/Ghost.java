/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit2_objectsOrientedProgram.Pacman;

import java.awt.Color;
import static unit2_objectsOrientedProgram.Pacman.PacmanCharacter.c;
import static unit2_objectsOrientedProgram.Pacman.PacmanCharacter.radius;

/**
 *
 * @author 1leste
 */
public class Ghost extends PacmanCharacter {

    private int kills;
    private Color color;

    public Ghost(int xLoc, int yLoc, Color color, boolean alive) {
        super(alive, xLoc, yLoc);
    }

    public void killedPacman() {
    }

    //draw ghost only
    @Override
    public void draw() {
        c.setColor(Color.red);
        c.fillOval(this.xLoc, this.yLoc, radius, radius);
        c.fillRect(this.xLoc, this.yLoc + radius / 2, radius, radius);
    }
    
    //removes duplicate ghost
    @Override
    public void erase() {
        c.setColor(Color.WHITE);
        c.fillOval(xLoc, yLoc, radius, radius);
        c.fillRect(this.xLoc, this.yLoc + radius / 2, radius, radius);
        
    }

    @Override
    public String toString() {
        return "Ghost{" + "kills=" + kills + ", color=" + color + '}';
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
