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
public class Die  {
    public int dieValue;
    public int totalValue;
    public Color color;

    public Die() {
        this.dieValue=2;
        this.totalValue=2;
        this.color = Color.orange;
    }

    public Die(int dieValue, int totalValue, Color color) {
        this.dieValue = dieValue;
        this.totalValue = totalValue;
        this.color = color;
    }
    

public int rollDie(int dieValue) {
    this.dieValue = (int) ( Math.random() * 6 ); 
    return dieValue;
}


}