package com.spring.project.UEMSpringMVC.Dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.spring.project.UEMSpringMVC.Entity.*;


@Repository
public interface LoginRepository extends JpaRepository<UserEntity,Integer>{

    UserEntity findByEmailAndPassword(String email,String password);
    UserEntity findByEmail(String email);
}