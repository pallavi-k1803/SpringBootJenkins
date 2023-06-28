package com.jenkins.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jenkins.model.Employee;
import com.jenkins.service.EmployeeService;

@RestController
//@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1/employees")
public class EmployeeController {

	@Autowired
    private EmployeeService employeeService;
	
	@GetMapping("/all")
	public List<Employee> getListOfAllEmployees() {
		return employeeService.getListOfAllEmployees();
	}

	@GetMapping("/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable(value = "id") Long id){
		Employee employee = employeeService.getEmployeeById(id);
		return ResponseEntity.ok().body(employee);
	}

}
