package com.banking.app.customer.details.enquiry.bo;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "personal_info")
public class CustomerDemographicDetails extends Customer {

    @OneToMany(mappedBy = "customerId",cascade = CascadeType.ALL)
    private List<ContactInformation> contactInformation;
    @OneToMany(mappedBy = "customerId",cascade = CascadeType.ALL)
    private List<Address> addresses;

    public List<ContactInformation> getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(List<ContactInformation> contactInformation) {
        this.contactInformation = contactInformation;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    @Override
    public String toString() {
        return "CustomerDemographicDetails{" +
                "contactInformation=" + contactInformation +
                ", addresses=" + addresses +
                '}';
    }
}
