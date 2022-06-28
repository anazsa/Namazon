package com.Namazon;


import com.Namazon.AccountandInfo.Account;
import com.Namazon.AccountandInfo.Customer;
import com.Namazon.Product.Vendor;

import java.util.ArrayList;
import java.util.List;


public class Namazon extends Account {
    private List<Customer> customers;
    private List<Vendor> vendors;
    private List<Account> accounts;

    public Namazon() {
        super("","","","");
        this.customers = new ArrayList<>();
        this.vendors  = new ArrayList<>();
        this.accounts = new ArrayList<>();
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public List<Vendor> getVendors() {
        return vendors;
    }

    public void setVendors(List<Vendor> vendors) {
        this.vendors = vendors;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public Account signInTo(String email, String passWord) {
        Account userAccount = null;
        for(Account account: accounts) {
            if(account.getEmail().equals(email) && account.getPassword().equals(passWord)) {
                userAccount = account;
            } else {
                System.out.println("Credentials do not match");
            }
        }
        return userAccount;
    }

    public Vendor signUpAsVendor(String brandName, String firstName, String lastName, String email, String passWord) {
        Vendor vendorAccount = new Vendor(brandName, firstName, lastName, email, passWord);
        getVendors().add(vendorAccount);
        getAccounts().add(vendorAccount);
        return vendorAccount;
    }

    public Customer signUpAsCustomer(String firstName, String lastName, String email, String passWord) {
        Customer customerAccount = new Customer(firstName, lastName, email, passWord);
        getCustomers().add(customerAccount);
        getAccounts().add(customerAccount);
        return customerAccount;
    }

    public Vendor selectVendor(String vendorName) {
        Vendor selectedVendor = null;
        for(Vendor vendor: getVendors()) {
            if(vendor.getBrandName().equals(vendorName)) {
                selectedVendor = vendor;
            }
        }
        return selectedVendor;
    }

    @Override
    public String toString() {
        return "customers= " + customers +
                ", vendors= " + vendors +
                ", accounts= " + accounts;
    }

}
