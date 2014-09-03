/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics3u.le.unit3_arrays;

/**
 * Name: Steven Le Date: Nov. 23, 2013 Version: v0.1
 *
 * @author 1leste Description: A list of array methods for other programs.
 */
public class StevensArrayUtilities implements ArrayUtilities {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

//        StevensArrayUtilities mau = new StevensArrayUtilities();
//        int[][] data = {{1, 5, 9}, {1, 2, 6}};
//
//        System.out.println(mau.findMaximumValue(data));
    }

    /**
     * This method creates the same copy of an array
     *
     * @param data original array about to be copied
     * @return the same copy of data
     */
    public int[] copyArray(int[] data) {
        int[] copy = new int[data.length];
        for (int row = 0; row < data.length; row++) {
            copy[row] = data[row];
        }
        return copy;
    }

    public int[][] copyArray(int[][] data) {
        int[][] copy = new int[data.length][data[0].length];
        for (int row = 0; row < data.length; row++) {
            int[] rowData = new int[data[row].length];
            for (int col = 0; col < data[row].length; col++) {
                rowData[col] = data[row][col];
            }
        }
        return copy;
    }

    public double[] copyArray(double[] data) {
        double[] copy = new double[data.length];
        for (int row = 0; row < data.length; row++) {
            copy[row] = data[row];
        }
        return copy;
    }

    public double[][] copyArray(double[][] data) {
        double[][] copy = new double[data.length][data[0].length];
        for (int row = 0; row < data.length; row++) {
            for (int col = 0; col < data[row].length; col++) {
                data[row][col] = data[row][col];
            }
        }
        return copy;
    }

    public String[] copyArray(String[] data) {
        String[] copy = new String[data.length];
        for (int row = 0; row < data.length; row++) {
            copy[row] = data[row];
        }
        return copy;
    }

    public String[][] copyArray(String[][] data) {
        String[][] copy = new String[data.length][data[0].length];
        for (int row = 0; row < data.length; row++) {
            for (int col = 0; col < data[row].length; col++){
             copy[row][col] = data[row][col];
            }
    
        }
        return copy;
    }

    /**
     * This method displays the array.
     *
     * @param data represents the array which is being displayed.
     */
    public void displayArray(int[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }

    public void displayArray(double[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }

    public void displayArray(String[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]);
        }
        System.out.println();
    }

    public void displayArray(int[][] data) {
        for (int row = 0; row < data.length; row++) {
            for (int col = 0; col < data[row].length; row++) {
                System.out.println(data[row][col]);
            }
        }
    }

    public void displayArray(double[][] data) {
        for (int row = 0; row < data.length; row++) {
            for (int col = 0; col < data[row].length; row++) {
                System.out.println(data[row][col]);
            }
        }
    }

    public void displayArray(String[][] data) {
        for (int row = 0; row < data.length; row++) {
            for (int col = 0; col < data[row].length; col++) {
                System.out.print(data[row][col]);
            }
            System.out.println();
        }
    }

    public void swap(int[] data, int i, int j) {
        int tempi;
        tempi = data[i];
        data[i] = data[j];
        data[j] = tempi;
    }

    public void swap(int[][] data, int rowI, int colI, int rowJ, int colJ) {
        int tempi;
        tempi = data[rowI][colI];
        data[rowI][colI] = data[rowJ][colJ];
        data[rowJ][colJ] = tempi;
    }

    public void swap(double[] data, int i, int j) {
        double tempi;
        tempi = data[i];
        data[i] = data[j];
        data[j] = tempi;
    }

    public void swap(double[][] data, int rowI, int colI, int rowJ, int colJ) {
        double tempi;
        tempi = data[rowI][colI];
        data[rowI][colI] = data[rowJ][colJ];
        data[rowJ][colJ] = tempi;
    }

    public void swap(String[] data, int i, int j) {
        String tempi;
        tempi = data[i];
        data[i] = data[j];
        data[j] = tempi;
    }

    public void swap(String[][] data, int rowI, int colI, int rowJ, int colJ) {
        String tempi;
        tempi = data[rowI][colI];
        data[rowI][colI] = data[rowJ][colJ];
        data[rowJ][colJ] = tempi;
    }

    public void bubbleSort(int[] data) {
        for (int move = 0; move < data.length; move++) {
            for (int i = 0; i < data.length - move - 1; i++) {
                int temp;
                if (data[i] > data[i + 1]) {
                    temp = data[i + 1];
                    data[i + 1] = data[i];
                    data[i] = temp;
                }
            }

        }

    }

    public void selectionSort(int[] data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void bubbleSort(double[] data) {
        for (double move = 0; move < data.length; move++) {
            for (int i = 0; i < data.length - move - 1; i++) {
                double temp;
                if (data[i] > data[i + 1]) {
                    temp = data[i + 1];
                    data[i + 1] = data[i];
                    data[i] = temp;
                }
            }

        }

    }

    public void selectionSort(double[] data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void bubbleSort(String[] data) {
        String temp;
        for (double move = 0; move < data.length; move++) {
            for (int i = 0; i < data.length - move - 1; i++) {
                int compareNumber = data[i].compareTo(data[i + 1]);
                if (compareNumber < 0) {
                    temp = data[i + 1];
                    data[i + 1] = data[i];
                    data[i] = temp;
                }
            }

        }
    }

    public void selectionSort(String[] data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int linearSearch(int[] data, int value) {
        int indexOfValue = -1;
        for (int i = 0; i < data.length; i++) {
            if (value == data[i]) {
                indexOfValue = i;
            }
        }
        return indexOfValue;
    }

    public void binarySearch(int[] data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double linearSearch(double[] data, double value) {
        double indexOfValue = -1;
        for (int i = 0; i < data.length; i++) {
            if (value == data[i]) {
                indexOfValue = i;
            }
        }
        return indexOfValue;
    }

    public void binarySearch(double[] data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int linearSearch(String[] data, String value) {
        int indexOfValue = -1;
        for (int i = 0; i < data.length; i++) {
            if (value == data[i]) {
                indexOfValue = i;
            }
        }
        return indexOfValue;
    }

    public void binarySearch(String[] data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * finds the max value of the array.
     *
     * @param data is the array about to become the max value.
     * @return the max value.
     */
    public int findMaximumValue(int[] data) {
        int max = data[0];
        for (int i = 0; i < data.length; i++) {
            if (data[i] > max) {
                max = data[i];
            }
        }
        return max;
    }

    public double findMaximumValue(double[] data) {
        double max = data[0];
        for (int i = 0; i < data.length; i++) {
            if (data[i] > max) {
                max = data[i];

            }
        }
        return max;
    }

    public int findIndexOfMaximumValue(int[] data) {
        int indexOfMaximum = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] > indexOfMaximum) {
                indexOfMaximum = i;
            }
        }
        return indexOfMaximum;
    }
    
    public int findIndexOfMaximumValue(int[][] data, int column ) {
        int indexOfMaximum = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i][column] > data[indexOfMaximum][column]) {
                indexOfMaximum = i;
            }
        }
        return indexOfMaximum;
    }

    public int findIndexOfMaximumValue(double[] data) {
        int indexOfMaximum = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] > indexOfMaximum) {
                indexOfMaximum = i;
            }
        }
        return indexOfMaximum;
    }

    public int findMinimumValue(int[] data) {
        int low = data[0];
        for (int i = 0; i < data.length; i++) {
            if (data[i] < low) {
                low = data[i];
            }
        }
        return low;
    }

    public double findMinimumValue(double[] data) {
        double low = data[0];
        for (int i = 0; i < data.length; i++) {
            if (data[i] < low) {
                low = data[i];
            }
        }
        return low;
    }

    public int findIndexOfMinimumValue(int[] data) {
        int indexOfMinimum = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] < indexOfMinimum) {
                indexOfMinimum = i;
            }
        }
        return indexOfMinimum;
    }
    public int findIndexOfMinimumValue(int[][] data, int column ) {
        int indexOfMinimum = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i][column] < data[indexOfMinimum][column]) {
                indexOfMinimum = i;
            }
        }
        return indexOfMinimum;
    }

    public int findIndexOfMinimumValue(double[] data) {
        int indexOfMinimum = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] < indexOfMinimum) {
                indexOfMinimum = i;
            }
        }
        return indexOfMinimum;
    }

    public int findMaximumValue(int[][] data) {
        int maxValue = data[0][0];
        for (int row = 1; row < data.length; row++) {
            for (int col = 1; col < data.length; col++) {
                if (data[row][col] > maxValue) {
                    maxValue = data[row][col];
                }
            }

        }
        return maxValue;
    }

    public double findMaximumValue(double[][] data) {
        double maxValue = data[0][0];
        for (int row = 1; row < data.length; row++) {
            for (int col = 1; col < data.length; col++) {
                if (data[row][col] > maxValue) {
                    maxValue = data[row][col];
                }
            }

        }
        return maxValue;
    }

    public int[] findIndexOfMaximumValue(int[][] data) {
        int[] indicesOfMaxValue = new int[2];
        for (int j = 0; j < data.length; j++) {
            for (int i = 0; i < data.length; i++) {
                if (data[i][j] > data[indicesOfMaxValue[0]][indicesOfMaxValue[1]]) {
                    indicesOfMaxValue[0] = j;
                    indicesOfMaxValue[1] = i;
                }
            }
        }
        return indicesOfMaxValue;

    }

    public int[] findIndexOfMaximumValue(double[][] data) {
        int[] indicesOfMaxValue = new int[2];
        for (int j = 0; j < data.length; j++) {
            for (int i = 0; i < data.length; i++) {
                if (data[i][j] > data[indicesOfMaxValue[0]][indicesOfMaxValue[1]]) {
                    indicesOfMaxValue[0] = j;
                    indicesOfMaxValue[1] = i;
                }
            }
        }
        return indicesOfMaxValue;

    }

    public int findMinimumValue(int[][] data) {
        int minValue = data[0][0];
        for (int row = 1; row < data.length; row++) {
            for (int col = 1; col < data.length; col++) {
                if (data[row][col] < minValue) {
                    minValue = data[row][col];
                }
            }

        }
        return minValue;
    }

    public double findMinimumValue(double[][] data) {
        double minValue = findMinimumValue(data[0]);
        for (int row = 1; row < data.length; row++) {
            double rowMax = findMinimumValue(data[row]);

            if (rowMax > minValue) {
                minValue = rowMax;
            }
        }
        return minValue;
    }

    public int[] findIndexOfMinimumValue(int[][] data) {
        int[] indicesOfMinValue = new int[2];
        for (int j = 0; j < data.length; j++) {
            for (int i = 0; i < data.length; i++) {
                if (data[i][j] < data[indicesOfMinValue[0]][indicesOfMinValue[1]]) {
                    indicesOfMinValue[0] = j;
                    indicesOfMinValue[1] = i;
                }
            }
        }
        return indicesOfMinValue;

    }

    public int[] findIndexOfMinimumValue(double[][] data) {
        int[] indicesOfMinValue = new int[2];
        for (int j = 0; j < data.length; j++) {
            for (int i = 0; i < data.length; i++) {
                if (data[i][j] < data[indicesOfMinValue[0]][indicesOfMinValue[1]]) {
                    indicesOfMinValue[0] = j;
                    indicesOfMinValue[1] = i;
                }
            }
        }
        return indicesOfMinValue;

    }

    /**
     * This methods returns the average of the array
     *
     * @param data is the total array
     * @return the array average value
     */
    public double findAverage(int[] data) {
        int sum = 0;
        for (int row = 0; row < data.length; row++) {
            sum = sum + data[row];
        }
        return sum / data.length;
    }

    public double findAverage(double[] data) {
        double sum = 0;
        for (int row = 0; row < data.length; row++) {
            sum = sum + data[row];
        }
        return sum / data.length;
    }

    public double findAverage(int[][] data, int column) {
        int sum = 0;
        int numberOfCells = 0;
        for (int row = 0; row < data.length; row++) {

            sum = sum + data[row][column];

        }
        return sum / data.length;
    }

    public double findAverage(double[][] data) {
        double sum = 0;
        double numberOfCells = 0;
        for (int row = 0; row < data.length; row++) {
            for (int col = 0; col < data[row].length; row++) {
                sum = sum + data[row][col];
                numberOfCells++;
            }
        }
        return sum / numberOfCells;
    }

    public double findSum(int[] data) {
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum = sum + data[i];
        }
        return sum;
    }

    public double findSum(double[] data) {
        double sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum = sum + data[i];
        }
        return sum;
    }

    public double findSum(int[][] data) {
        int sum = 0;
        for (int row = 0; row < data.length; row++) {
            for (int col = 0; col < data[row].length; row++) {
                sum = sum + data[row][col];
            }
        }
        return sum;
    }

    public double findSum(double[][] data) {
        double sum = 0;
        for (int row = 0; row < data.length; row++) {
            for (int col = 0; col < data[row].length; row++) {
                sum = sum + data[row][col];
            }
        }
        return sum;
    }
}
