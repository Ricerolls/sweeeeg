/*
 * Decoding Assignment
 */
package edu.hdsb.gwss.ics3u.le.unit7_computerEnvironment;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/**
 */
public class Decoder {

    static final int BASE_BINARY = 2;
    static final int BASE_OCTAL = 8;
    static final int BASE_HEX = 16;

    static Scanner message;
    static FileWriter responseFile;
    static int base = -1;

    /**
     * Decoding Template
     *
     * DO NOT TOUCH MAIN
     */
    public static void main(String[] args) throws Exception {

        // ---------------------------------------------
        // PART 1: decode message
        // Encoded Message
        message = new Scanner(new File("message.txt"));

        // Read Line( 1 Line == 1 Character )
        while (message.hasNext()) {

            System.out.print(
                    decodeCharacter(message.nextLine())
            );

        }
        System.out.println("");

        // ---------------------------------------------
        // PART 2: encode response
        String text = "I want perfect on this assignment.";

        // Endcode Response
        responseFile = new FileWriter(new File("response.txt"));
        randomBase();
        System.out.println("CONVERTING: ASCII to BASE " + base);

        // Encode EACH letter
        for (int i = 0; i < text.length(); i++) {

            // ENCODE LETTER
            responseFile.write(
                    encodeLetter(text.charAt(i))
            );
        }

        responseFile.close();
    }

    /**
     * randomBase
     */
    public static void randomBase() {
        int i = (int) (Math.random() * 3);
        switch (i) {
            case 0:
                base = BASE_BINARY;
                break;
            case 1:
                base = BASE_OCTAL;
                break;
            case 2:
                base = BASE_HEX;
                break;
        }
    }

    /**
     * Part 1A
     *
     * TODO: Determine Base
     */
    public static int determineBase(String text) {

        base = BASE_BINARY;
        for (int i = 0; i < text.length(); i++) {
            switch (text.charAt(i)) {

                case 'A':
                case 'a':
                case 'B':
                case 'b':
                case 'C':
                case 'c':
                case 'D':
                case 'd':
                case 'E':
                case 'e':
                case 'F':
                case 'f':
                case '8':
                case '9':

                    base = BASE_HEX;
                    i = text.length();
                    break;

                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':

                    base = BASE_OCTAL;
                    break;

            }
        }
        return base;
    }

    /**
     * Part 1B
     *
     * Decode Character - BINARY, OCTAL or HEX
     */
    public static String decodeCharacter(String codedLetter) {

        // Determine Base
        base = determineBase(codedLetter);
        char startValue;
        int decimalValue;

        int sum = 0;
        for (int i = 0; i < codedLetter.length(); i++) {
            startValue = (char) codedLetter.charAt(codedLetter.length() - 1 - i);
        
        if ( (int) startValue >= 76 && (int) startValue <= 102 ) {
            decimalValue = (int) startValue - 87;
        }
        else  { 
                decimalValue = Integer.parseInt(Character.toString(startValue));
               
                }
        
        sum = sum + (int) Math.pow((double) base, (double) i ) * decimalValue;
        } 
        
        

        // TODO: 
        //  1.  convert BIN/HEX/OCT to Decimal (ASCII)
        //  2.  convert ASCII to String; 
        //      use - Character.toString ( (char) asciiCode );        
        return "?";
    }

    /**
     * Encode Message; TO BINARY!
     */
    public static String encodeLetter(char letter) {

        String encodedLetter = "" + (int) letter;

        // ENCODE LETTER;
        //   - letter is a CHAR (ASCII)
        //   - convert (cast) to int
        //   - convert int to the desired base
        System.out.println(letter + " --> " + encodedLetter);

        return encodedLetter;

    }
}
