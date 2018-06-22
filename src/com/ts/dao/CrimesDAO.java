package com.ts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ts.dbutility.DBConnection;
import com.ts.dto.Crimes;
import com.ts.dto.Post;

public class CrimesDAO {
	public int postCrime(String location,String crime,String fileName) {
		//System.out.println("In Post Method");
		PreparedStatement pst = null;
		int status=0;
	final String SELECT_QUERY = "insert into Crimes values(?,?,?)";
	try(Connection con = DBConnection.getConnection();){
		
		pst = con.prepareStatement(SELECT_QUERY);
		pst.setString(1, location);
		pst.setString(2, crime);
		pst.setString(3,fileName);
		status= pst.executeUpdate();
		
		//System.out.println(status);
		if(status > 0){
			System.out.println("Posted Successfully");
			
		} else {
			System.out.println("Error occured. Please post again");
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
		
		return status;
	}
public List<Crimes> getCrimes() {
		
		PreparedStatement pst = null;
		ResultSet rst = null;
		//System.out.println("In getComments Method");
	String UPDATE_QUERY = "select * from Crimes";
	 List<Crimes> list1 = new ArrayList<>();
	    try(Connection con1 = DBConnection.getConnection();){
	    	pst = con1.prepareStatement(UPDATE_QUERY);
	    	rst = pst.executeQuery();
	// System.out.println(rst);
	
		
		while(rst.next()){
			//System.out.println("Entered while loop");
			   Crimes crimes = new Crimes();
			   crimes.setLocation(rst.getString(1));
			   crimes.setCrime(rst.getString(2));
			   crimes.setPhoto(rst.getString(3));
    		   list1.add(crimes);
    		  // System.out.println(list1);
		  }
	} catch (SQLException e) {
		e.printStackTrace();
	}
	   // System.out.println(list1);
		return list1;
}
}
