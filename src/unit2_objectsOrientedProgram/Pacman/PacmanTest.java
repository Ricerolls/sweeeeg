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
        PacmanCharacter.setConsole( c );
        // New Pacman characters
        Pacman pacman = new Pacman(150, 150, Color.ORANGE, true);
        Ghost ghost1 = new Ghost(100, 100, Color.red, true);
        Ghost ghost2 = new Ghost(200, 200, Color.cyan, true);
        Ghost ghost3 = new Ghost(250, 250, Color.orange, true);
        Ghost ghost4 = new Ghost(350, 350, Color.magenta, true);
        
        //loops the movement till it moves 7 times
        for (int i=0; i < 7; i++){
        pacman.move();
        ghost1.move();
        ghost2.move();
        ghost3.move();
        }
        //delay the movement
        delay();
    }
    //delay the speed
    public static void delay(){
        try{
            Thread.sleep(50);
        }
        catch (Exception e){
            
        }
    }

}
