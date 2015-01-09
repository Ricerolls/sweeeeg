package oopday2;


import oopday2.CSStudent;

/**
 * Linked List of Students
 *
 * @version v2014.S1
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
        //set size and create new node
        int size = 0;
        NodePT n = head;
        //if there is something within the head
        if (n != null) {
            //the head size increase, and set the head to the next node
            do {
                size++;
                n = n.getNext();
                //keep doing this while there is something in the node
            } while (n != null);
        }
        return size;
    }

    /**
     * This method makes the linked list empty.
     */
    public void makeEmpty() {
        this.tail = null;
        this.head = null;
    }

    /**
     * This method returns true if the linked list is empty
     *
     * @return returns true if there are no student objects in the linked list
     */
    public boolean isEmpty() {
      if (size() == 0) {
            return true;
        } else {
        return false;
    }
    }    

    /**
     * This method adds a student object to the end of the linked list.
     *
     * @param student
     */
    public void addAtEnd( CSStudent student ) {
        NodePT newNode = new NodePT(student);
        if (this.isEmpty()) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.tail.setNext(newNode);
        }
//        newNode.setNext(tail);
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
        CSStudent n = get(key);
        if (n == null) {
            return null;
        } else
            return n;
        
    }
    
    /**
     * This method will remove a student object from the linked list, given the
     * student number.
     *
     * @param key student number (key)
     * @return returns the removed student object, or null if the key is not found
     */
    public CSStudent remove( int key ) {
        if (size() > 0) {
            //new node created, which will be the head
            NodePT nFront = head;
            boolean removed = false;
            //gets the data at the head by ignoring caplocks
            if (nFront.getData().equals(key)) {
                this.head = head.getNext();
                //if the string at the front isn't the same
            } else {
                do {
                    if (nFront.getNext().getData().equals(key)) {
                        nFront.setNext(nFront.getNext().getNext());
                        removed = true;
                    }
                    nFront = nFront.getNext();
                    //loop this when its not true
                } while (!removed || nFront.getNext() != null);
            }
        }
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
