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
import com.ts.dao.CrowdDAO;
import com.ts.dto.Crimes;
import com.ts.dto.Crowd;

@WebServlet("/DisplayCrowd")
public class DisplayCrowd extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
	    CrowdDAO crowdDAO = new CrowdDAO();
		List<Crowd> crowdList = crowdDAO.getCrowd();
		//request.setAttribute("postList",postList);
		//System.out.println(postList);
		request.setAttribute("crowdList",crowdList);
		System.out.println(crowdList);
		RequestDispatcher dispatcher = request.getRequestDispatcher("Crowd.jsp");
		
		dispatcher.include(request,response);
		//out.println(crowdList);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
