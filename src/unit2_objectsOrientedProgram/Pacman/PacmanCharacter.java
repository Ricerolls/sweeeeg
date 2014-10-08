/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit2_objectsOrientedProgram.Pacman;

import hsa.Console;



/**
 *
 * @author 1leste
 */
//thought abstract
public class PacmanCharacter implements Movement {
    
 // CLASS VARIABLES
    public static Console c = new Console();
    public static final int radius = 50;
    public static int STEP_SIZE = 10;
    public static int NO_STEP = 0;
    public static int STEP_UP = 1;
    public static int STEP_LEFT = 2;
    public static int STEP_RIGHT = 3;
    public static int STEP_DOWN = 4;
    
    
    
    // OBJECT VARIABLES
    private int direction;
    private boolean alive;
    private int xLoc;
    private int yLoc;

    public PacmanCharacter() {
       
        if( c == null ) {
            System.out.println( "WARN: HSA Console NOT set." );
        }
    }
    
    public PacmanCharacter( Console hsaConsole ) {
        this();
        if( c == null ) {
            c = hsaConsole;
            System.out.println( "INFO: HSA Console set." );
        }
    }

    public PacmanCharacter( boolean alive, int xLoc, int yLoc ) {
        this.alive = alive;
        this.xLoc = xLoc;
        this.yLoc = yLoc;
    }        
    
    public boolean isIsAlive() {
        return alive;
    }

    public void setIsAlive( boolean isAlive ) {
        
        this.alive = isAlive;
    }

    public int getxLoc() {
        return xLoc;
    }

    public void setxLoc( int xLoc ) {
        this.xLoc = this.xLoc + 10;
        this.xLoc = xLoc;
    }

    public int getyLoc() {
        return yLoc;
    }

    public void setyLoc( int yLoc ) {
        this.yLoc = yLoc;
    }
    
    public void moveLeft( ) {
        this.erase();
        this.xLoc = this.xLoc - STEP_SIZE;
        this.draw();
    }
    
    public void moveRight( ) {
        this.erase();
        this.xLoc = this.xLoc + STEP_SIZE;
        this.draw();
    }
    
    public void moveUp( ) {
        this.erase();
        this.yLoc = this.yLoc + STEP_SIZE;
        this.draw();
    }
    
    public void moveDown( ) {
        this.erase();
        this.yLoc = this.yLoc - STEP_SIZE;
        this.draw();
    }
    
    public void move (){
        
        if (direction == STEP_UP){
            moveUp();
        } else if (direction == STEP_LEFT){
            moveLeft();
        } else if (direction == STEP_RIGHT) {
            moveRight();
        } else if (direction == STEP_DOWN) {
            moveDown();
        } else if (direction == NO_STEP) {
            
        }
            
    }
    
    public void draw() {
        
    }
    
    public void erase( ) {
        
    }
   
    /**
     * The parent class, PacmanCharacter, must have reference to the HSA Console.
     * Set it ONCE.
     * @param hsaConsole 
     */
    public  void setConsole( Console hsaConsole ) {
        c = hsaConsole;
    }
    
}

