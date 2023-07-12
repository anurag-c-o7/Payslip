package com.payslip.payslipgenerator.controller;

import com.payslip.payslipgenerator.beans.PayslipDTO;
import com.payslip.payslipgenerator.services.PaySlipServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaySlipController {

    @Autowired
    PaySlipServices paySlipServices;

    @PostMapping("/generate-payslip")
    public void generatePayslip(@RequestBody PayslipDTO payslipDTO) {
        paySlipServices.generatePaySlip(payslipDTO);
    }


}
