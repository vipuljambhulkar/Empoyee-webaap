/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qaswatech.webapp.service;

import com.qaswatech.webapp.dao.EmployeeDAO;
import com.qaswatech.webapp.enums.Messages;
import com.qaswatech.webapp.model.EmployeeModel;
import com.qaswatech.webapp.utility.Utils;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Vipul Jambhulkar
 */
public class EmployeeService {

    EmployeeDAO employeeDAO = new EmployeeDAO();
    Utils utils = new Utils();

    public String addStudent(EmployeeModel employeeModel) {
        String publicId = utils.generateEmployeeID(30);

        employeeModel.setEmployeeId(publicId);
        employeeModel.setIsDeleted(0);

//        System.out.println(studentModel.getName());
//        System.out.println(studentModel.getPhoneNumber());
//        System.out.println(studentModel.getEmailId());
//        System.out.println(studentModel.getAge());
//        System.out.println(studentModel.getPassword());
//        System.out.println(studentModel.getAadharNo());
//        System.out.println(studentModel.getAddress());
//        System.out.println(studentModel.getPincode());
//        System.out.println(studentModel.getBranch());
//        System.out.println(studentModel.getSemester());
//        System.out.println(studentModel.getSection());
//        System.out.println(studentModel.getRollNo());
//        System.out.println(studentModel.getEnrollNo());
//        System.out.println(studentModel.getFees());
//        System.out.println(studentModel.getDob());
//        System.out.println(studentModel.getGender());
//        
//        
//        return "We in Service Layer.";
        return employeeDAO.saveEmployee(employeeModel);

    }

    public ArrayList<EmployeeModel> findAll() {

        return employeeDAO.findAll();

    }

//    public String deleteStudent(int id) {
//        
//       return studentDAO.HardDelete(id);
//            
//    }
    public String deleteStudent(String employeeId) {

        return employeeDAO.softDelete(employeeId);

    }

    public EmployeeModel findById(String employeeId) {

        return employeeDAO.findById(employeeId);

    }

    public String login(EmployeeModel employeeModel, HttpServletRequest request) {
        EmployeeModel existingEmployee = employeeDAO.findByLoginID(employeeModel.getLogin_id());
        if (existingEmployee == null) {
            return "No User Found With provided Login ID";
        } else {
            if (existingEmployee.getPassword().equals(employeeModel.getPassword())) {
                HttpSession session = request.getSession();
                session.setAttribute("Name",existingEmployee.getName());
                session.setAttribute("PublicId",existingEmployee.getEmployeeId());

                return Messages.LOGINDONE.getMessage();
            } else {
                return "Password not matche";
            }
        }
    }

}
