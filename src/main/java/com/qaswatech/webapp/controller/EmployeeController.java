/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qaswatech.webapp.controller;

import com.qaswatech.webapp.enums.Messages;
import com.qaswatech.webapp.model.EmployeeModel;
import com.qaswatech.webapp.service.EmployeeService;
import com.qaswatech.webapp.utility.Utils;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author vipul jambhulkar
 */
@WebServlet(name = "EmployeeController", urlPatterns = {"/EmployeeController"})
public class EmployeeController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        EmployeeModel employeeModel = new EmployeeModel();

        String message = null;
        String action = request.getParameter("action");

        if (action.equals("insert")) {

            try {

                employeeModel.setName(Utils.requireNotNull(request.getParameter("name"), "Name" + Messages.NOT_EMPTY.getMessage()));
                employeeModel.setDob(Utils.requireNotNull(request.getParameter("dob"), "Date Of Birth" + Messages.NOT_EMPTY.getMessage()));
                employeeModel.setGender(Utils.requireNotNull(request.getParameter("gender"), "Gender" + Messages.NOT_EMPTY.getMessage()));
                employeeModel.setAddress(Utils.requireNotNull(request.getParameter("address"), "Address" + Messages.NOT_EMPTY.getMessage()));
                employeeModel.setCity(Utils.requireNotNull(request.getParameter("city"), "City" + Messages.NOT_EMPTY.getMessage()));
                employeeModel.setState(Utils.requireNotNull(request.getParameter("state"), "State" + Messages.NOT_EMPTY.getMessage()));
                employeeModel.setLogin_id(Utils.requireNotNull(request.getParameter("login_id"), "Login ID" + Messages.NOT_EMPTY.getMessage()));
                employeeModel.setPassword(Utils.requireNotNull(request.getParameter("password"), "Password" + Messages.NOT_EMPTY.getMessage()));

                EmployeeService employeeService = new EmployeeService();
                message = employeeService.addStudent(employeeModel);

            } catch (Exception e) {

                message = e.getMessage();

            } finally {

                response.sendRedirect("login_page.jsp?message=" + message);

            }
        } else if (action.equals("delete")) {
            try {
                EmployeeService employeeService = new EmployeeService();
                String employeeId = (request.getParameter("employee_id"));
                message = employeeService.deleteStudent(employeeId);
            } catch (Exception e) {
                message = e.getMessage();
            } finally {

                response.sendRedirect("database_page.jsp?message=" + message);

            }
        } else if (action.equals("login")) {
            try {
                employeeModel.setLogin_id(request.getParameter("login_id"));
                employeeModel.setPassword(request.getParameter("password"));
                message = employeeService.login(employeeModel, request);
            } catch (Exception e) {
                message = e.getMessage();
            } finally {
                if (message.equals(Messages.LOGINDONE.getMessage())) {
                    response.sendRedirect("index.jsp?message=" + message);
                } else {
                    response.sendRedirect("login_page.jsp?message=" + message);
                }
            }
        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    EmployeeService employeeService = new EmployeeService();
    
    public ArrayList<EmployeeModel> findAll()
    {
        return employeeService.findAll();
    }
    
    public EmployeeModel findById(String employeeId)
    {
        return employeeService.findById(employeeId);
    }
    
}
