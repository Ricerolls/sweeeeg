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
    }

    public void contains(int key) {
    }

    public int hash(int key) {
        return key;
    }

    public double loadFactor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean containsKey(int key) {
        if (hash(key) == -1) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        int[] data = {7, 5, 4, 5};
        Hash hash = new Hash(10, 10);


    }
}
