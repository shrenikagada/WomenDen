package com.ts.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ts.dao.ProfessionalDAO;
import com.ts.dto.Professional;
@WebServlet("/ProfessionalLogin")
public class ProfessionalLogin extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String professionalUserName = request.getParameter("uname");
		String professionalPassword = request.getParameter("pwd");
		
		ProfessionalDAO professionalDAO = new ProfessionalDAO();
		Professional professional = professionalDAO.getProfessionalLogin(professionalUserName,professionalPassword);	
		//request.setAttribute("ProfessionalId", professional.getProfessionalId());
		HttpSession session=request.getSession();
		session.setAttribute("ProfessionalId", professional.getProfessionalId());
		
		//out.println("Insert Servlet " + ProfessionalId);
		
		if(professional != null) {
			System.out.println("Login Successful");
			RequestDispatcher dispatcher = request.getRequestDispatcher("ViewProfessional.jsp");
			dispatcher.forward(request, response);
		} else {
			out.println("Invalid");
		}
		}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
