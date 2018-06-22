package com.ts.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ts.dao.PostDAO;
import com.ts.dto.Post;
@WebServlet("/PreviousPosts")
public class PreviousPosts extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int victimId = Integer.parseInt(request.getParameter("victimId"));
		PostDAO postDAO = new PostDAO();
		List<Post> postList = postDAO.getPostsId(victimId);
		//request.setAttribute("postList",postList);
		//System.out.println(postList);
		request.setAttribute("postList",postList);
		//System.out.println(postList);
		RequestDispatcher dispatcher = request.getRequestDispatcher("PreviousPostsJsp.jsp");
		
		dispatcher.include(request,response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
