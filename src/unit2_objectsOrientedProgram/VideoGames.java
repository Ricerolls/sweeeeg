/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit2_objectOrientedProgram;

import java.util.ArrayList;

/**
 *
 * @author 1leste
 */
public class VideoGame {

    public static final int ESRB_RATING_PENDING = 0;
    public static final int ESRB_RATING_EVERYONE = 1;
    public static final int ESRB_RATING_TEEN = 2;
    public static final int ESRB_RATING_MATURE = 3;
    public static final String[] ESRB_RATING_NAME = {
        "Pending", "Everyone", "Teen", "Mature"
    };
    private double price;
    private int sequel;
    private String gameName;
    private int esrbRating;
    private boolean validGame;
    private ArrayList gameNameList;

    //null constructor
    public VideoGame() {
        this.price = 0;
        this.sequel = 0;
        this.gameName = null;
        this.esrbRating = 0;
        this.validGame = false;


    }
    //primary constructor

    public VideoGame(String gameName) {
        this.price = 0;
        this.sequel = 0;
        this.gameName = gameName;
        this.esrbRating = 0;
        this.validGame = false;

    }

    public VideoGame(double price, int sequel, String gameName, boolean validGame) {
        this.price = price;
        this.sequel = sequel;
        this.gameName = gameName;
        this.validGame = validGame;

    }

    public int getEsrbRating() {

        return esrbRating;
    }

    public int setEsrbRating(int esrbRating) {

        if (this.validGame = true) {

            if (this.esrbRating == ESRB_RATING_EVERYONE) {
                this.esrbRating = ESRB_RATING_EVERYONE;
            } else if (this.esrbRating == ESRB_RATING_PENDING){ 
                this.esrbRating = ESRB_RATING_PENDING;
            } else if (this.esrbRating == ESRB_RATING_TEEN) {
                this.esrbRating = ESRB_RATING_TEEN;
            } else if (this.esrbRating == ESRB_RATING_MATURE) {
                this.esrbRating = ESRB_RATING_TEEN;
            } else if (this.esrbRating < 0 || this.esrbRating > 3) {
                System.out.println("Invalid Option");

            }

        }
        return esrbRating;
    }

    public boolean isValidGame(boolean valid) {
        if (this.gameName.length() < 1 || this.price < 59.98 || this.sequel < 1) {
            valid = false;
        } else {
            valid = true;
        }

        return valid;
    }

    public double getPrice() {
        return price;
    }

    public double setPrice(double price) {
        this.price = price;
        return price;
    }

    public int getSequel() {
        return sequel;
    }

    public int setSequel(int sequel) {
        this.sequel = sequel;

        return sequel;
    }

    public String getgameName() {
    
        return gameName;
    }

    public String setgameName(String gameName) {
        this.gameName = gameName;
        return gameName;
    }


    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {

        boolean valid = false;

        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        VideoGame gameToCompare = (VideoGame) obj;
        if (this.gameName.equals(gameToCompare.gameName) && this.gameName.length() == gameToCompare.gameName.length()) {
            valid = true;
        }
        return valid;
    }

    @Override
    public String toString() {
        return "VideoGames{" + "price=" + price + ", sequel=" + sequel + ", gameName=" + gameName + ", valid=" + validGame + '}';
    }
}
