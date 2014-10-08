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
public class Ghost extends PacmanCharacter {

    private int kills;
    private int xLoc;
    private int yLoc;
    private Color color;
   

    public Ghost(int xLoc, int yLoc, Color color, boolean alive) {
     this.xLoc = 50;
    }

    public void killedPacman() {

    }

    public void draw() {
        c.setColor(Color.red);
        c.fillOval(this.xLoc, this.yLoc, radius, radius);
        c.fillRect(this.xLoc, this.yLoc + radius / 2, radius, radius);
       

    }

}
