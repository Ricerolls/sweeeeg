/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.hdsb.gwss.ics3u.le.unit5_informationStorage;

import java.io.File;
import java.io.PrintWriter;

/**
 *
 * @author 1leste
 */
public class RandomNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
        // TODO code application logic here
        File file = new File ("output.txt");
        PrintWriter output = new PrintWriter(file);
        
        for (int i = 1; i < 1000; i++) {
            output.println(Math.random) * 100;
        }
        
        
    }
    
}
