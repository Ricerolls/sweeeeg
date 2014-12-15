/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package unit6_advanceDataStructure;

/**
 *
 * @author jefftruong
 */
public class Queue implements QueueInterface {
    
    
     int[] array;
    private int size = 0;
    private int front = 0;
    private int back = 0;

    public Queue(int capacity) {
        array = new int[capacity];
    }

//    public int enqueue(int value) {
//        if (size == array.length) {
//            System.out.print("Can't add when its full");
//        } else {
//            array[back] = value;
//            back = (back + 1) % array.length;
//        }
//        return size++;
//    }
    public int dequeue() {
        if (size == 0) {
            System.out.print("Can't remove when its empty");
        }
        int c = array[front];
        array[front] = -1;
        front = (front + 1) % array.length;
        size--;

        return c;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        if (size != 0) {
            return false;
        } else {
            return true;
        }
    }

    public boolean isFull() {
        if (size != array.length) {
            return false;
        }
        return true;
    }

    public void makeEmpty() {
        if (size != 0) {
            size = 0;
        }
    }

    public int front() {
        return front;
    }

    public int back() {
        return back;
    }

    public void enqueue(int value) {
        if (size == array.length) {
            System.out.print("Can't add when its full");
        } else {
            array[back] = value;
            back = (back + 1) % array.length;
            size++;
            
        }
    }

    public int capacity() {
        size = array.length;
        return size;
    }
    
    public static void main(String[] args) { 
        Queue q = new Queue (2);
        
        q.enqueue(7); 
        
        q.enqueue(5);
      
    }
}
