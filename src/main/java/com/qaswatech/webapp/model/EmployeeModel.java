/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qaswatech.webapp.model;

/**
 *
 * @author Vipul Jambhulkar
 */
public class EmployeeModel {

    private int id;
    private String employeeId;
    private String name;
    private String dob;
    private String gender;
    private String address;
    private String city;
    private String state;
    private String login_id;
    private String password;
    private int isDeleted;
    private String createdAt;
    private String modifiedAt;

    public EmployeeModel() {
    }

    public EmployeeModel(int id, String employeeId, String name, String dob, String gender, String address, String city, String state, String login_id, String password, int isDeleted, String createdAt, String modifiedAt) {
        this.id = id;
        this.employeeId = employeeId;
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.address = address;
        this.city = city;
        this.state = state;
        this.login_id = login_id;
        this.password = password;
        this.isDeleted = isDeleted;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getLogin_id() {
        return login_id;
    }

    public void setLogin_id(String login_id) {
        this.login_id = login_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(int isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(String modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    @Override
    public String toString() {
        return "EmployeeModel{" + "id=" + id + ", employeeId=" + employeeId + ", name=" + name + ", dob=" + dob + ", gender=" + gender + ", address=" + address + ", city=" + city + ", state=" + state + ", login_id=" + login_id + ", password=" + password + ", isDeleted=" + isDeleted + ", createdAt=" + createdAt + ", modifiedAt=" + modifiedAt + '}';
    }
    
    

}

    
    