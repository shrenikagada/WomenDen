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

import com.ts.dao.CommentsDAO;
import com.ts.dao.PostDAO;
import com.ts.dto.Comments;
import com.ts.dto.Post;
@WebServlet("/ProfessionalView")
public class ProfessionalView extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
		doGet(request, response);
	}

}
