/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practice.app.rest.Models;

/**
 *
 * @author mo
 */
import jakarta.persistence.*;

@Entity
@Table(name="Registeration")
public class Register {
    @Id
    private long registrationId;
    @Column
    private String studentName;
    @Column
    private String studentAddress;
    @Column
    private String studentEmail;
    @Column
    private String studentPassword;
    @Column
    private String courseName;
    
    
    public long getRegistrationId(){
        return registrationId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public String getStudentPassword() {
        return studentPassword;
    }

    public void setStudentPassword(String studentPassword) {
        this.studentPassword = studentPassword;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setRegistrationId(long registrationId) {
        this.registrationId = registrationId;
    }
    
    
    
    
}
