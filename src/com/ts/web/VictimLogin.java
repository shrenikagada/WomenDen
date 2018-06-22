package com.ts.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ts.dao.ProfessionalDAO;
import com.ts.dao.VictimDAO;
import com.ts.dto.Professional;
import com.ts.dto.Victim;

/**
 * Servlet implementation class VictimLogin
 */
@WebServlet("/VictimLogin")
public class VictimLogin extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String victimUserName = request.getParameter("uname");
		String victimPassword = request.getParameter("pwd");
		
		VictimDAO victimDAO = new VictimDAO();
		Victim victim = victimDAO.getVictimLogin(victimUserName,victimPassword);	
		//System.out.println("Insert Servlet " + victim);
		//System.out.println("In Victim"+victim.getVictimId());
		request.setAttribute("VictimId", victim.getVictimId());
		if(victim != null) {
			System.out.println("Login Successful");
			RequestDispatcher dispatcher = request.getRequestDispatcher("PostBox.jsp");
			dispatcher.forward(request, response);
		} else {
			out.println("Invalid");
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
