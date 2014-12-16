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

    public LinkList() {
        //set the values to nothing
        this.tail = null;
        this.head = null;
    }

    public int size() {
        //set size and create new node
        int size = 0;
        Node n = head;
        //if there is something within the head
        if (n != null) {
            //the head size increase, and set the head to the next node
            do {
                size++;
                n = n.getNext();
                //keep doing this while there is something in the node
            } while (n != null);
        }

        //returns the size
        return size;
    }
    //makes data empty

    public void makeEmpty() {

        //nothing within these variable
        this.tail = null;
        this.head = null;
    }
    //adds string at the front

    public void addAtFront(String str) {
        //creates new node
        Node newNode = new Node(str);
        if (size() == 0) {
            //the tail is equal to zero
            this.tail = newNode;
        } else {
            //set the string at the front of the tail
            newNode.setNext(head);
        }
        //new node is now the head
        this.head = newNode;

    }
    //adds at end

    public void addAtEnd(String str) {
        Node newNode = new Node(str);
        if (this.size() == 0) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.tail.setNext(newNode);
        }
//        newNode.setNext(tail);
    }

    //removes string
    public void remove(String str) {
        if (size() > 0) {
            //new node created, which will be the head
            Node nFront = head;
            boolean removed = false;
            //gets the data at the head by ignoring caplocks
            if (nFront.getData().equalsIgnoreCase(str)) {
                this.head = head.getNext();
                //if the string at the front isn't the same
            } else {
                do {
                    //get the data after that and skips 1 node and returns true
                    if (nFront.getNext().getData().equalsIgnoreCase(str)) {
                        nFront.setNext(nFront.getNext().getNext());
                        removed = true;
                    }
                    nFront = nFront.getNext();
                    //loop this when its not true
                } while (!removed || nFront.getNext() != null);
            }
        }
    }

    //prints string out
    public String toString() {
        String s = "";
        //if there is a string in head
        if (this.head != null) {
            //create a new null that is at head
            Node n = head;
            do {
                //create a string with the string data
                s = s + n.getData() + " | ";
                //node will get the next node after that
                n = n.getNext();
                //loop this when there is a string in the node
            } while (n != null);
        }
        return s;
    }

    public static void main(String[] args) {
        LinkList l = new LinkList();
//        l.addAtEnd("s");

        l.addAtFront("Fred");

        l.addAtFront("Barney");
        l.addAtFront("Wilma");
        l.addAtEnd("swag");
        l.addAtFront("df");
        l.addAtFront("swag");
        System.out.println(l.toString());
        l.remove("Barney");

//        l.remove("s");
        System.out.println(l.toString());



        //l.addAtFront( "Barney" );
    }
}
