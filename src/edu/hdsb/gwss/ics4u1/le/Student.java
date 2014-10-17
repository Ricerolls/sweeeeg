/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics4u1.le;

/**
 *
 * @author 1leste
 */
public class Student {
    
    //constants
    public final int MANUFACTURE_FORD = 1;
 public final int MANUFACTURE_GM = 2;
   public final int MANUFACTURE_VN = 3;
  
   
    //Object Variable
    private String firstName;
    private String lastName;
    private String networkPassword;  
    private  int age;
    private int OEN;
    private double average;
    private double height;
    private int carManufacture;
    
    
    public Student() {
        
  System.out.println ("student object created");
        
        
    }
    
    public Student (String name) {
//        this();
//        System.out.println("Name: " + name);
    }

    public String getFirstName() {
        return firstName;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private String getNetworkPassword() {
        return networkPassword;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + this.OEN;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (this.OEN != other.OEN) {
            return false;
        }
        return true;
    }

    public void setNetworkPassword(String networkPassword) {
        
        this.networkPassword = networkPassword;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getOEN() {
        return OEN;
    }

    public void setOEN(int OEN) {
        this.OEN = OEN;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Student{" + "firstName=" + firstName + ", lastName=" + lastName + '}';
    }

}
