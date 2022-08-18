package com.emp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.emp.entity.Employee;
@Service
public class EmployeeServiceImpl implements IEmployeeService {

	List<Employee> list = List.of(
		 new Employee(113411l, "Rahul Parker", "876123456"),
		 new Employee(113412l, "Peter Parker", "907623456"),
		 new Employee(113413l, "Tony", "90963456"),
		 new Employee(113414l, "Strak", "81223456"),
		 new Employee(113415l, "Raju", "889193456"),
		 new Employee(113416l, "Wilison", "676123456"),
		 new Employee(113417l, "Raju", "871563456"),
		 new Employee(113418l, "Srinu", "870923456"),
		 new Employee(113419l, "Vasu", "876109887")
			);
	
	 
	@Override
	public Employee getEmployee(Long id) {
		// TODO Auto-generated method stub
		return list.stream().filter(emp -> emp.geteId().equals(id)).findAny().orElse(null);
	}
	
	

}
