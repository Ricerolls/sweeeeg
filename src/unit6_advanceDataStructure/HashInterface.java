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
public interface HashInterface {
   public int size();

    public void resize();

    public int capacity();

    public double loadFactor();

    public void makeEmpty();

    public boolean isEmpty();

    public int get( int key );

    public void put( int value );

    public boolean containsKey( int key );

    public int hash( int key );
    
}
