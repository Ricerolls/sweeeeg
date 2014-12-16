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
    public int[] table;
    int capacity;

    public Hash(int size) {
        int newinitialSize = makeprime(size);
        table = new int[newinitialSize];
        makeEmpty();
    }
    

    public int size() {
        int size = 0;
        for (int i = 0; i < table.length; i++) {
            if (table[i] != -1) {
                size++;
            }
        }
        return size;
    }

    public void resize() {

        if (loadFactor() >= 0.75) {
            int[] copy = new int[capacity];
            capacity = 0;
            int j = 0;
            for (int i = 0; i < table.length; i++) {
                if (table[i] != -1) {
                    copy[j] = table[i];
                    j++;
                }
            }
            table = null;
            table = new int[copy.length * 4];
            makeEmpty();
            for (int i = 0; i < copy.length; i++) {
                put(copy[i]);
            }
        } else {
            System.out.println("Cant resize");
        }
    }

    public int capacity() {
        return table.length;
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
        int num = 0;
        if (table[key] != -1) {
            num = table[key];
        } else {
            num = -1;
        }
        return num;
    }

    public void put(int value) {

        if (loadFactor() > 0.75) {
            resize();
        }
        capacity++;
        int counterCol = 0;
        if (value >= 0) {
            int hash = this.hash(value);
            int location = 0;
            while (location == 0) {
                if (hash < table.length) {
                    if (table[hash] == -1) {
                        table[hash] = value;
                        location = 1;
                    } else {
                        counterCol++;
                        hash++;
                    }
                } else 
                    hash = 0;
            }
        }  
        System.out.print("# of collisions: " + counterCol + "\n");
        if (loadFactor() >= 0.75) {
            resize();
      }        
    }

    public int hash(int key) {
        int hash = key % table.length;
        return hash;
    }

    public double loadFactor() {
         return (double)size() / (double)capacity();
    }

    public boolean containsKey(int key) {
        if (hash(key) < 0) {
            return false;
        }
        return true;
    }

    public int makeprime(int num) {
        if (isPrime(num)) {
            return num;
        } else {
            return makeprime(num + 1);
        }
    }

    public boolean isPrime(int num) {
        if (Math.abs(num) == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

//    public static void main(String[] args) throws Exception {
//        int[] data = {7, 5, 4, 5};
//        Hash hash = new Hash(10, 10);
//        
//
//    }
}
