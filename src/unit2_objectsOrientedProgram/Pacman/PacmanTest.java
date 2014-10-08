/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit2_objectsOrientedProgram.Pacman;

import hsa.Console;
import java.awt.Color;

/**
 *
 * @author 1leste
 */
public class PacmanTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Console c = new Console();

//        PacmanCharacter.setConsole( c );
        // New Pacman
        PacmanCharacter Pacman = new PacmanCharacter();
        Pacman p = new Pacman(0, 0, Color.ORANGE, true);
        Ghost g = new Ghost(0, 0, Color.red, true);
        p.draw();
        g.draw();
    }

}
