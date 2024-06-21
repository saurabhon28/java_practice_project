package com.employee_mgmt.web;

import java.io.IOException;
//import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.employee_mgmt.dao.EmployeeRegDao;
import com.employee_mgmt.model.EmployeeDependent;
import com.employee_mgmt.model.EmployeeInformation;

/**
 * Servlet implementation class EmployeeRegServlet
 */
@WebServlet("/")
public class EmployeeRegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EmployeeRegServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();

		switch (action) {
		case "/registerEmp":
			showNewForm(request, response);
			break;
		case "/register":
			insertEmployee(request, response);
			break;
		case "/success":
			successForm(request, response);
		default:
			showNewForm(request, response);
		}

	}

	private void showNewForm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("employee_reg_form.jsp");
		dispatcher.forward(request, response);
	}
	
	private void successForm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("success.jsp");
		dispatcher.forward(request, response);
	}

	private void insertEmployee(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		EmployeeInformation employee = new EmployeeInformation();
        employee.setFullName(request.getParameter("fullName"));
        employee.setFatherName(request.getParameter("fatherName"));
        employee.setMotherName(request.getParameter("motherName"));
        employee.setEmail(request.getParameter("email"));
        employee.setPhone(request.getParameter("phone"));
        employee.setGender(request.getParameter("gender"));
        employee.setDepartment(request.getParameter("department"));
        employee.setDesignation(request.getParameter("designation"));

        // Set permanent and communication addresses
        String permanentAddress = request.getParameter("permanentHouse") + ", " + request.getParameter("permanentStreet") + ", " +
                                  request.getParameter("permanentLandmark") + ", " + request.getParameter("permanentCity") + ", " +
                                  request.getParameter("permanentDistrict") + ", " + request.getParameter("permanentState") + ", " +
                                  request.getParameter("permanentPin");
        employee.setPermanentAddress(permanentAddress);

        String communicationAddress = request.getParameter("communicationHouse") + ", " + request.getParameter("communicationStreet") + ", " +
                                      request.getParameter("communicationLandmark") + ", " + request.getParameter("communicationCity") + ", " +
                                      request.getParameter("communicationDistrict") + ", " + request.getParameter("communicationState") + ", " +
                                      request.getParameter("communicationPin");
        employee.setCommunicationAddress(communicationAddress);
        
        // Save employee information
        EmployeeRegDao.saveEmployeeInfo(employee);
        
        // Create Dependent object
        EmployeeDependent dependent = new EmployeeDependent();
        dependent.setEmployee(employee);
        dependent.setName(request.getParameter("dependent"));
        dependent.setRelation(request.getParameter("relation"));
        dependent.setAadhaar(request.getParameter("aadhaar"));
        
        EmployeeRegDao.dependent(dependent);
        
        // Redirect to success page
        response.sendRedirect("success");
		
		

	}
}
