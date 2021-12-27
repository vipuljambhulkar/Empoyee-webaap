/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qaswatech.webapp.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author vipul jambhulkar
 */
public class Employee_Db {
    
//  private static final String DATABASE = Acet_Db.class.getSimpleName().toLowerCase();
    private static final String DATABASE = "employee_db";
    private static final String URL = "jdbc:mysql://localhost/" + DATABASE;
    private static final String USER = "root";
    private static final String PASS = "12345";
    
    
    public static Connection connectDb()
    {
        //Declaration Connection Object
        Connection con = null;
        
        try {
            //To register the driver , use Class.forName() approach. It will Dynamically load the driver's class file into the memory
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            con = DriverManager.getConnection(URL, USER, PASS);
//          System.out.println("Done");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("com.qaswatech.webapp.database.Employee_Db.connectDb() " + e.getMessage());
        }
        
        return con;
        
    } 
    
//    public static void main(String[] args) {
//        Acet_Db.connectDb();
//    }
}
