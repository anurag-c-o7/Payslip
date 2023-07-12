package com.payslip.payslipgenerator.beans;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="payslip")
public class Payslip {
// - userid
//- date
//- basic_salary_amount
//- allownce
//- tax_amount
//- insurance
//- net salary

    @Id
    @GeneratedValue
    private Long payslipId;

    @ManyToOne
    @JoinColumn(name="user_id")
    private UserProfile user;

    private Double basicSalaryAmount;

    private Double taxAmount;

    private Double insurance;

    private Double netSalary;

    private Date paySlipDate;

    private Double allownce;

    public Payslip(Long payslipId, UserProfile user, Double basicSalaryAmount, Double taxAmount, Double insurance, Double netSalary) {
        this.payslipId = payslipId;
        this.user = user;
        this.basicSalaryAmount = basicSalaryAmount;
        this.taxAmount = taxAmount;
        this.insurance = insurance;
        this.netSalary = netSalary;
    }

    public Payslip() {
    }

    public Long getPayslipId() {
        return payslipId;
    }

    public void setPayslipId(Long payslipId) {
        this.payslipId = payslipId;
    }

    public UserProfile getUser() {
        return user;
    }

    public void setUser(UserProfile user) {
        this.user = user;
    }

    public Double getBasicSalaryAmount() {
        return basicSalaryAmount;
    }

    public void setBasicSalaryAmount(Double basicSalaryAmount) {
        this.basicSalaryAmount = basicSalaryAmount;
    }

    public Double getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(Double taxAmount) {
        this.taxAmount = taxAmount;
    }

    public Double getInsurance() {
        return insurance;
    }

    public void setInsurance(Double insurance) {
        this.insurance = insurance;
    }

    public Double getNetSalary() {
        return netSalary;
    }

    public void setNetSalary(Double netSalary) {
        this.netSalary = netSalary;
    }

    public Date getPaySlipDate() {
        return paySlipDate;
    }

    public void setPaySlipDate(Date paySlipDate) {
        this.paySlipDate = paySlipDate;
    }

    public Double getAllownce() {
        return allownce;
    }

    public void setAllownce(Double allownce) {
        this.allownce = allownce;
    }
}
