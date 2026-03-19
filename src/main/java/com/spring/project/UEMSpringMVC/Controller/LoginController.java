package com.spring.project.UEMSpringMVC.Controller;

import com.spring.project.UEMSpringMVC.Service.*;
import com.spring.project.UEMSpringMVC.Entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import jakarta.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

    @Autowired
    LoginService loginservice;

    @GetMapping("/")
    public String loginPage() {
        return "login";
    }

//    @GetMapping("/home")
//    public String homePage() {
//        return "home";
//    }

    @PostMapping("/login")
    public String validate(String email, String password, HttpServletRequest request) {

        UserEntity user = loginservice.validateUser(email, password);

        if(user != null) {
            return "redirect:/home";
        } else {
            request.setAttribute("msg", "Login Unsuccessful");
            return "login";
        }
    }

    @GetMapping("/register")
    public String registerPage() {
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(HttpServletRequest request) {

        String name=request.getParameter("name");
        String email=request.getParameter("email");
        String password=request.getParameter("password");

        UserEntity user=new UserEntity();
        user.setName(name);
        user.setPassword(password);
        user.setEmail(email);

        loginservice.registerUser(user);

        return "login";
    }

    @GetMapping("/forgetpassword")
    public String forgetPage() {
        return "forget";
    }

    @PostMapping("/forgetpassword")
    public String checkEmail(String email, HttpServletRequest request) {

        UserEntity user = loginservice.getUserByEmail(email);

        if(user != null) {
            request.getSession().setAttribute("resetEmail", email);
            return "resetpassword";
        } else {
            request.setAttribute("msg", "Email Not Found");
            return "forget";
        }
    }

    @PostMapping("/resetpassword")
    public String resetPassword(String password, HttpServletRequest request) {

        String email = (String) request.getSession().getAttribute("resetEmail");

        if(email == null) {
            request.setAttribute("msg", "Session Expired");
            return "login";
        }

        loginservice.updatePassword(email,password);

        request.getSession().invalidate();

        request.setAttribute("msg", "Password Updated Successfully");

        return "login";
    }
}
