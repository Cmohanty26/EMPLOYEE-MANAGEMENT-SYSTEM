package com.employee.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.entity.Employee;
import com.employee.repository.EmployeeRepository;

@Service
public class EmployeeServices {
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Employee updateEmployee(Long id,Employee employee) {
		Optional<Employee> optionalEmployee=employeeRepository.findById(id);
		if(optionalEmployee.isPresent()) {
			Employee existingEmployee=optionalEmployee.get();
			existingEmployee.setName(employee.getName());
			existingEmployee.setEmail(employee.getEmail());
			existingEmployee.setPhone(employee.getPhone());
			existingEmployee.setDepartment(employee.getDepartment());
			return employeeRepository.save(existingEmployee);
		}
		return null;
	}

}
