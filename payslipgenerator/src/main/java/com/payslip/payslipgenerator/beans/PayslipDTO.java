package com.payslip.payslipgenerator.beans;

import java.util.Date;

public class PayslipDTO {

    //Long userId, Date date, Double basicSalary, Double allowance
    private Long userId;

    private Date date;

    private Double basicSalary;

    private Double allowance;

    private Boolean byNetSalary;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(Double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public Double getAllowance() {
        return allowance;
    }

    public void setAllowance(Double allowance) {
        this.allowance = allowance;
    }

    public Boolean getByNetSalary() {
        return byNetSalary;
    }

    public void setByNetSalary(Boolean byNetSalary) {
        this.byNetSalary = byNetSalary;
    }
}
