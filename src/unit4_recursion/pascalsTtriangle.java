/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit4_recursion;

/**
 *
 * @author 1leste
 */
public class pascalsTtriangle {

    public void generateTri(int maxRow) {
        int row;
        int col;

        for (int i = 0; i < maxRow; i++) {
            row = i + 1;
            col = 1;
            for (int s = 0; s <= i; s++ ) {
               if(s>0){
                   col = col * (row - s);
               }
               System.out.print(" ");
            }
            
        }
    }
    
    public void generateTri2D(int maxRow) {
        int triangle [][] = new int[maxRow][(maxRow + 1)*2];
        
        int leftSide;
        int rightSide;
        
        triangle[0][maxRow - 1] = 1;
        leftSide = maxRow - 1;
        rightSide = maxRow - 1;
        for (int i = 0; i < maxRow; i++) {
            rightSide++;
            leftSide--;        
            
            triangle[i][rightSide] = 1;
            triangle[i][leftSide] = 1;
        }
    }
    
    
    
}
