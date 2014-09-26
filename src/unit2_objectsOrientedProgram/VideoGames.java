/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit2_objectsOrientedProgram;

/**
 *
 * @author 1leste
 */
public class VideoGames {

    public static final int ESRB_RATING_PENDING = 0;
    public static final int ESRB_RATING_TEEN = 1;
    public static final int ESRB_RATING_MATURE = 2;
    
    public static final String[] ESRB_RATING_NAME = {
        "Pending", "Teen", "Mature"
    };
    
    private double price;
    private int sequel;
    private String game;
    private boolean valid;
    private int pirated;

    public VideoGames() {
    }

    public VideoGames(double price, int sequel, String gameName, boolean valid, int pirated) {
        this.price = price;
        this.sequel = sequel;
        this.game = game;
        this.valid = valid;
        this.pirated = pirated;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSequel() {
        return sequel;
    }

    public void setSequel(int sequel) {
        this.sequel = sequel;
    }

    public String getGame() {
        return game;
    }

    public void setGame(String gameName) {
        this.game = gameName;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public int getPirated() {
        return pirated;
    }

    public void setPirated(int pirated) {
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
        if (this.valid != other.valid) {
            return false;
        }
        if (this.pirated != other.pirated) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "VideoGames{" + "price=" + price + ", sequel=" + sequel + ", game=" + game + ", valid=" + valid + ", pirated=" + pirated + '}';
    }
    
    public boolean isValid(boolean valid){
        
        return valid;
    }

}
