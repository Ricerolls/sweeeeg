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
public interface LinklistInterface {

    public int size();
    public boolean isEmpty();
    public void makeEmpty();

    /**
     * Adds a node to the front of the linked list .
     *
     * @param str
     */
    public void addAtFront(String str);

    /**
     * Adds a node to the end of the linked list.
     *
     * @param str
     */
    public void addAtEnd(String str);

    /**
     * Deletes a node in the linked list.
     *
     * @param str
     */
    public void remove(String str);

    /**
     * Creates a string that lists the nodes of the linked list.
     *
     * @param str
     */
    public String toString();

}
