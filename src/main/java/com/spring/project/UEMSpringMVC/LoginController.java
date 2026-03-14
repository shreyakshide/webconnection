package com.spring.project.UEMSpringMVC;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    // LOGIN PAGE
    @GetMapping("/")
    public String loginPage() {
        return "login";
    }
    
    @GetMapping("/home")
    public String homePage() {
        return "home";
    }

    // LOGIN VALIDATION
    @PostMapping("/login")
    public String validate(String userid, String password) {

        System.out.println(userid);
        System.out.println(password);

        return "home";   // always go to home
    }
    
    

    // REGISTER PAGE
    @GetMapping("/register")
    public String registerPage() {
        return "register";
    }

    // REGISTER SUBMIT → GO LOGIN
    @PostMapping("/register")
    public String registerUser(String userid, String password) {

        System.out.println("Registered: " + userid);
        return "login";
    }

    // FORGET PAGE
    @GetMapping("/forgetpassword")
    public String forgetPage() {
        return "forget";
    }

    // FORGET SUBMIT → GO LOGIN
    @PostMapping("/forgetpassword")
    public String forgetSubmit(String userid) {

        System.out.println("Password reset requested for: " + userid);
        return "login";
    }
}