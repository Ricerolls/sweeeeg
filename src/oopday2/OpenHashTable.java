package oopday2;

import oopday2.LinkedListPT;
import oopday2.CSStudent;

/**
 * Open Hash Table
 *
 *
 * @version v2014.S1
 */
public class OpenHashTable {

    /**
     * Open Hash Table: an array of Linked Lists
     */
    public LinkedListPT[] data;

    /**
     * Creates an Open Hash Table; default size 11
     */
    public OpenHashTable() {
        this(11);
    }

    /**
     * Creates an Open Hash Table
     *
     * @param intialSize the initial capacity, rounded to the next prime.
     */
    public OpenHashTable(int intialSize) {
        data = new LinkedListPT[nextPrime(intialSize)];
        makeEmpty();
    }

    /**
     * Make that hash table empty.
     */
    public void makeEmpty() {
        for (int i = 0; i < data.length; i++) {
            data[i] = null;
        }
    }

    /**
     * This method returns true if there are no student objects in the hash
     * table.
     *
     * @return true if the hash table contains no student objects.
     */
    public boolean isEmpty() {
        if (size() != 0) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * Gets the student object given the key (student number). This method does
     * NOT remove the object.
     *
     * @param key
     * @return student object for the given key (student number)
     */
    public CSStudent get(int key) {
       
        int i = hash(key);
        return data[i].get(key);
    }
   



/**
 * Puts a student in the Hash Table. Duplicates are fine, and assume student
 * objects are correct and have unique keys.
 *
 * @param student valid student object
 */
public void put(CSStudent student) {

       int i = hash(student.hashCode());
       if (student.getKey() == i) {
          
       }
       
    }

    /**
     * Determines if a student object exists with the given key (student number)
     *
     * @param key key (student number)
     * @return returns true if the student with the given key (student number)
     * exists
     */
    public boolean containsKey(int key) {
        int i = hash(key);
        boolean found = false;
        
        if (data[i].get(key) != null) {
            found = true;
            return found ;
        } else
            
            return found;
//        do {
//            if (data[i].get(key).equals(key)) {
//                found = true;
//                s = data[i];
//            } else {
//                i = (i + 1) % capacity();
//            }
//        } while (!found && data[i] != null);
         
    }

    /**
     * The number of student objects in the hash table.
     *
     * @return the number of student objects in the hash table.
     */
    public int size() {
        int size = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] != null) {
                size++;
            }
        }
        return size;
    }

    /**
     * The capacity of the Open Hash Table; THINK! THINK! THINK!
     *
     * @return
     */
    public int capacity() {

        return data.length;
    }

    /**
     * COMPLETE!
     *
     * @return returns a graphic of the Open Hash Table
     */
    public String toString() {
        String s = "";
        for (int i = 0; i < data.length; i++) {
            if (data[i] != null) {
                s = s + "\n" + "HT[" + i + "] " + data[i].toString();
            } else {
                s = s + "\n" + "HT[" + i + "] EMPTY";
            }
        }
        return s;
    }

    /**
     * Hash Function; COMPLETE
     *
     * @param key key (student number)
     * @return hash value
     */
    public int hash(int key) {
        return key % data.length;
    }

    /**
     * COMPLETE
     */
    public static int nextPrime(int n) {
        while (!isPrime(n)) {
            n++;
        };
        return n;
    }

    /**
     * COMPLETE
     */
    private static boolean isPrime(long n) {
        // EVEN TEST
        if (n > 2 && (n & 1) == 0) {
            return false;
        }
        // ODD FACTORS
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
