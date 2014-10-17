/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit2_GUI;

/**
 *
 * @author 1leste
 */
public class Die {
    private int dieValue;
    private boolean validValue;

    public Die() {
        this.dieValue=2;
        this.validValue=true;
    }

    public Die(int dieValue, boolean validValue) {
        this.dieValue = dieValue;
        this.validValue = validValue;
    }
    

public int rollDie() {
//    (int) ( Math.random() * 10 ); 
    return dieValue;
}




}