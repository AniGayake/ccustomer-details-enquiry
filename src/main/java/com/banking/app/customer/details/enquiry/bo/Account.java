package com.banking.app.customer.details.enquiry.bo;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
@Entity
@Table(name = "account")
public class Account {
    @Id
    private String accountNumber;
    private BigDecimal balance;
    @Column(name = "customer_id")
    private Long customerId;
    @Column(name = "interest_rate")
    private Double interestRate;
    @Column(name = "minimum_balance")
    private BigDecimal minimumBalance;
    @Column(name = "withdrawal_limit")
    private Integer withdrawalLimit;
    private String accountTypeCode;
    private String branchCode;
    private String ifscCode;
    private String currency;
    private String statusCode;
    private LocalDateTime createdAt;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public BigDecimal getMinimumBalance() {
        return minimumBalance;
    }

    public void setMinimumBalance(BigDecimal minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

    public Integer getWithdrawalLimit() {
        return withdrawalLimit;
    }

    public void setWithdrawalLimit(Integer withdrawalLimit) {
        this.withdrawalLimit = withdrawalLimit;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getAccountTypeCode() {
        return accountTypeCode;
    }

    public void setAccountTypeCode(String accountTypeCode) {
        this.accountTypeCode = accountTypeCode;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", customerId=" + customerId +
                ", interestRate=" + interestRate +
                ", minimumBalance=" + minimumBalance +
                ", withdrawalLimit=" + withdrawalLimit +
                ", accountTypeCode='" + accountTypeCode + '\'' +
                ", branchCode='" + branchCode + '\'' +
                ", ifscCode='" + ifscCode + '\'' +
                ", currency='" + currency + '\'' +
                ", statusCode='" + statusCode + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}
