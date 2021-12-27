/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qaswatech.webapp.entity;

/**
 *
 * @author Vipul jambhulkar
 */
public class EmployeeEntity 
{
    
    private String id;
    private String studentId;
    private String fname;
    private String lname;
    private long phone_number;
    private String email;
    private int age;
    private String password;
    private long aadhar_no;
    private String address;
    private int pincode;
    private String branch;
    private int semester;
    private String section;
    private int roll_no;
    private long enroll_no;
    private double fees;
    private String dob;
    private String gender;
    private String isDeleted;
    private String createdAt;
    private String modifiedAt;

    public EmployeeEntity(String id, String studentId, String fname, String lname, long phone_number, String email, int age, String password, long aadhar_no, String address, int pincode, String branch, int semester, String section, int roll_no, long enroll_no, double fees, String dob, String gender, String isDeleted, String createdAt, String modifiedAt) {
        this.id = id;
        this.studentId = studentId;
        this.fname = fname;
        this.lname = lname;
        this.phone_number = phone_number;
        this.email = email;
        this.age = age;
        this.password = password;
        this.aadhar_no = aadhar_no;
        this.address = address;
        this.pincode = pincode;
        this.branch = branch;
        this.semester = semester;
        this.section = section;
        this.roll_no = roll_no;
        this.enroll_no = enroll_no;
        this.fees = fees;
        this.dob = dob;
        this.gender = gender;
        this.isDeleted = isDeleted;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public long getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(long phone_number) {
        this.phone_number = phone_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getAadhar_no() {
        return aadhar_no;
    }

    public void setAadhar_no(long aadhar_no) {
        this.aadhar_no = aadhar_no;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public long getEnroll_no() {
        return enroll_no;
    }

    public void setEnroll_no(long enroll_no) {
        this.enroll_no = enroll_no;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
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

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
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
    
    
    
}
