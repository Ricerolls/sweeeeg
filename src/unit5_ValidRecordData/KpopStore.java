/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit5_ValidRecordData;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author 1leste
 */
public class KpopStore extends KpopRecord {

    static RandomAccessFile recordFile;
    static Scanner input = new Scanner(System.in);

    long position, recordNumber;

    public static void openStore() throws IOException {
        try {
            recordFile = new RandomAccessFile("kpop.txt", "rw");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void closeStore() throws IOException {
        recordFile.close();

    }

    public static void menu() throws IOException {

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
                + "2. Add Record \n" + "3. Edit Record \n" + "4. Exit \n");
        System.out.print("Input here: ");
        int userOption = Integer.parseInt(input.nextLine());
        switch (userOption) {
            case 1:
                displayRecord();
                menu();
                break;
            case 2:

                addRecord();
                
                readRecord();
                
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

    public static KpopRecord readRecord() throws IOException {
        KpopRecord k2 = new KpopRecord();
        char artistName[] = new char[LENGTH_ARTIST];
        for (int i = 0; i < LENGTH_ARTIST; i++) {
            artistName[i] = recordFile.readChar();
        }
        k2.setArtistName(new String(artistName));

        char songName[] = new char[LENGTH_SONG];
        for (int i = 0; i < LENGTH_SONG; i++) {
            songName[i] = recordFile.readChar();
        }
        k2.setSongName(new String(songName));

        char albumName[] = new char[LENGTH_ALBUM];
        for (int i = 0; i < LENGTH_ALBUM; i++) {
            albumName[i] = recordFile.readChar();
        }
        k2.setAlbumName(new String(albumName));

        k2.setPlaylistSize(recordFile.readInt());

//        char playlistSize[] = new char [LENGTH_PLAYLIST];
//        for (int i = 0; i < LENGTH_PLAYLIST; i++) {
//          playlistSize[i] = recordFile.readChar();
//    }   
//        k2.setPlaylistSize(Integer.parseInt(new String(playlistSize)));
        return k2;
    }

    public static KpopRecord writeRecord( KpopRecord k2 ) throws IOException {
        
        if( k2.getId() == -1 ) {
            recordFile.seek( recordFile.length() );
            k2.setId( k2.getId() / RECORD_SIZE );
        }
        else {
            recordFile.seek( k2.getId() * RECORD_SIZE );
        }

        recordFile.writeChars(k2.getArtistName());
        recordFile.writeChars(k2.getSongName());
        recordFile.writeChars(k2.getAlbumName());
        recordFile.writeChar(k2.getPlaylistSize());

        return k2;
    }

    public static KpopRecord addRecord() throws IOException {
        KpopRecord k2 = new KpopRecord();
        System.out.println("Enter a artist or keep the current one: ");
        String artist = input.nextLine();
        k2.setArtistName(artist);
        System.out.println("Enter the name of the song or keep the current: ");
        String song = input.nextLine();
        k2.setSongName(song);
        System.out.println("Enter the album name or keep the current: ");
        String albumName = input.nextLine();
        k2.setAlbumName(albumName);
        System.out.println("Enter the playlist size or keep current:  ");
        String playlistSize = input.nextLine();
        k2.setPlaylistSize(Integer.parseInt(playlistSize));
        
        return writeRecord( k2 );
        
    }

    public static KpopRecord displayRecord() {
        KpopRecord k2 = new KpopRecord();
        System.out.println(k2.toString());
        return k2;
    }

    public static KpopRecord editRecord() throws IOException {

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
        if (!currentPSize.equals(playlistSize)) {
            k2.setPlaylistSize(Integer.parseInt(playlistSize));
        }
        return k2;
    }

    public static void main(String[] args) throws Exception {
        long position, recordNumber;
        KpopRecord k2 = new KpopRecord();

        openStore();
        menu();

//        recordNumber = recordFile.length() / k2.RECORD_SIZE;
//        System.out.println("RECORD SIZE: " + recordFile.length());
//        System.out.println("There is currently " + recordNumber + " records in this file");
//        System.out.println("Which record do you want [1 - " + recordNumber + "] or 0 to exit?");
//        recordNumber = Integer.parseInt(input.nextLine());
//        while (recordNumber != 0) {
//            position = k2.RECORD_SIZE * (recordNumber - 1);
//            recordFile.seek(position);
//            recordFile.writeChars(k2.getArtistName());
//            recordFile.writeChars(k2.getSongName()); 
//            recordFile.writeChar(k2.getPlaylistSize()); 
        closeStore();
//            menu();

        }
        
    
}
