package com.payslip.payslipgenerator.services;

import com.payslip.payslipgenerator.beans.Payslip;
import com.payslip.payslipgenerator.beans.PayslipDTO;
import com.payslip.payslipgenerator.beans.UserProfile;
import com.payslip.payslipgenerator.repository.PayslipRepository;
import com.payslip.payslipgenerator.repository.UserProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class PaySlipServices {

    @Autowired
    UserProfileRepository userProfileRepository;

    @Autowired
    PayslipRepository payslipRepository;


    public void generatePaySlip(PayslipDTO payslipDTO) {

        UserProfile user = userProfileRepository.getById(payslipDTO.getUserId());
        Payslip payslip = new Payslip();
        if(user == null) {
            throw new RuntimeException("User Not Found");
        }

        if(payslipDTO.getByNetSalary() == true) {

        }
        else {
            Double insurance = (0.2) * payslipDTO.getBasicSalary();
            Double tax = (payslipDTO.getBasicSalary()+payslipDTO.getAllowance()) *(0.2);
            Double netSalary = payslipDTO.getBasicSalary() - tax - insurance;

            payslip.setInsurance(insurance);
            payslip.setNetSalary(netSalary);
            payslip.setTaxAmount(tax);
            payslip.setBasicSalaryAmount(payslipDTO.getBasicSalary());
            payslip.setUser(user);
            payslip.setPaySlipDate(payslipDTO.getDate());
            payslip.setAllownce(payslipDTO.getAllowance());
        }
        payslipRepository.save(payslip);
    }

}
