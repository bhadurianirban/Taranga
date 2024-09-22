/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package org.bhaduri.taranga.controller;

import jakarta.inject.Named;
import jakarta.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author bhaduri
 */
@Named(value = "loginController")
@SessionScoped
public class LoginController implements Serializable {
    
    /**
     * Creates a new instance of LoginController
     */
    private String userId;
    private String password;
    public LoginController() {
    }
    public void login() {
        System.out.println("Login user : "+userId+" password "+password);
    }
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
