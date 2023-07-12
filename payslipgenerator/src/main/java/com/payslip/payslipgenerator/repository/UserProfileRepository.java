package com.payslip.payslipgenerator.repository;

import com.payslip.payslipgenerator.beans.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserProfileRepository extends JpaRepository<UserProfile,Long> {

}
