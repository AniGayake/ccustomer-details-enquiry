package com.banking.app.customer.details.enquiry.bo;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "personal_info")
public class CustomerAccountsRelationship extends Customer{
    @OneToMany(mappedBy = "customerId",cascade = CascadeType.ALL)
    List<Account> accounts;
    public List<Account> getAccounts() {
        return accounts;
    }
    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    @Override
    public String toString() {
        return "CustomerAccountsRelationship{" +
                "accounts=" + accounts +
                '}';
    }
}

