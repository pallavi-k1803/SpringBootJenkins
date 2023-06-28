package com.jenkins.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.jenkins.model.Employee;

@Service
public class EmployeeService {

	

    public List<Employee> getListOfAllEmployees() {  	
    	
        return getEmployeeList();
    }

    public Employee getEmployeeById(Long id) {
        Employee employee = new Employee("Emp1",30, 5000.00, List.of("Project1","Project2","Project3"));
        return employee;
    }
    
    public static List<Employee> getEmployeeList(){
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("Emp1",30, 5000.00, List.of("Project1","Project2","Project3")));
		empList.add(new Employee("Emp2",23, 3000.00, List.of("Project2","Project4","Project3")));
		empList.add(new Employee("Emp3",20, 3000.00, List.of("Project3","Project4","Project5")));
		empList.add(new Employee("Emp4",33, 15000.00, List.of("Project2","Project3")));
		empList.add(new Employee("Emp5",53, 55000.00, List.of("Project1")));
		empList.add(new Employee("Emp6",46, 45000.00, List.of("Project1","Project3")));
		empList.add(new Employee("Emp7",27, 4000.00, List.of("Project1","Project2")));
		return empList;
	}
    
}
