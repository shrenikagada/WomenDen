package com.ts.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.text.ParseException;
import com.ts.dao.CrimesDAO;
import com.ts.dao.VictimDAO;
import com.ts.dto.Crimes;
import com.ts.dto.Victim;

/**
 * Servlet implementation class InsertCrime
 */
@WebServlet("/InsertCrime")
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, maxFileSize = 1024 * 1024 * 10,
maxRequestSize = 1024 * 1024 * 50, 
location = "C:\\java\\WiseProject\\JavaApplication\\WomenDen\\WebContent\\Images")
public class InsertCrime extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String location = request.getParameter("location");
		String crime = request.getParameter("crime");
		Part part = request.getPart("photo");
		String fileName = getFileName(part);
		part.write(fileName);
		CrimesDAO crimesDAO  = new CrimesDAO();
		if(crimesDAO.postCrime(location,crime,fileName) != 0) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("AddCrimes.jsp");
			dispatcher.include(request,response);
			System.out.println("registration successful");
		}
	}
	private String getFileName(Part part) {
		String content = part.getHeader("content-disposition");
		System.out.println("content-disposition :"+content);
	String fileName = content.substring(content.indexOf("filename") + 10, content.length() - 1);
		System.out.println("fileName"+fileName);
	return fileName;
		}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
