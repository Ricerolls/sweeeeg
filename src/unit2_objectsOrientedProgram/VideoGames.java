/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit2_objectsOrientedProgram;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 1leste
 */
public class VideoGames {

    public static final int ESRB_RATING_PENDING = 0;
    public static final int ESRB_RATING_EVERYONE = 1;
    public static final int ESRB_RATING_TEEN = 2;
    public static final int ESRB_RATING_MATURE = 3;
    public static final String[] ESRB_RATING_NAME = {
        "Pending", "Everyone", "Teen", "Mature"
    };
    private ArrayList<manufacture> manufacture;
    private double price;
    private int sequel;
    private String game;
    private int esrbRating;
    private boolean validGame;
    private boolean pirated;

    public VideoGames() {
    }

    public VideoGames(double price, int sequel, String game, boolean validGame, boolean pirated, int esrbRating) {
        this.price = price;
        this.sequel = sequel;
        this.game = game;
        this.validGame = validGame;
        this.pirated = pirated;
        this.esrbRating = esrbRating;
    }

    public int getEsrbRating() {

        return esrbRating;
    }

    public int setEsrbRating(int esrbRating) {
        if (this.validGame = true) {
            this.esrbRating = esrbRating;
            if (this.esrbRating == 0 || this.esrbRating <= 3) {
                System.out.println(ESRB_RATING_NAME);
            } else if (this.esrbRating != 0 || this.esrbRating > 3) {
                System.out.println("Invalid Option");
            }
        }

        return esrbRating;
    }

    public boolean isValidGame() {
        return validGame;
    }

    public void setValidGame(boolean validGame) {
        
        this.validGame = validGame;
    }

    public double getPrice(double price) {
        this.price = price;
        return price;
    }

    public double setPrice(double price) {
        Scanner input = new Scanner(System.in);
        this.price = input.nextInt();
        return price;
    }

    public int getSequel() {
        return sequel;
    }

    public int addSequel(int sequel) {
       this.sequel = sequel;
        return sequel;
    }

    public String getGame() {
        this.game = game;
        return game;
    }

    public String addGame(String gameName) {
        this.game = gameName;
        return gameName;
    }

    public boolean isvalidGame(boolean valid) {
        this.validGame = valid;
        return validGame;
    }

    public boolean setvalidGame(boolean valid) {
        if (this.addGame(game).equalsIgnoreCase(game)) {
            this.validGame = true;
        } else {
            System.out.println("Not a valid game");
            this.validGame = false;
        }
        return valid;
    }

    public boolean getPirated() {

        return pirated;
    }

    public void setPirated(boolean pirated) {
        
        this.pirated = pirated;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final VideoGames other = (VideoGames) obj;
        if (Double.doubleToLongBits(this.price) != Double.doubleToLongBits(other.price)) {
            return false;
        }
        if (this.sequel != other.sequel) {
            return false;
        }
        if ((this.game == null) ? (other.game != null) : !this.game.equals(other.game)) {
            return false;
        }
        if (this.validGame != other.validGame) {
            return false;
        }
        if (this.pirated != other.pirated) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "VideoGames{" + "price=" + price + ", sequel=" + sequel + ", game=" + game + ", valid=" + validGame + ", pirated=" + pirated + '}';
    }

    public boolean isValid(boolean valid) {
        if (this.esrbRating < 3) {
            valid = true;
        }

        return valid;
    }
}
