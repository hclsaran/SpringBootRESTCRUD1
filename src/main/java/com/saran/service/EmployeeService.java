package com.saran.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saran.model.Employee;
import com.saran.repo.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository repo;//HAS A
	
	public List<Employee> getAllEmps(){
		return repo.findAll();
	}
	public Optional<Employee> getEmpById(int id){
		return repo.findById(id);
	}
	
	public void deleteEmp(Integer id) {
		repo.deleteById(id);
	}
	
	public void addEmp(Employee emp) {
		repo.save(emp);
	}

}
