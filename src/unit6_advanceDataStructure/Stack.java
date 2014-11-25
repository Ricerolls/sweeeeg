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
        if (top == data.length) {
            return true;
        } else {
            return false;
        }

    }

    public int top() {
        if (isFull() != false) {
        }
        return top++;
    }

    public int pop() {

        return top--;
    }

    public void push(int num) {
        if (top != -1) {
        }return ;

    }

    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void makeEmpty() {
        top = -1;
    }

    public static void main(String[] args) {

        Stack s = new Stack(10);
        
        s.push(5);
        System.out.println("Is empty? " + s.isEmpty());
        

    }

}
