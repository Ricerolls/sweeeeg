/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit5_ValidRecordData;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

/**
 *
 * @author 1leste
 */
public class KpopStore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception {
       
       KpopRecord k1 = new KpopRecord("Taeyang", "Eyes noes Lips","Swag", 0);
       System.out.print(k1.toString());
       
       RandomAccessFile recordFile = new RandomAccessFile("kpop.txt", "rw");
       
        recordFile.seek(0);
        recordFile.writeChars(k1.getArtistName());
        recordFile.writeChars(k1.getSongName());
        recordFile.writeChar(k1.getPlaylistSize());
        System.out.println("RECORD SIZE: " + recordFile.length());
    }
    
}
