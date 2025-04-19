package com.banking.app.customer.details.enquiry.service;

import com.banking.app.customer.details.enquiry.bo.CustomerAccountsRelationship;
import com.banking.app.customer.details.enquiry.bo.CustomerDemographicDetails;
import com.banking.app.customer.details.enquiry.exception.custom.CustomerNotFoundException;
import com.banking.app.customer.details.enquiry.repository.CustomerDemographicRepo;
import com.banking.app.customer.details.enquiry.repository.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class CustomerService {
    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerService.class);
    private CustomerRepository customerRepository;
    private CustomerDemographicRepo customerDemographicRepo;

    @Autowired
    public CustomerService(final CustomerRepository customerRepository,final CustomerDemographicRepo customerDemographicRepo) {
        this.customerRepository = customerRepository;
        this.customerDemographicRepo = customerDemographicRepo;
    }

    public CustomerAccountsRelationship getCustomerByCustomerId(final Long customerId){
        Optional<CustomerAccountsRelationship> customer= customerRepository.findById(customerId);
        return customer.orElseThrow(()->
        {   LOGGER.error("Customer with CustomerId "+ customerId+ " not found");
            throw new CustomerNotFoundException("Customer with CustomerId "+ customerId+ " not found");
        });
    }

    public CustomerDemographicDetails getCustomerDemographicDetails(final Long customerId){
        Optional<CustomerDemographicDetails> customerDemographicDetails = customerDemographicRepo.findById(customerId);
        return customerDemographicDetails.orElseThrow(()->{
            LOGGER.error("Customer with CustomerId "+ customerId+ " not found");
            throw new CustomerNotFoundException("Customer with CustomerId "+ customerId+ " not found");
        });
    }
}
