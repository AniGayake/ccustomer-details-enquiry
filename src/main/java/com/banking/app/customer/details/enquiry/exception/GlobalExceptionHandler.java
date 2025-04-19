package com.banking.app.customer.details.enquiry.exception;

import com.banking.app.customer.details.enquiry.exception.custom.CustomerNotFoundException;
import com.banking.app.customer.details.enquiry.exception.entity.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(CustomerNotFoundException.class)
    public ResponseEntity<ErrorMessage> handleCustomerNotFoundException(final CustomerNotFoundException customerNotFoundException){
        ErrorMessage errorMessage = new ErrorMessage("Not Found", HttpStatus.NOT_FOUND.value(), customerNotFoundException.getMessage());
        return new ResponseEntity<>(errorMessage,HttpStatus.NOT_FOUND);
    }
}
