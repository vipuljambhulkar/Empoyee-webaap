/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qaswatech.webapp.enums;

/**
 *
 * @author Vipul Jambhulkar
 */
public enum Messages {
    DELETED("Employee Deleted Successfully"),
    INSERTED("Employee Registered Successfully"),
    NOT_EMPTY(" Should Not be Empty"),
    LOGINDONE("Login Successfully");
    
    private String message;

    private Messages(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    
    
}
