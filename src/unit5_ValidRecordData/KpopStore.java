/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit5_ValidRecordData;

import java.io.RandomAccessFile;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author 1leste
 */
public class KpopStore {

    /**
     * @param args the command line arguments
     */
    static Scanner input = new Scanner(System.in);

    public static void menu() {
        int userOption = input.nextInt();
//        String myInput;
//        boolean noError = true;
//
//        // PROBLEM BELOW
//        while (noError == true) {
//            myInput = JOptionPane.showInputDialog( "Please enter a number" );
//            
//            try {
//                userOption = Integer.parseInt(myInput);
//                noError = false;
//            } catch ( NumberFormatException nfe ) {
//                // EXCEPTION
//                System.out.println( "You did not enter an number" );
//                System.out.println( nfe );
//            }
//        }

        System.out.println("Select an option: \n" + "1. Display record \n"
                + "2. Display all record \n" + "3. Add Record \n" + "5. Exit");
        switch (userOption) {
            case 1:
                displayRecord();
            case 2:
                displayAllRecord();
            case 3:
                addRecord();
            case 4:
                break;
        }
    }

    public static void displayRecord() {

    }

    public static void displayAllRecord() {
    }

    public static void addRecord() {
//        RandomAccessFile recordFile = new RandomAccessFile("kpop.txt", "rw");
        KpopRecord k2 = new KpopRecord();

        System.out.println("Enter a artist or keep the current one: ");
        String artist = input.nextLine();
        String currentArtist = "";
        if (!currentArtist.equals(artist)) {
            k2.setArtistName(artist);
            currentArtist = artist;
        }
        System.out.println("Enter the name of the song or keep the current: ");
        String song = input.nextLine();
        String currentSong = "";
        if (!currentArtist.equals(song)) {
            k2.setSongName(song);
            currentSong = song;
        }
        System.out.println("Enter the album name or keep the current: ");
        String albumName = input.nextLine();
        String currentAlbumName = "";
        if (!currentAlbumName.equals(albumName)) {
            k2.setAlbumName(albumName);
            currentAlbumName = albumName;
        } 
        System.out.println("Enter the playlist size or keep current:  ");
        String playlistSize = input.nextLine();
        String currentPSize = "";
        if (!currentPSize.equals(playlistSize)){
            k2.setPlaylistSize(Integer.parseInt(playlistSize));
        }
        

    }

    public static void main(String[] args) throws Exception {

        menu();

//        KpopRecord k1 = new KpopRecord("Taeyang", "Eyes noes Lips", "Swag", 0);
//        System.out.print(k1.toString());
//
//        RandomAccessFile recordFile = new RandomAccessFile("kpop.txt", "rw");
//
//        recordFile.seek(0);
//        recordFile.writeChars(k1.getArtistName());
//        recordFile.writeChars(k1.getSongName());
//        recordFile.writeChar(k1.getPlaylistSize());
//        System.out.println("RECORD SIZE: " + recordFile.length());
    }

}
