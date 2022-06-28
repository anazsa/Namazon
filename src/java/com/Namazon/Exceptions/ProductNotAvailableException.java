package com.Namazon.Exceptions;

public class ProductNotAvailableException extends Exception {
    public ProductNotAvailableException(String errorMessage){
        super(errorMessage);
    }
}
