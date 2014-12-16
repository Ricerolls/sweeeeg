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
public class Stack implements StackInterface {

    int top;
    int[] data;
    int size;

    public Stack(int size) {
        this.data = new int[size];
        this.top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        if (top == capacity()) {
            return true;
        } else {
            return false;
        }

    }

    public int top() {
        if (isFull() != false) {
        }
        return data[top++];
    }

    public int pop() {
        return data[top--];
    }

    public void push(int value) {
        if (!isFull()) {
            top++;
            data[top] = value;

            System.out.println("You pushed: " + data[top]);
        } else
            System.out.println("Size is full");       
    }

    public int size() {
        int size;
        size = top + 1;
        return size;
    }

    public void makeEmpty() {
        top = -1;
    }
 
    public int capacity() {
        size = data.length;
        return size;
    }
    
    public static void main(String[] args) {

        Stack s = new Stack(5);

        s.push(5);
        s.push(9);
        s.push(6);
        s.push(5);
        s.push(4);

        System.out.println("Is empty? " + s.isEmpty());
        System.out.println("<------untouched stack array------>");
        for (int x = 0; x < s.data.length; x++) {
            System.out.println("" + s.data[x]);
        }
        System.out.println("is full: " + s.isFull());
        System.out.println("size of array is :  " + s.size());
        System.out.println("is empty :" + s.isEmpty());

        System.out.println("popping top item " + s.pop());
        System.out.println("<-------------popped array------->");
        for (int x = 0; x < s.data.length; x++) {
            System.out.println("" + s.data[x]);
        }
        System.out.println("size of array is :  " + s.size());

        s.push(1);
        System.out.println("<--------pushed value array------------->");
        for (int x = 0; x < s.data.length; x++) {
            System.out.println("" + s.data[x]);
        }
        System.out.println("size of array is :  " + s.size());
        System.out.println("is full: " + s.isFull());
    }

   

}
