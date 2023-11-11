/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practice.app.rest.Controller;

/**
 *
 * @author mo
 */
import com.practice.app.rest.Models.Admin;
import com.practice.app.rest.Models.Register;
import com.practice.app.rest.Models.User;
import com.practice.app.rest.Repo.AdminRepo;
import com.practice.app.rest.Repo.RegisterRepo;
import com.practice.app.rest.Repo.UserRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class apiController {
    
    @Autowired
    private UserRepo userRepo;
    
    @GetMapping(value ="/")
    
    public String getPage(){
      return "Hey Stranger..";  
    }
    
    @GetMapping(value="/users")
    public List<User> getUsers(){
        return userRepo.findAll();
    }
    
    @PostMapping(value="/save")
    public String saveUser(@RequestBody User user){
        userRepo.save(user);
        return "saved!";
    }
    
    @PutMapping(value ="/update/{id}")
    public String updateUser(@PathVariable long id,@RequestBody User user){
         User updatedUser=userRepo.findById(id).get();
         updatedUser.setStudentName(user.getStudentName());
         updatedUser.setStudentAddress(user.getStudentAddress());
         updatedUser.setStudentEmail(user.getStudentEmail());
         updatedUser.setStudentPassword(user.getStudentPassword());
         userRepo.save(updatedUser);
         return "student updated..";
    }
    
    @DeleteMapping(value="/delete/{id}")
    public String deleteUser(@PathVariable long id){
        User deleteUser = userRepo.findById(id).get();
        userRepo.delete(deleteUser);
        return "deleted student with id: "+id;
        
        
    }
    
    @Autowired
    private RegisterRepo registerRepo;
    
    @GetMapping(value="/register")
    public List<Register> getRegister(){
        return registerRepo.findAll();
    }
    
    @PostMapping(value="/register/save")
    public String saveRegister(@RequestBody Register register){
        registerRepo.save(register);
        return "saved!";
    }
    
    @PutMapping(value ="/register/update/{id}")
    public String updateRegister(@PathVariable long id,@RequestBody Register register){
         Register updatedRegister=registerRepo.findById(id).get();
         updatedRegister.setCourseName(register.getCourseName());
         updatedRegister.setStudentName(register.getStudentName());
         updatedRegister.setStudentAddress(register.getStudentAddress());
         updatedRegister.setStudentEmail(register.getStudentEmail());
         updatedRegister.setStudentPassword(register.getStudentPassword());
         registerRepo.save(updatedRegister);
         return "registration updated..";
    }
    
    @DeleteMapping(value="/register/delete/{id}")
    public String deleteRegister(@PathVariable long id){
        Register deleteRegister = registerRepo.findById(id).get();
        registerRepo.delete(deleteRegister);
        return "deleted registration with id: "+id;
        
        
    }
    @Autowired
    private AdminRepo adminRepo;
    
    
    @GetMapping(value="/admin")
    public List<Admin> getAdmin(){
        return adminRepo.findAll();
    }
    
    @PostMapping(value="/admin/save")
    public String saveAdmin(@RequestBody Admin admin){
        adminRepo.save(admin);
        return "saved!";
    }
    
    @PutMapping(value ="/admin/update/{id}")
    public String updateAdmin(@PathVariable long id,@RequestBody Admin admin){
         Admin updatedAdmin=adminRepo.findById(id).get();
        updatedAdmin.setAdminName(admin.getAdminName());
        updatedAdmin.setAdminContact(admin.getAdminContact());
        updatedAdmin.setAdminPassword(admin.getAdminPassword());
         adminRepo.save(updatedAdmin);
         return "admin updated..";
    }
    
    @DeleteMapping(value="/admin/delete/{id}")
    public String deleteAdmin(@PathVariable long id){
        Admin deleteAdmin = adminRepo.findById(id).get();
        adminRepo.delete(deleteAdmin);
        return "deleted admin with id: "+id;
        
        
    }
    
   
}

