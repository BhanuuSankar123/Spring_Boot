package com.innoventes.test.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.innoventes.test.app.entity.Company;


public interface CompanyRepository extends JpaRepository<Company, Long> {
@Query("SELECT * FROM company where company_code = :code")
	Company findByCode(@Param("code") String companyCode);
	
}