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
public class Node implements NodeInterface{
    private String data;
    private Node next;

    public Node( String newData ) {
        this.data = newData;
        this.next = null;
    }

    @Override
    public Node getNext() {
        return this.next;
    }

    @Override
    public void setNext( Node newNode ) {
        this.next = newNode;
    }

    @Override
    public String getData() {
        return this.data;
    }       

}

