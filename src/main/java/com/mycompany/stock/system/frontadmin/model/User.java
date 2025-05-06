/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stock.system.frontadmin.model;

/**
 *
 * @author javie
 */
public class User {
    private Long id;
    private String name;
    private String email;
    private String password;
    private Long role_id;

    public User(String name, String email, String password, Long role_id) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.role_id = role_id;
    }
    
    public User(String name, String email, Long role_id) {
        this.name = name;
        this.email = email;
        this.role_id = role_id;
    }

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getRole_id() {
        return role_id;
    }

    public void setRole_id(Long role_id) {
        this.role_id = role_id;
    }
    
    
    
}
