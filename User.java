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
@Table(name="UserAccount")
public class User {
    @Id
    private int studentId;
    private String studentName;
    @Column
    private String studentAddress;
    @Column
    private String studentEmail;
    @Column
    private String studentPassword;
    
    private String hiddenStudentPassword;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
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
        return hiddenStudentPassword;
    }
    
    public void setStudentPassword(String studentPassword) {
        hiddenStudentPassword="*****";
    }
    
    
}
