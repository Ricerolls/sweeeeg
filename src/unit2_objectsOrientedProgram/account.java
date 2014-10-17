/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit2_objectsOrientedProgram;

import java.util.Scanner;

/**
 *
 * @author 1leste
 */
public class account {
    
    public static final int ACCOUNT_TYPE_UNKNOWN = 0;
    public static final int ACCOUNT_TYPE_SAVING = 1;
    public static final int ACCOUNT_TYPE_CHEQUING = 2;
    
    public static final String[] ACCOUNT_TYPE_NAME = {
      "Unknown", "Savings", "Chequing"  
    }; 
    
    private bankClient accountOwner;
    private String account;
    private double balance;
    private int branchNumber;
    private int accountType;
    private int bankNumber;
    private int bankPin;
    private boolean active;

    public account() {
    }

    public account(String account, double balance, int branchNumber, int bankNumber, int bankPin, boolean active) {
        this.account = account;
        this.balance = balance;
        this.branchNumber = branchNumber;
        this.bankNumber = bankNumber;
        this.bankPin = bankPin;
        this.active = active;
        
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }
    
  public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = true;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getBranchNumber() {
        return branchNumber;
    }

    public void setBranchNumber(int branchNumber) {
        this.branchNumber = branchNumber;
    }

    public int getBankNumber() {
        return bankNumber;
    }

    public void setBankNumber(int bankNumber) {
        this.bankNumber = bankNumber;
    }

    public void setBankPin(int bankPin) {
        this.bankPin = bankPin;
       
    }
    
    public bankClient getAccountOwner() {
        return accountOwner;
    }

    public void setAccountOwner(bankClient accountOwner) {
        this.accountOwner = accountOwner;
    }

    public int getAccountType() {
        return accountType;
    }

    public void setAccountType(int accountType) {
        this.accountType = accountType;
    }
    
    public double deposit(double accountDeposit) {
    if (this.active)
        this.balance = this.balance + accountDeposit;
    
    return accountDeposit;
}
    public double withdraw(double accountWithdraw) {
    if (this.active && this.balance > accountWithdraw)
        this.balance = this.balance - accountWithdraw;
    
    return accountWithdraw;
}
    
    private boolean checkPin(int pin){
        if (this.bankPin == pin)
           return true;
        else
            return false;
        
    }
            
         
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final account other = (account) obj;
        if ((this.account == null) ? (other.account != null) : !this.account.equals(other.account)) {
            return false;
        }
        if (Double.doubleToLongBits(this.balance) != Double.doubleToLongBits(other.balance)) {
            return false;
        }
        if (this.branchNumber != other.branchNumber) {
            return false;
        }
        if (this.bankNumber != other.bankNumber) {
            return false;
        }
        if (this.bankPin != other.bankPin) {
            return false;
        }
        if (this.active != other.active) {
            return false;
        }
        return true;
    }
}