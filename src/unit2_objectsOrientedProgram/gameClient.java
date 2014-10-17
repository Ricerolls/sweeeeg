
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit2_objectsOrientedProgram;

import java.util.ArrayList;

/**
 *
 * @author 1leste
 */
public class gameClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList VideoGames = new VideoGames();
        VideoGames game1 = new VideoGames();
             VideoGames game2 = new VideoGames();
             
        VideoGames.add(game1);
        VideoGames.add(game2);
        
        game1.setPirated(true);
        game1.addSequel(6);
        game1.setPrice(59.99);
        game1.addGame("Halo");
        
        game2.setPirated(true);
        game2.addSequel(1);
        game2.setPrice(69.99);
        game2.addGame("Destiny");
        
        
    }
    
}
