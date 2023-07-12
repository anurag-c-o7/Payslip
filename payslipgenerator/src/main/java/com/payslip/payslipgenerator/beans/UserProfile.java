package com.payslip.payslipgenerator.beans;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="user_profile")
public class UserProfile {
//- id
//- first name
//- last name
//- email
//- role
//- mobile number
//- password
//- created_at

    @Id
    @GeneratedValue
    private Long userId;

    private String firstName;

    private String lastName;

    private String email;

    private String userRole;

    private String mobileNumber;

    private String userPassword ;

    private Date createdAt;


    public UserProfile(Long useId, String firstName, String lastName, String email, String role, String mobileNumber, String password, Date createdAt) {
        this.userId = useId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.userRole = role;
        this.mobileNumber = mobileNumber;
        this.userPassword = password;
        this.createdAt = createdAt;
    }

    public UserProfile() {
    }

    public Long getUseId() {
        return userId;
    }

    public void setUseId(Long useId) {
        this.userId = useId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return userRole;
    }

    public void setRole(String role) {
        this.userRole = role;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getPassword() {
        return userPassword;
    }

    public void setPassword(String password) {
        this.userPassword = password;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
