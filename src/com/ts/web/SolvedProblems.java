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
import javax.servlet.http.HttpSession;

import com.ts.dao.PostDAO;
import com.ts.dao.ProfessionalDAO;
import com.ts.dto.Post;
import com.ts.dto.Professional;
@WebServlet("/SolvedProblems")
public class SolvedProblems extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int complaintId = Integer.parseInt(request.getParameter("complaintId"));
		//int professionalId = Integer.parseInt(request.getParameter("ProfessionalId"));
		HttpSession session = request.getSession();
		int professionalId = (int)session.getAttribute("ProfessionalId");
		//Professional professional=new Professional();
		//System.out.println(professionalId);
		Post post = new Post();
		post.setComplaintId(complaintId);
		post.setProfessionalId(professionalId);
		System.out.println(post);
		int x = new PostDAO().editSolvedDetails(post);
		
		PrintWriter out = response.getWriter();
		PostDAO postDAO = new PostDAO();
		List<Post> postList = postDAO.getPosts();
		//request.setAttribute("postList",postList);
		//System.out.println(postList);
		request.setAttribute("postList",postList);
		//System.out.println(postList);
		RequestDispatcher dispatcher = request.getRequestDispatcher("DisplayProblems.jsp");
		
		dispatcher.include(request,response);
		//out.println(postList);
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
