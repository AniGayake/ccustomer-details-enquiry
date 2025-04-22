package com.banking.app.customer.details.enquiry.web;

import com.banking.app.customer.details.enquiry.bo.Customer;
import com.banking.app.customer.details.enquiry.bo.CustomerAccountsRelationship;
import com.banking.app.customer.details.enquiry.bo.CustomerDemographicDetails;
import com.banking.app.customer.details.enquiry.service.CustomerService;
import com.banking.app.customer.details.enquiry.util.DopplerSecretsProcessor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/customer")
public class CustomerController {
    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerController.class);
    private CustomerService customerService;
    @Autowired

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/{customerId}")
    public ResponseEntity<Customer> getCustomerByCustomerId(final @PathVariable Long customerId){
        LOGGER.info("Entering getCustomerByCustomerId to get customer details for {}",customerId);
        Customer customerAccountsRelationship =  customerService.getCustomerByCustomerId(customerId);
        LOGGER.info("Exiting getCustomerByCustomerId with response {}", customerAccountsRelationship);
        return ResponseEntity.status(HttpStatus.OK).body(customerAccountsRelationship);
    }

    @GetMapping("/{customerId}/demographic-details")
    public ResponseEntity<CustomerDemographicDetails> getCustomerDemographicDetails(final @PathVariable Long customerId){
        CustomerDemographicDetails demographicDetails = customerService.getCustomerDemographicDetails(customerId);
        return ResponseEntity.status(HttpStatus.OK).body(demographicDetails);
    }
}
