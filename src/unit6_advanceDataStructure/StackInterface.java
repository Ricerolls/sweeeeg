/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit6_advanceDataStructure;

/**
 *
 * @author 1leste
 */
public interface StackInterface {
    
    public int top();

    public int pop();

    public void push( int num );

    public int size();

    public boolean isEmpty();

    public void makeEmpty();
}
