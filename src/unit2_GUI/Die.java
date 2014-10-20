/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit2_GUI;

import java.awt.Color;

/**
 *
 * @author 1leste
 */
public class Die extends DiePanel {
    private int dieValue;
    private boolean validValue;
    private Color color;

    public Die() {
        this.dieValue=2;
        this.validValue=true;
        this.color = Color.orange;
    }

    public Die(int dieValue, boolean validValue, Color color) {
        this.dieValue = dieValue;
        this.validValue = validValue;
        this.color = color;
    }
    

public int rollDie() {
//    (int) ( Math.random() * 10 ); 
    return dieValue;
}




}