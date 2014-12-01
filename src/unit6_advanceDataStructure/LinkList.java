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
public class LinkList implements LinklistInterface {

    Node tail;
    Node head;
    
    public int size(int y) {
       return y;
    }

    public void makeEmpty() {
        this.tail = null;
        this.head = null;
    }

    public void addAtFront(String str) {
        Node newNode = new Node("");
        newNode.setNext(head);
        head = newNode;
    }

    public void addAtEnd(String str) {
        Node newNode = new Node("");
        newNode.setNext(tail);
        tail = newNode;
    }

    public void remove(String str) {
  
    }

    public void toString(String str) {
        if (this.head != null) {
            Node n = head;
            do {
                n.getData();
                n = n.getNext();
            } while (n != null);
        }
    }
    
    public static void main(String[] args) {
    LinkList s = new LinkList();
    Node node1 = new Node("S");
    Node node2 = new Node("W");   
    Node node3 = new Node("A");
    Node node4 = new Node("G");    
    
    s.addAtFront(node1);
    s.addAtFront(node2);
    s.addAtFront(node3);
    s.addAtFront(node4);
    
}
}
