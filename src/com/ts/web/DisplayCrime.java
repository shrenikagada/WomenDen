package com.ts.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ts.dao.CrimesDAO;
import com.ts.dao.PostDAO;
import com.ts.dto.Crimes;
import com.ts.dto.Post;
@WebServlet("/DisplayCrime")
public class DisplayCrime extends HttpServlet {
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter out = response.getWriter();
    CrimesDAO crimesDAO = new CrimesDAO();
	List<Crimes> crimesList = crimesDAO.getCrimes();
	//request.setAttribute("postList",postList);
	//System.out.println(postList);
	request.setAttribute("crimesList",crimesList);
	//System.out.println(crimesList);
	RequestDispatcher dispatcher = request.getRequestDispatcher("Crimes.jsp");
	
	dispatcher.include(request,response);
	//out.println(crimesList);

}
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
