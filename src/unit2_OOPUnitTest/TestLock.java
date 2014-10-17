/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit2_OOPUnitTest;

import java.util.Scanner;

/**
 *
 * @author 1leste
 */
public class TestLock {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         DubdlyLock lock = new DubdlyLock();
        
        int digit01 = input.nextInt();
        int digit02 = input.nextInt();
        int digit03 = input.nextInt();

        if (digit01 == lock.getDigit01() && digit02 == lock.getDigit02() && digit03 == lock.getDigit03()) {
            System.out.println("Lock is open");
            lock.isOpen();
        } else {
            System.out.println("Invalid digits");
            lock.numOfInvalidAttempts();
            
        }
    }
}
