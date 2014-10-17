/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit2_objectsOrientedProgram;

import java.util.ArrayList;

/**
 *
 * @author 1leste
 */
public class candyClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //for (int i = 0; i < 5; i++) {
        //b.setTitle(input.nextLine())
        //book.add(b);
        //}
        //for (int i = 0: < i < book.size() ; i++)
        //Book b = book.get(i)
        
        
        ArrayList candy = new ArrayList();
        Candy candy1 = new Candy();
        Candy candy2 = new Candy();
        Candy candy3 = new Candy();
        Candy candy4 = new Candy();
        Candy candy5 = new Candy();

        candy.add(candy1);
        candy.add(candy2);
        candy.add(candy3);
        candy.add(candy4);
        candy.add(candy5);

        candy1.setColourOfWrapper("Red");
        candy1.setFlavour("Strawberry");
        candy1.setBrand("Excel");

        candy2.setColourOfWrapper("Orange");
        candy2.setFlavour("Orange");
        candy2.setBrand("Hi-Chew");
        
        candy3.setColourOfWrapper("Red");
        candy3.setFlavour("Strawberry");
        candy3.setBrand("Excel");

        candy4.setColourOfWrapper("Red");
        candy4.setFlavour("Strawberry");
        candy4.setBrand("Excel");

        candy5.setColourOfWrapper("Red");
        candy5.setFlavour("Strawberry");
        candy5.setBrand("Excel");

    }

}
