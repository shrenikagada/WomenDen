package com.ts.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ts.dao.ProfessionalDAO;
import com.ts.dto.Professional;
@WebServlet("/ProfessionalRegister")
public class ProfessionalRegister extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String professionalFullName = request.getParameter("fname");
		String professionalUserName = request.getParameter("uname");
		String professionalUserId = request.getParameter("uid");
		String professionalEmailId = request.getParameter("email");
		String professionalPassword = request.getParameter("pwd");
		Professional professional = new Professional();
		professional.setProfessionalFullName(professionalFullName);
		professional.setProfessionalUserName(professionalUserName);
		professional.setProfessionalUserId(professionalUserId);
		professional.setProfessionalEmailId(professionalEmailId);
		professional.setProfessionalPassword(professionalPassword);
		
		System.out.println(professional);
		ProfessionalDAO professionalDAO = new ProfessionalDAO();
		if(professionalDAO.getProfessionalRegister(professional) != 0) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("HomePage.jsp");
			dispatcher.include(request,response);
			System.out.println("registration successful");
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
