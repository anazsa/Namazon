package com.Namazon;

import com.Namazon.AccountandInfo.Address;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AddressTest {
    @Test
    @DisplayName("Address Test")

    public void addressConstructorTest(){
        Address address = new Address("177-77","N/A","Jamaica","NY");
        String expected = "177-77 N/A Jamaica NY";
        String actual = String.valueOf(address);
        Assertions.assertEquals(expected,actual);
    }
    public void getStreetTest(){
        Address address = new Address("177-77","N/A","Jamaica","NY");




    }
}
