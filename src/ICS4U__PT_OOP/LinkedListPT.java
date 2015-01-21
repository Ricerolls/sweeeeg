/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ICS4U__PT_OOP;

/**
 *
 * @author 1leste
 */
public class LinkedListPT {

    private NodePT head;
    private NodePT tail;

    /**
     * Constructor: Empty Linked List
     */
    public LinkedListPT() {
        this.head = null;
        this.tail = null;
    }

    /**
     * @return returns the size (# of students) in the linked list.
     */
    public int size() {
        // TO DO
        return -1;
    }

    /**
     * This method makes the linked list empty.
     */
    public void makeEmpty() {
        // TO DO
    }

    /**
     * This method returns true if the linked list is empty
     *
     * @return returns true if there are no student objects in the linked list
     */
    public boolean isEmpty() {
        // TO DO
        return true;
    }

    /**
     * This method adds a student object to the end of the linked list.
     *
     * @param student
     */
    public void addAtEnd( CSStudent student ) {
        // TODO
    }

    /**
     * This method will get a student object from the linked list, given the
     * student number
     *
     * @param key student number (key)
     * @return returns the student object for the given key, or null if it
     * doesn't exist.
     */
    public CSStudent get( int key ) {
        // TODO
        return null;
    }
    
    /**
     * This method will remove a student object from the linked list, given the
     * student number.
     *
     * @param key student number (key)
     * @return returns the removed student object, or null if the key is not found
     */
    public CSStudent remove( int key ) {
        // TODO
        return null;
    }

    /**
     * DONE FOR YOU
     */
    @Override
    public String toString() {
        return "HEAD: " + toString( this.head );
    }

    /**
     * DONE FOR YOU
     */
    private String toString( NodePT n ) {
        String s = "";
        if ( n != null ) {
            s = n.getData() + " --> " + this.toString( n.getNext() );
        }
        return s;
    }

}
