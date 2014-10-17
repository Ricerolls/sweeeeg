/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit2_objectsOrientedProgram;

import java.util.ArrayList;

/**
 *
 * @author 1leste
 */
public class accountClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//       ArrayList account = new ArrayList();
       
       account account = new account();
       account account2 = new account();
//       account account3 = new account();
       
//       account.add(account1);
//       account.add(account2);
//       account.add(account3);
//       
       account.setBankNumber(123);
       account.setBranchNumber(123);
       account.setAccountType(account.ACCOUNT_TYPE_CHEQUING);
       
       account2.setBankNumber(123);
       account2.setBranchNumber(123);
       account2.setAccountType(account.ACCOUNT_TYPE_CHEQUING);
       
       bankClient stev = new bankClient ( "Steven", "Le", 123);
       account.setaccountOwner(stev);
       account2.setaccountOwner(stev);
       
       stev.addAccount(account);
       stev.addAccount(account2);
    }
    
}
