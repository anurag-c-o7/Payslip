package com.payslip.payslipgenerator.repository;

import com.payslip.payslipgenerator.beans.Payslip;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PayslipRepository extends JpaRepository<Payslip,Long> {
}
