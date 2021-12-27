/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qaswatech.webapp.dao;

import com.qaswatech.webapp.database.Employee_Db;
import com.qaswatech.webapp.enums.Messages;
import com.qaswatech.webapp.model.EmployeeModel;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author vipul jambhulkar
 */
public class EmployeeDAO {

    String sql, message;
    private static final String TABLE_NAME = "employee";

    public String saveEmployee(EmployeeModel employeeModel) {
//        System.out.println(studentModel);

        Connection con = Employee_Db.connectDb();
        CallableStatement cs = null;

        sql = "insert into " + TABLE_NAME + "(employee_id, name, dob, gender, address, city, state, login_id, password, is_deleted) values(?,?,?,?,?,?,?,?,?,?)";
        try {
            cs = con.prepareCall(sql);

            cs.setString(1, employeeModel.getEmployeeId());
            cs.setString(2, employeeModel.getName());
            cs.setString(3, employeeModel.getDob());
            cs.setString(4, String.valueOf(employeeModel.getGender().charAt(0)).toUpperCase());
            cs.setString(5, employeeModel.getAddress());
            cs.setString(6, employeeModel.getCity());
            cs.setString(7, employeeModel.getState());
            cs.setString(8, employeeModel.getLogin_id());
            cs.setString(9, employeeModel.getPassword());
            
            
            
            cs.setInt(10, employeeModel.getIsDeleted());

            int rows = cs.executeUpdate();
            if (rows >= 1) {
                message = Messages.INSERTED.getMessage();
            }
        } catch (Exception e) {
            message = e.getMessage();
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
            }
        }

//        return "Student Details Saved!";
        return message;
    }

    public ArrayList<EmployeeModel> findAll() {

        ArrayList<EmployeeModel> employeeList = new ArrayList<>();
        Connection con = Employee_Db.connectDb();
        CallableStatement cs = null;

        sql = "select * from " + TABLE_NAME + " where is_deleted = 0";

        try {
            cs = con.prepareCall(sql);
            ResultSet rs = cs.executeQuery();

            while (rs.next()) {
//                System.out.println(rs.getInt("id"));
//                System.out.println(rs.getString("name"));
                employeeList.add(
                        new EmployeeModel(
                                rs.getInt("id"),
                                rs.getString("employee_id"),
                                rs.getString("name"),
                                rs.getString("dob"),
                                rs.getString("gender"),
                                rs.getString("address"),
                                rs.getString("city"),
                                rs.getString("state"),
                                rs.getString("login_id"),
                                rs.getString("password"),
                                rs.getInt("is_deleted"),
                                rs.getString("created_at"),
                                rs.getString("modified_at")
                        )
                );
            }
        } catch (SQLException e) {
            System.out.println("com.qaswatech.webapp.dao.EmployeeDAO.findAll()" + e.getMessage());
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
            }
        }

        return employeeList;
    }


    public EmployeeModel findById(String employeeId) {
        EmployeeModel employee = null;
        Connection con = Employee_Db.connectDb();

        CallableStatement cs = null;
        ResultSet rs = null;

        sql = "select * from " + TABLE_NAME + " where employee_id = ?";

        try {

            cs = con.prepareCall(sql);
            cs.setString(1, employeeId);
            rs = cs.executeQuery();

            while (rs.next()) {
                employee
                        = new EmployeeModel(
                                rs.getInt("id"),
                                rs.getString("employee_id"),
                                rs.getString("name"),
                                rs.getString("dob"),
                                rs.getString("gender"),
                                rs.getString("address"),
                                rs.getString("city"),
                                rs.getString("state"),
                                rs.getString("password"),
                                rs.getString("login_id"),
                                rs.getInt("is_deleted"),
                                rs.getString("created_at"),
                                rs.getString("modified_at")
                        );
            }

        } catch (Exception e) {
            System.out.println("com.qaswatech.webapp.dao.EmployeeDAO.findById()" + e.getMessage());
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
            }
        }

        return employee;

    }

    
    public Integer count() {
        Connection con = Employee_Db.connectDb();

        CallableStatement cs = null;
        ResultSet rs = null;

        sql = "select count(*) + 1 as count from " + TABLE_NAME;
        Integer count = 0;

        try {

            cs = con.prepareCall(sql);
            rs = cs.executeQuery();

            while (rs.next()) {
                count = rs.getInt("count");
            }

        } catch (Exception e) {
            System.out.println("com.qaswatech.webapp.dao.EmployeeDAO.count()" + e.getMessage());
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
            }
        }

        return count;

    }

    public String softDelete(String employeeId) {
        Connection con = Employee_Db.connectDb();
        CallableStatement cs = null;

        sql = "update " + TABLE_NAME + " set is_deleted = 1 where employee_id = ?";
        try {
            cs = con.prepareCall(sql);
            cs.setString(1, employeeId);

            int rows = cs.executeUpdate();
            if (rows >= 1) {
                message = Messages.DELETED.getMessage();
            }
        } catch (SQLException e) {
            message = e.getMessage();
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
            }
        }

        return message;
    }

    public EmployeeModel findByLoginID(String loginID) {
        EmployeeModel employee = null;
        Connection con = Employee_Db.connectDb();

        CallableStatement cs = null;
        ResultSet rs = null;

        sql = "select * from " + TABLE_NAME + " where login_id = ?";
        

        try {

            cs = con.prepareCall(sql);
            cs.setString(1, loginID);

            rs = cs.executeQuery();

            while (rs.next()) {
                employee
                        = new EmployeeModel(
                                rs.getInt("id"),
                                rs.getString("employee_id"),
                                rs.getString("name"),
                                rs.getString("dob"),
                                rs.getString("gender"),
                                rs.getString("address"),
                                rs.getString("city"),
                                rs.getString("state"),
                                rs.getString("login_id"),
                                rs.getString("password"),
                                rs.getInt("is_deleted"),
                                rs.getString("created_at"),
                                rs.getString("modified_at")
                        );
            }

        } catch (Exception e) {
            System.out.println("com.qaswatech.webapp.dao.EmployeeDAO.findByEmail()" + e.getMessage());
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
            }
        }

        return employee;

    }
}
