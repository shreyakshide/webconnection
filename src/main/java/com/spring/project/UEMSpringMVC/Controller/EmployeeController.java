package com.spring.project.UEMSpringMVC.Controller;

import com.spring.project.UEMSpringMVC.Service.*;
import com.spring.project.UEMSpringMVC.Entity.*;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import jakarta.servlet.http.HttpServletRequest;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeServices empService;

    @GetMapping("/home")
    public String getAllEmployes(HttpServletRequest request)
    {
        List<Employee> listOfEmployees = empService.getAllEmployees();
        request.setAttribute("emplist", listOfEmployees);
        return "home";
    }

    @GetMapping("/addemp")
    public String createEmp()
    {
        return "register-emp";
    }

    @PostMapping("/createemp")
    public String registerEmp(HttpServletRequest request)
    {
        String empid = request.getParameter("empid");
        String empname = request.getParameter("empname");
        String empemail = request.getParameter("empemail");
        String empcontactno = request.getParameter("empcontactno");
        String empcity = request.getParameter("empcity");

        Employee employee = new Employee();
        employee.setEmp_id(empid);
        employee.setEmp_name(empname);
        employee.setEmp_email(empemail);
        employee.setEmp_contact_no(empcontactno);
        employee.setEmp_city(empcity);

        empService.storeEmployee(employee);   // ⭐ VERY IMPORTANT

        return "redirect:/home";   // ⭐ POST → REDIRECT → GET
    }
    @GetMapping("/viewemp")
    public String viewEmployee(int empid, HttpServletRequest request) {
        Employee emp = empService.getEmployeeById(empid);
        request.setAttribute("emp", emp);
        return "view-emp";
    }

    @GetMapping("/editemp")
    public String editEmployee(int empid, HttpServletRequest request) {
        Employee emp = empService.getEmployeeById(empid);
        request.setAttribute("emp", emp);
        return "edit-emp";
    }

    @PostMapping("/updateemp")
    public String updateEmployee(HttpServletRequest request) {

        int id = Integer.parseInt(request.getParameter("id"));
        String empid = request.getParameter("empid");
        String empname = request.getParameter("empname");
        String empemail = request.getParameter("empemail");
        String empcontactno = request.getParameter("empcontactno");
        String empcity = request.getParameter("empcity");

        Employee emp = new Employee();
        emp.setId(id);
        emp.setEmp_id(empid);
        emp.setEmp_name(empname);
        emp.setEmp_email(empemail);
        emp.setEmp_contact_no(empcontactno);
        emp.setEmp_city(empcity);

        empService.updateEmployee(emp);

        return "redirect:/home";
    }

    @GetMapping("/deleteemp")
    public String deleteEmployee(int empid) {
        empService.deleteEmployee(empid);
        return "redirect:/home";
    }
}