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
@Table(name="Admin")
public class Admin {
      @Id
    private long adminId;
    @Column
    private String adminName;
    @Column
    private String adminPassword;
    @Column
    private String adminContact;
    private String hiddenAdminPassword;

    public long getAdminId() {
        return adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminPassword() {
        return hiddenAdminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        hiddenAdminPassword="*****";
       
    }

    public String getAdminContact() {
        return adminContact;
    }

    public void setAdminContact(String adminContact) {
        this.adminContact = adminContact;
    }

    public void setAdminId(long adminId) {
        this.adminId = adminId;
    }
    
    
    

    
}
