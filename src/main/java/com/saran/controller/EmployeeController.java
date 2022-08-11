package com.saran.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.saran.model.Employee;
import com.saran.service.EmployeeService;

@RestController//implementing your restful web services
public class EmployeeController {
	@Autowired
	private EmployeeService service;//HAS A
	 @GetMapping("/employees")
	  public List<Employee> listAllEmp(){
		  return service.getAllEmps();
	  }

	 
		/*
		 * @GetMapping("/employees/{id}") public ResponseEntity<Employee>
		 * getEmpId(@PathVariable Integer id){ Optional<Employee>
		 * emp=service.getEmpById(id); return new
		 * ResponseEntity<Employee>(HttpStatus.OK); }
		 */
	 
	 @GetMapping("/employees/{id}")
	  public Optional<Employee> getEmpId2(@PathVariable Integer id){
		  Optional<Employee> emp=service.getEmpById(id);
		  return service.getEmpById(id);
	  }
	 
	 @PostMapping("/employees")//insert the employee records into the table
	 public void addEmp(@RequestBody Employee emp) {
		 service.addEmp(emp);
	 }
	 
	 @DeleteMapping("/employees/{empId}")
	 public void deleteEmp(@PathVariable int empId) {
		 service.deleteEmp(empId);
	 }

}
