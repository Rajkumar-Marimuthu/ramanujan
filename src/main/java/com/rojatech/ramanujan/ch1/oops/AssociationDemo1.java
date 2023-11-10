package com.rojatech.ramanujan.ch1.oops;
class Bank {
 
    // Attribures of bank
    private String name;
 
    // Constructor of this class
    Bank(String name)
    {
        // this keyword refers to current instance itself
        this.name = name;
    }
 
    // Method of Bank class
    public String getBankName()
    {
        // Returning name of bank
        return this.name;
    }
}

class Employee {
    // Attribures of employee
    private String name;
    // Employee name
    Employee(String name)
    {
        // This keyword refwrs to current insytance itself
        this.name = name;
    }
 
    // Method of Employee class
    public String getEmployeeName()
    {
        // returning the name of employee
        return this.name;
    }
}

public class AssociationDemo1 {

	public static void main(String[] args) {
        // Creating objects of bank and Employee class
        Bank bank = new Bank("ICICI");
        Employee emp = new Employee("Ridhi");
 
        // Print and display name and
        // corresponding bank of employee
        System.out.println(emp.getEmployeeName()
                           + " is employee of "
                           + bank.getBankName());

	}

}
