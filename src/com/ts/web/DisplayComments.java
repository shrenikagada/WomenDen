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
import com.ts.dto.Comments;
@WebServlet("/DisplayComments")
public class DisplayComments extends HttpServlet {
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	PrintWriter out = response.getWriter();	
	CommentsDAO commentsDAO = new CommentsDAO();

	List<Comments> commentList = commentsDAO.getComments();
	

	request.setAttribute("commentList",commentList);
		RequestDispatcher dispatcher = request.getRequestDispatcher("DisplayComments.jsp");
		dispatcher.include(request,response);
	}


protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
