package com.payslip.payslipgenerator.utility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.mail.MessagingException;
import java.io.UnsupportedEncodingException;

@Component
public class Task {

    @Autowired
    SendMailController sendMailController;

    @Scheduled(fixedDelay = 5000)
    public void run() throws MessagingException, UnsupportedEncodingException {
        sendMailController.send();
    }
}
