package com.spring.project.UEMSpringMVC.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.annotation.Generated;



import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="empid")
	private String empid;
	
	@Column(name="empname")
	private String empname;
	
	@Column(name="empemail")
	private String empemail;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmp_contact_no() {
		return empcontactno;
	}

	public void setEmp_contact_no(String empcontactno) {
		this.empcontactno = empcontactno;
	}

	@Column(name="empcity")
	private String empcity;
	
	@Column(name="empcontactno")
	private String empcontactno;
	
	public String getEmp_id() {
		return empid;
	}

	public void setEmp_id(String empid) {
		this.empid = empid;
	}

	public String getEmp_name() {
		return empname;
	}

	public void setEmp_name(String empname) {
		this.empname = empname;
	}

	public String getEmp_email() {
		return empemail;
	}

	public void setEmp_email(String empemail) {
		this.empemail = empemail;
	}

	public String getEmp_city() {
		return empcity;
	}

	public void setEmp_city(String empcity) {
		this.empcity = empcity;
	}

	

}