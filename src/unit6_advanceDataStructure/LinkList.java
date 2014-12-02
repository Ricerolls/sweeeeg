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
        this.tail = null;
        this.head = null;
    }

    public int size() {
        int size = 0;
        Node n = head;
        if (n != null) {
            do {
                size++;
                n = n.getNext();
            } while (n != null);
        }
        return size;
    }

    public void makeEmpty() {
        this.tail = null;
        this.head = null;
    }

    public void addAtFront(String str) {
        Node newNode = new Node(str);
        if (size() == 0) {
            this.tail = newNode;
        } else {
            newNode.setNext(head);
        }
        this.head = newNode;
        //newNode.setNext(head);
    }

    public void addAtEnd(String str) {
        Node newNode = new Node(str);
        if (size() == 0) {
            this.head = newNode;
        } else {
            newNode.setNext(tail);
        }
        this.tail = newNode;
//            
//        newNode.setNext(tail);
//        tail = newNode;
    }

    public void remove(String str) {
        if (size() > 0) {
            Node nFront = head;
            Node nAfter = head.getNext();
            boolean removed = false;
            do {
                if (nAfter.getData().equalsIgnoreCase(str)) {
                    nFront = nAfter.getNext();
                    nAfter.setNext(null);
                    removed = true;
                }
                
                nFront = nAfter;
                nAfter = nAfter.getNext();
            } while (!removed || nFront.getNext() != null);
        }
    }

    public String toString() {
        String s = "";
        if (this.head != null) {
            Node n = head;
            do {
                s = s + n.getData() + " | ";
                n = n.getNext();
            } while (n != null);
        }
        return s;
    }

    public static void main(String[] args) {
        LinkList l = new LinkList();

        l.addAtFront("Fred");
        l.addAtFront("Barney");
        l.addAtFront("Wilma");
        System.out.println(l.toString());
        l.remove("Wilma");
        System.out.println(l.toString());
        l.addAtEnd("s");
        System.out.println(l.toString());
        
        //l.addAtFront( "Barney" );

    }
}
