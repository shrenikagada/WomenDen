package com.ts.web;

import java.io.IOException;

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

@WebServlet("/VictimRegister")
public class VictimRegister extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String victimFullName = request.getParameter("fname");
		String victimUserName = request.getParameter("uname");
		String victimMobileNo = request.getParameter("number");
		String victimEmailId = request.getParameter("email");
		String victimPassword = request.getParameter("pwd");
		Victim victim = new Victim();
		victim.setVictimFullName(victimFullName);
		victim.setVictimUserName(victimUserName);
		victim.setVictimMobileNo(victimMobileNo);
		victim.setVictimEmailId(victimEmailId);
		victim.setVictimPassword(victimPassword);
		
		VictimDAO victimDAO  = new VictimDAO();
		if(victimDAO.getVictimRegister(victim) != 0) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("HomePage.jsp");
			dispatcher.include(request,response);
			System.out.println("registration successful");
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
