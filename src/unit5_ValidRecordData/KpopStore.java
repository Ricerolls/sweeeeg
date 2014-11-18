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
    
    static Scanner input = new Scanner(System.in);
    long position, recordNumber;
     static KpopRecord k2 = new KpopRecord();

    public static void menu() {
        
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
        System.out.println(" ");
        System.out.println("Select an option: \n" + "1. Display record \n"
                + "2. Add Record \n" + "3. Exit");
        System.out.print("Input here: ");
        int userOption = Integer.parseInt(input.nextLine());
        switch (userOption) {
            case 1:
                displayRecord();
                menu();
                break;
            case 3:
                editRecord();
                menu();
                break;
            case 4:
                break;
            default:
                System.out.println("Enter a valid option");
                break;
        }
    }
    
    public static void addRecord() {
        System.out.println("Enter a artist or keep the current one: ");
        String artist = input.nextLine();
        k2.setArtistName(artist);
        System.out.println("Enter the name of the song or keep the current: ");
        String song = input.nextLine();
        k2.setSongName(song);
        System.out.println("Enter the album name or keep the current: ");
        String albumName = input.nextLine();
        k2.setSongName(song);
         System.out.println("Enter the playlist size or keep current:  ");
        String playlistSize = input.nextLine();
        k2.setPlaylistSize(Integer.parseInt(playlistSize));
        
    }
    
    public static void displayRecord() {
        System.out.println(k2.toString());
//        System.out.println("RECORD SIZE: " + recordFile.length());
    }

    public static void editRecord() {
//        RandomAccessFile recordFile = new RandomAccessFile("kpop.txt", "rw");
//        KpopRecord k2 = new KpopRecord();

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
        RandomAccessFile recordFile = new RandomAccessFile("kpop.txt", "rw");

        recordFile.seek(0);
        recordFile.writeChars(k2.getArtistName());
        recordFile.writeChars(k2.getSongName());
        recordFile.writeChar(k2.getPlaylistSize());
//        position = k2.RECORD_SIZE * ( - 1);
        
        System.out.println("RECORD SIZE: " + recordFile.length());
        
    }

}
