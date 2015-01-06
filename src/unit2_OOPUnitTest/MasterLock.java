/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit2_OOPUnitTest;

/**
 *
 * @author 1leste
 */
public class MasterLock extends AndroidLock {

    // CLASS CONSTANTS
    public static final String LOCK_MANUFACTURER = "MASTER";
    public static final int MIN_COMBO_VALUE = 0;
    public static final int MAX_COMBO_VALUE = 39;
    public static final int NUMBER_OF_DIGITS = 3;

    // CLASS VARIABLES
    private static int numberOfLocksCreated;
    /*
     *      - 3 digit combo (0-39)
     *      - you can't reset code
     *      - default combo values are random
     *      - serial number is DISTINCT for all instances
     */

    public MasterLock() {
        this(
                (int) (Math.random() * 40),
                (int) (Math.random() * 40),
                (int) (Math.random() * 40)
        );
    }

    /*
     *      - 3 digit combo (0-39)
     *      - if the code is not set, combo values are -1
     *      - serial number is DISTINCT for all instances
     */
    public MasterLock(int digit01, int digit02, int digit03) {
        super();
        System.out.println("CREATED: " + LOCK_MANUFACTURER + " Lock");
        this.open = true;
        this.configurableCombo = false;
        this.serialNumber = -1; // TODO
        this.invalidAttempts = 0;
        this.digit01Revealed = false;
        this.digit02Revealed = false;
        this.digit03Revealed = false;
        this.setCombo(digit01, digit02, digit03);
        System.out.println("\tYour Combo: " + this.getCombo() + " | SN: " + this.serialNumber);
    }

    @Override
    public int getSerialNumber() {
        return this.serialNumber;
    }

    /*
     * Setting Combo:
     *      - must be valid values (0-39)
     *      - can only set the combo when the lock is OPEN
     *      - can only be set if the lock is configurable
     */
    @Override
    public void setCombo(int digit01, int digit02, int digit03) {

        if (this.open) {
            if (digit01 >= 0 && digit01 <= 39 && digit02 >= 0 && digit02 <= 39 && digit03 >= 0 && digit03 <= 39) {
                this.digit01 = digit01;
                this.digit02 = digit02;
                this.digit03 = digit03;
                this.serialNumber = (int) (Math.random() * 100);
                System.out.println("Valid Combination");
                System.out.println("\tYour Combo: " + this.getCombo() + " | SN: " + this.serialNumber);
            } else {
                System.out.println("Invalid combination");
            }
        } else {
            System.out.println("Lock is closed");
            this.serialNumber = -1;
        }
    }

    /*
     * Digit 01; only revealed ONCE.
     *      -1 returned if revealed.
     */
    @Override
    public int getDigit01() {
        int digit = -1;
        if (this.digit01Revealed) {
            System.out.println("ERROR: Digit 01 Revealed to the client. ");
        } else {
            this.digit01Revealed = true;
            digit = this.digit01;
        }
        return digit;
    }

    /*
     * Digit 02; only revealed ONCE.
     *      -1 returned if revealed.
     */
    @Override
    public int getDigit02() {
        int digit = -1;
        if (this.digit02Revealed) {
            System.out.println("ERROR: Digit 02 Revealed to the client. ");
        } else {
            this.digit02Revealed = true;
            digit = this.digit02;
        }
        return digit;
    }

    /*
     * Digit 03; only revealed ONCE.
     *      -1 returned if revealed.
     */
    @Override
    public int getDigit03() {
        int digit = -1;
        if (this.digit03Revealed) {
            System.out.println("ERROR: Digit 03 Revealed to the client. ");
        } else {
            this.digit03Revealed = true;
            digit = this.digit03;
        }
        return digit;
    }

    /*
     * Getting Combo:
     *      - nobody should see the combo; except when the lock is created.
     */
    private String getCombo() {
        return this.digit01 + "-" + this.digit02 + "-" + this.digit03;
    }

    @Override
    public boolean isOpen() {
        return open;
    }

    /*
     * Lock
     */
    @Override
    public boolean lock() {
        if (this.open = true) {
//            lock = false;
//        } else {
//            lock = true; 
//        }
        }
        return true;
    }

    /*
     * Unlock; 
     *      - unlock with correct combination
     *      - AFTER three invalid unlocking attempts; lock will not open
     */
    @Override
    public boolean unlock(int digit01, int digit02, int digit03) {
        if (digit01 == digit01 && digit02 == digit02 && digit03 == digit03) {
            this.open = true;
        } else if (digit01 != digit01 || digit02 != digit02 || digit03 != digit03) {
            this.invalidAttempts++;
            if (this.invalidAttempts >= 3) {
                this.open = false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "MasterLock{" + "serialNumber=" + serialNumber + '}';
    }

    /**
     * The method returns the number of locks created.
     *
     * @return the number of locks created.
     */
    public static int getNumberOfLocksCreated() {
        return numberOfLocksCreated;
    }

}

