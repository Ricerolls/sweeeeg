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
public class bankClient {

    private String name;
    private String lastName;
    private int sinNumber;
    private ArrayList <account> account;
//    private account savingAmount;
//    private account chequingAccount;

    public bankClient() {
        this.account = new ArrayList<account>();
    }

    public bankClient(String name, String lastName, int sinNumber) {
        this.name = name;
        this.lastName = lastName;
        this.sinNumber = sinNumber;
    }

    @Override
    public String toString() {
        return "bankClient{" + "name=" + name + ", lastName=" + lastName + ", sinNumber=" + sinNumber + '}';
    }

   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSinNumber() {
        return sinNumber;
    }

    private account getAccount(int bankNumber, int branchNumber) {
        account account = null;
        boolean found = true;
        for(int i = 0; i < this.account.size(); i++) {
            account = this.account.get(i);
            if (account.getBankNumber() == bankNumber && account.getBranchNumber() == branchNumber)
                found = true;
            this.account.size();
        }
        if (found) return account;
        else return null;
    }

    public void addAccount(account account) {
        this.account.add(account);
    }

    public void setSinNumber(int sinNumber) {
        this.sinNumber = sinNumber;
    } @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final bankClient other = (bankClient) obj;
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        if ((this.lastName == null) ? (other.lastName != null) : !this.lastName.equals(other.lastName)) {
            return false;
        }
        if (this.sinNumber != other.sinNumber) {
            return false;
        }
        return true;
    }
}
