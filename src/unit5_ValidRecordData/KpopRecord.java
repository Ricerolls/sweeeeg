/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit5_ValidRecordData;

/**
 *
 * @author 1leste
 */
public class KpopRecord {

    // CLASS CONSTANTS

    protected static final int RECORD_SIZE = 10;
    public static final int LENGTH_ARTIST = 15;
    public static final int LENGTH_SONG = 20;

    // CLASS VARIABLES
    public static int lastID = 0;
    
    
     // OBJECT VARIABLES
    private String artistName;
    private String songName;
    private int playlistSize;
    private int id;
    
    public KpopRecord() {
        this("N/A","N/A" , 0);
        
    }

    public KpopRecord(String artistName, String songName, int id) {
        this.artistName = artistName;
        this.songName = songName;
        this.id = id;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
    if ( artistName != null ) {
            StringBuilder temp = new StringBuilder( artistName.trim() );
            temp.setLength( LENGTH_ARTIST );

            // trucates or pads the string
            this.artistName = temp.toString();
        } else {
            // TODO
            this.artistName = "TBD";
        }
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
      if ( songName != null ) {
            StringBuilder temp = new StringBuilder( songName.trim() );
            temp.setLength( LENGTH_SONG );

            // trucates or pads the string
            this.songName = temp.toString();
        } else {
            // TODO
            this.songName = "TBD";
        }
    }

    public int getPlaylistSize() {
        return playlistSize;
    }

    public void setPlaylistSize(int playlistSize) {
        this.playlistSize = playlistSize;
    }

    @Override
    public String toString() {
        return "KpopRecord{" + "artistName=" + artistName + ", songName=" + songName + ", playlistSize=" + playlistSize + ", id=" + id + '}';
    }
    
    
}
