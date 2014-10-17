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
public class manufacture {

private String developer;
private String gameName;
private ArrayList <VideoGames> VideoGames;

public manufacture(){
    this.VideoGames = new ArrayList<VideoGames>();
   
} 
    public manufacture(String developer, String gameName) {
        this.developer = developer;
        this.gameName = gameName;
       
    }

    @Override
    public String toString() {
        return "manufacture{" + "developer=" + developer + ", gameName=" + gameName + ", VideoGames=" + VideoGames + '}';
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public String getGameName() {
        return gameName;
    }

    public void addGameName(String gameName) {
        this.gameName = gameName;
        VideoGames game1 = new VideoGames();
        
    }


}
