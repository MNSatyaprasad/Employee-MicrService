package com.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.emp.entity.Employee;
import com.emp.service.IEmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeeController {
	
	@Autowired
	IEmployeeService employeeservice;
	
	@Autowired
	private RestTemplate ressttemplate;
	
	
	@GetMapping("/{eId}")
	public Employee getEmployee(@PathVariable("eId") Long eId) {
		
		Employee employee = this.employeeservice.getEmployee(eId);
		//http://localhost:9091/record/emp/113411
		List records  = this.ressttemplate.getForObject("http://localhost:9091/record/emp/" + eId, List.class);
		employee.setRecords(records);
		return employee;
	}

}
