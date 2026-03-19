package com.spring.project.UEMSpringMVC.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.spring.project.UEMSpringMVC.Dao.*;
import com.spring.project.UEMSpringMVC.Entity.*;

import java.util.List;
import java.util.Optional;


@Service
public class LoginService {

    @Autowired
    LoginRepository loginRepository;

    public UserEntity registerUser(UserEntity userEntity)
    {
        return loginRepository.save(userEntity);
    }

    public UserEntity validateUser(String email,String password)
    {
        return loginRepository.findByEmailAndPassword(email,password);
    }

    public UserEntity getUserByEmail(String email)
    {
        return loginRepository.findByEmail(email);
    }

    public void updatePassword(String email,String password)
    {
        UserEntity user = loginRepository.findByEmail(email);

        if(user != null)
        {
            user.setPassword(password);
            loginRepository.save(user);
        }
    }
}
