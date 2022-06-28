package com.Namazon.AccountandInfo;



public class Customer extends Account {
    public Customer(String firstName, String lastName, String email, String passWord) {
        super("","","","");

    }
    @Override
    public String toString() {
        return  getFirstName() + " " + getLastName() + " " + getEmail() + " " + getPassword();
    }
}


