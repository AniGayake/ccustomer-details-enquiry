package com.banking.app.customer.details.enquiry.repository;

import com.banking.app.customer.details.enquiry.bo.CustomerDemographicDetails;
import com.mysql.cj.log.Log;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDemographicRepo extends JpaRepository<CustomerDemographicDetails, Long> {
}
