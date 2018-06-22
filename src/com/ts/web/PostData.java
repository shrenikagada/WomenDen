package com.ts.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.ts.dao.*;
import com.ts.dto.*;

/**
 * Servlet implementation class PostData
 */
@WebServlet("/PostData")
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, maxFileSize = 1024 * 1024 * 10,
maxRequestSize = 1024 * 1024 * 50, 
location = "C:\\java\\WiseProject\\JavaApplication\\WomenDen\\WebContent\\Images")
public class PostData extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		String post = request.getParameter("post");
		int id = Integer.parseInt(request.getParameter("VictimId"));
		Part part = request.getPart("photo");
		String fileName = getFileName(part);
		part.write(fileName);
		//
		System.out.println(post);
		// = Integer.parseInt(request.getParameter("userName"));
		//System.out.println(Victim_victimId);
		response.setContentType("text/html");
		Post post1 = new Post();
		
		
		post1.setPost(post);
		post1.setVictimId(id);
		post1.setPhoto(fileName);
		System.out.println(post);
		PostDAO postDAO = new PostDAO();
		if(postDAO.postData(post1) != 0) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("HomePage.jsp");
			dispatcher.forward(request,response);
			System.out.println("Your Post has been sent..!!");
		}
	}
	private String getFileName(Part part) {
		String content = part.getHeader("content-disposition");
		System.out.println("content-disposition :"+content);
	String fileName = content.substring(content.indexOf("filename") + 10, content.length() - 1);
		System.out.println("fileName"+fileName);
	return fileName;
		}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
