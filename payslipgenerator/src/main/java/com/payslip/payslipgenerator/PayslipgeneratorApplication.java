package com.payslip.payslipgenerator;

import com.payslip.payslipgenerator.beans.UserProfile;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableAsync
@EnableScheduling
public class PayslipgeneratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(PayslipgeneratorApplication.class, args);
//		- id
//				- first name
//				- last name
//				- email
//				- role
//				- mobile number
//				- password
//				- created_at


	}

}
