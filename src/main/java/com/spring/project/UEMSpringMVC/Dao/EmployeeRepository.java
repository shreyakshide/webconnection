package com.spring.project.UEMSpringMVC.Dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.project.UEMSpringMVC.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
