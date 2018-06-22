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

import com.ts.dao.CrimesDAO;
import com.ts.dao.CrowdDAO;
import com.ts.dto.Crimes;
import com.ts.dto.Crowd;
@WebServlet("/InsertCrowd")
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, maxFileSize = 1024 * 1024 * 10,
maxRequestSize = 1024 * 1024 * 50, 
location = "C:\\java\\WiseProject\\JavaApplication\\WomenDen\\WebContent\\Images")
public class InsertCrowd extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String location = request.getParameter("location");
		String crowd = request.getParameter("crowd");
		Part part = request.getPart("photo");
		String fileName = getFileName(part);
		part.write(fileName);
		Crowd crowd1 = new Crowd();
		crowd1.setLocation(location);
		crowd1.setCrowdZone(crowd);	
		crowd1.setPhoto(fileName);
		CrowdDAO crowdDAO  = new CrowdDAO();
		if(crowdDAO.postCrowd(crowd1) != 0) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("AddCrowdZones.jsp");
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
