package com.payslip.payslipgenerator.beans;

import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="email")
public class Email {
// - to_email
//- creation_date
//- message
//- user_id
//- payslip_id nullable

    @Id
    @GeneratedValue
    private Long emailId;

    private String toEmail;

    private Date creationDate;

    private String message;

    @ManyToOne
    private UserProfile user;

    @ManyToOne
    @Nullable
    @JoinColumn(name="payslip_id")
    private Payslip payslip;

    public Email(Long emailId, String toEmail, Date creationDate, String message, UserProfile user, Payslip payslip) {
        this.emailId = emailId;
        this.toEmail = toEmail;
        this.creationDate = creationDate;
        this.message = message;
        this.user = user;
        this.payslip = payslip;
    }

    public Email() {
    }

    public Long getEmailId() {
        return emailId;
    }

    public void setEmailId(Long emailId) {
        this.emailId = emailId;
    }

    public String getToEmail() {
        return toEmail;
    }

    public void setToEmail(String toEmail) {
        this.toEmail = toEmail;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserProfile getUser() {
        return user;
    }

    public void setUser(UserProfile user) {
        this.user = user;
    }

    public Payslip getPayslip() {
        return payslip;
    }

    public void setPayslip(Payslip payslip) {
        this.payslip = payslip;
    }
}
