package com.spring.project.UEMSpringMVC.Service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.spring.project.UEMSpringMVC.Entity.Employee;
import com.spring.project.UEMSpringMVC.Dao.EmployeeRepository;


@Service
public class EmployeeServices {

	
	@Autowired
	EmployeeRepository employeeRepository;
	
	public List<Employee> getAllEmployees()
	{
		return employeeRepository.findAll();
	}
	
	public Employee storeEmployee(Employee emp)
	{
		return employeeRepository.save(emp);
	}
	
	public Employee getEmployeeById(int id) {
	    return employeeRepository.findById(id).orElse(null);
	}

	public Employee updateEmployee(Employee emp) {
	    return employeeRepository.save(emp);
	}

	public void deleteEmployee(int id) {
	    employeeRepository.deleteById(id);
	}
}