package com.saran.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saran.model.Employee;


public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
