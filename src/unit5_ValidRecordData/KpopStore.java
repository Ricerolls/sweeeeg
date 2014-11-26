/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit5_ValidRecordData;


import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 * @author Steven Le
 * @date 25/11/2014
 * @version 1.0
 */
public class KpopStore extends KpopRecord {
    
    static RandomAccessFile recordFile;
    static Scanner input = new Scanner(System.in);
   
//opens and creates file
    public static void openStore() throws IOException {
        try {
            //creates file
            recordFile = new RandomAccessFile("kpop.txt", "rw");
            //catches error
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
//closes the file
    public static void closeStore() throws IOException {
        recordFile.close();

    }
//menu for the user
    public static void menu() throws IOException {

        int userOption = 0;
        boolean noError = true;
        //prints out options when their is no errors
        while (noError == true) {
            System.out.println("Select an option: \n" + "1. Display record \n"
                    + "2. Add Record \n" + "3. Edit Record \n" + "4. Exit \n" + "Input here: \n");
            try {
                //if its a strng, it returns false
                userOption = Integer.parseInt(input.nextLine());
                noError = false;
                //catches the error, and force the user to input a integer
            } catch (NumberFormatException e) {
                System.out.println("You did not enter a number");
                System.out.println(e);
            }
            //menu with functioning methods
            switch (userOption) {
                case 1:
                    displayRecord();
                    menu();
                    break;
                case 2:
                    addRecord();
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
    }
//reads the record and store them
    public static KpopRecord readRecord() throws IOException {
        KpopRecord k2 = new KpopRecord();
        
        //stores the characters into a array
        char artistName[] = new char[LENGTH_ARTIST];
        for (int i = 0; i < LENGTH_ARTIST; i++) {
            //sets object variable
            artistName[i] = recordFile.readChar();
        }
        k2.setArtistName(new String(artistName));
        //stores the characters into a array
        char songName[] = new char[LENGTH_SONG];
        for (int i = 0; i < LENGTH_SONG; i++) {
            //sets object variable
            songName[i] = recordFile.readChar();
        }
        k2.setSongName(new String(songName));
        //stores the characters into a array
        char albumName[] = new char[LENGTH_ALBUM];
        for (int i = 0; i < LENGTH_ALBUM; i++) {
            //sets object variable
            albumName[i] = recordFile.readChar();
        }
        //sets object variable
        k2.setAlbumName(new String(albumName));
        //sets object variable
        k2.setPlaylistSize(recordFile.readInt());
        

//        char playlistSize[] = new char [LENGTH_PLAYLIST];
//        for (int i = 0; i < LENGTH_PLAYLIST; i++) {
//          playlistSize[i] = recordFile.readChar();
//    }   
//        k2.setPlaylistSize(Integer.parseInt(new String(playlistSize)));
        
   return k2;
    }
//writes the record into the file
    public static KpopRecord writeRecord(KpopRecord k2) throws IOException {
        //file pointer for records
        if (k2.getId() == -1) {
            recordFile.seek(recordFile.length());
            k2.setId(k2.getId() / RECORD_SIZE);
        } else {
            recordFile.seek(k2.getId() * RECORD_SIZE);
        }

        //writes out all the object varibles into the file
        recordFile.writeChars(k2.getArtistName());
        recordFile.writeChars(k2.getSongName());
        recordFile.writeChars(k2.getAlbumName());
        recordFile.writeChar(k2.getPlaylistSize());

        return k2;
    }
//sets object varible and ask for user input
    public static KpopRecord addRecord() throws IOException {
        KpopRecord k2 = new KpopRecord();
        boolean noError = true;
        //sets object string (Note: some artist can have numbers in their names)
        System.out.println("Enter a artist: ");
        String artist = input.nextLine();
        k2.setArtistName(artist);
        //sets object string
        System.out.println("Enter the name of the song: ");
        String song = input.nextLine();
        k2.setSongName(song);
        //sets object string
        System.out.println("Enter the album name: ");
        String albumName = input.nextLine();
        k2.setAlbumName(albumName);
        //catches a error if the user decides to type out a string instead of a 
       //integer, which loops until the user enters a integer
        while (noError == true) {
            System.out.println("Enter the playlist size:  ");
            try {
                //returns false for no errors
                String playlistSize = input.nextLine();
                k2.setPlaylistSize(Integer.parseInt(playlistSize));
                noError = false;
            } catch (NumberFormatException e) {
                System.out.println("You did not enter a integer for playlist, please type it again.");
                System.out.println(e);
            }
        }
//       
        //returns all the set values to the writeRecord method where it can 
        //write down these set object variables
        return writeRecord(k2);

    }
//displays the record
    public static KpopRecord displayRecord() {
        KpopRecord k2 = new KpopRecord();
        System.out.println(k2.toString());
        return k2;
    }
//modifys record by overwriting on top of the previous or keeps the same
    public static KpopRecord editRecord() throws IOException {

        KpopRecord k2 = new KpopRecord();
        boolean noError = true;
        
        //ask for user input,and stores a new string and replaces the current
        //also checks if their is 2 identical strings
        //this modifys the data of the previous
        System.out.println("Enter a artist or keep the same one by typing nothing: ");
        String artist = input.nextLine();
        String currentArtist = "";
        if (!currentArtist.equals(artist)) {
            k2.setArtistName(artist);
            currentArtist = artist;
        }
        //ask for user input,and stores a new string and replaces the current
        //also checks if their is 2 identical strings
        //this modifys the data of the previous
        System.out.println("Enter the name of the song or keep the same one by typing nothing: ");
        String song = input.nextLine();
        String currentSong = "";
        if (!currentArtist.equals(song)) {
            k2.setSongName(song);
            currentSong = song;
        }
        //ask for user input,and stores a new string and replaces the current
        //also checks if their is 2 identical strings
        //this modifys the data of the previous
        System.out.println("Enter the album name or or keep the same one by typing nothing: ");
        String albumName = input.nextLine();
        String currentAlbumName = "";
        if (!currentAlbumName.equals(albumName)) {
            k2.setAlbumName(albumName);
            currentAlbumName = albumName;
        }
        //ask for user input,and stores a new string and replaces the current
        //also checks if their is 2 identical strings
        //this modifys the data of the previous
        //catches any errors that isn't a integer and forces the user 
        //to enter a integer
        while (noError == true) {
            System.out.println("Enter the playlist size or keep the same one by typing nothing:  ");
            try {
                String playlistSize = input.nextLine();
                String currentPSize = "";
                if (!currentPSize.equals(playlistSize)) {
                    k2.setPlaylistSize(Integer.parseInt(playlistSize));
                    currentPSize = playlistSize;
                    noError = false;
                }
                //catches the error of not being a integer
            } catch (NumberFormatException e) {
                System.out.println("You did not enter a integer for playlist, please type it again.");
                System.out.println(e);
            }
        }
        return k2;
    }

    public static void main(String[] args) throws Exception {
        long position, recordNumber = 0;
        boolean noError = true;
        KpopRecord k2 = new KpopRecord();
        //opens the file first
        openStore();
        //modifications happend if the user choose to do so
        menu();

        //prints out how much records their are
        recordNumber = recordFile.length() / KpopRecord.RECORD_SIZE;
        System.out.println("RECORD SIZE: " + recordFile.length());
        System.out.println("There is currently " + recordNumber + " records in this file");
        //forces user to type a integer, 0 to exit, and 1- record number to choose one
        while (noError == true) {
            System.out.println("Which record do you want [1 - " + recordNumber + "] or 0 to exit?");
            try {
                //user chooses which record they want
                recordNumber = Integer.parseInt(input.nextLine());
                noError = false;
                //catches the error of not being a integer
            } catch (NumberFormatException e) {
                System.out.println("You did not enter a integer");
                System.out.println(e);
            }
            //seeks the record
            while (recordNumber != 0) {
                
            position = KpopRecord.RECORD_SIZE * (recordNumber - 1);
                recordFile.seek(k2.getId() * RECORD_SIZE);
                //goes back to menu with the record wanting to be modified
                menu();
                closeStore();

            }
        }
    }
}


        
    
