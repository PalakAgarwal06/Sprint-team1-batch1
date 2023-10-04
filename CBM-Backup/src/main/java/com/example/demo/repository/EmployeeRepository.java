package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entities.Employees;



public interface EmployeeRepository extends JpaRepository<Employees, Integer> {
	
	@Query("SELECT e FROM Employees e JOIN e.offices o WHERE o.city = :city")
	List<Employees> findByOfficeCity(@Param("city") String city);
	
	@Query("select e from Employees e join e.offices o where o.code = :code")
	List<Employees> findByOfficeCode(@Param("code") int code);
	
	@Query("UPDATE Employee e SET e.office = (SELECT o FROM Office o WHERE o.officeCode = :officeCode) WHERE e.employeeNo = :employeeNo")
	Employees assignOfficeToEmployee(@Param("officeCode") int officeCode, @Param("employeeNo") int employeeNumber);

}
