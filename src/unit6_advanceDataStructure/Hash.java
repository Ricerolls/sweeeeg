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
public class Hash implements HashInterface {

    private int key;
    private int value;
    Hash[] table;
    int capacity;

    public Hash(int key, int value) {
        this.key = key;
        this.value = value;
    }

    public int size() {
        return table.length;
    }

    public void resize() {
        double loadFactor = 0;
        if (loadFactor >= 0.75) {
            loadFactor = 0.25;
            int[] table = new int[capacity];
            capacity = 0;

        }
    }

    public int capacity() {
        int i = 0;
        i = size();

        return i;
    }

    public void makeEmpty() {
        if (size() != 0) {
        }

    }

    public boolean isEmpty() {
        if (size() != 0) {
            return false;
        } else {
            return true;
        }
    }

    public int get(int key) {
        int hash = (key % table.length);
        while (table[hash] != null) {
            hash = (hash + 1) % table.length;
        }
        if (table[hash] == null) {
            return -1;
        } else {
            return table[hash].value;
        }

    }

    public void put(int value) {
         //First check if the array needs to be resized
        if (this.loadFactor() > 0.75) {
            this.resize();
        }

        int location = 0; //This will hold the location in the table where the value will end up
        boolean endOfArrayFlag = false;  //Used to check if we've hit the end of the array, then need to put the value somewhere at the start
        int hash = this.hash(value); //The hash code of the value
        int counter = 0; //Used for checking for the next free space in the array
        
    }

    public void contains(int key) {
    }

    public int hash(int key) {
        int hash = key % table.length;
        return hash;
    }

    public double loadFactor() {
        double loadFactor = 0;
        
        return 
    }

    public boolean containsKey(int key) {
        if (hash(key) < 0 ) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        int[] data = {7, 5, 4, 5};
        Hash hash = new Hash(10, 10);
        

    }
}
