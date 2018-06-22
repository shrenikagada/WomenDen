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
import com.ts.dao.ProfessionalDAO;
import com.ts.dto.Comments;
import com.ts.dto.Professional;

/**
 * Servlet implementation class CommentPost
 */
@WebServlet("/CommentPost")
public class CommentPost extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String post = request.getParameter("text");
		System.out.println("this is Post"+post);
		Comments comments = new Comments();
		comments.setComment(post);
		PrintWriter out = response.getWriter();
		System.out.println(comments);
		
		CommentsDAO commentsDAO = new CommentsDAO();
		commentsDAO.setComments(comments);
		List<Comments> commentList = commentsDAO.getComments();
		
	//	if(commentsDAO.getComments(comments) != null) {
		request.setAttribute("commentList",commentList);
			RequestDispatcher dispatcher = request.getRequestDispatcher("DisplayComments.jsp");
			dispatcher.include(request,response);
			System.out.println(commentList);
			out.println(comments);
			System.out.println("registration successful");
		}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
