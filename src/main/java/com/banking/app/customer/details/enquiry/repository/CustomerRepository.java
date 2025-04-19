package com.banking.app.customer.details.enquiry.repository;

import com.banking.app.customer.details.enquiry.bo.Customer;
import com.banking.app.customer.details.enquiry.bo.CustomerAccountsRelationship;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerAccountsRelationship,Long> {
}
