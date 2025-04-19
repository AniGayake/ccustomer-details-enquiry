package com.banking.app.customer.details.enquiry.exception.custom;

public class CustomerNotFoundException extends RuntimeException{
    public CustomerNotFoundException(String message){
        super(message);
    }
}
