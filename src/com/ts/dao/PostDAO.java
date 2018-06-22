package com.ts.dao;
import com.ts.dto.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ts.dbutility.DBConnection;

public class PostDAO {
	public int postData(Post post) {
		System.out.println("In Post Method");
		PreparedStatement pst = null;
		int status=0;
	final String SELECT_QUERY = "insert into Complaints(post,victimId,photo) values(?,?,?)";
	try(Connection con = DBConnection.getConnection();){
		
		pst = con.prepareStatement(SELECT_QUERY);
		pst.setString(1, post.getPost());
		
		pst.setInt(2, post.getVictimId());
		pst.setString(3, post.getPhoto());
		//pst.setString(3,"Not Solved");
		//pst.setString(3, victim.getVictimMobileNo());          ,Victim_victimId
		//pst.setString(5, victim.getVictimPassword());
		
	    status= pst.executeUpdate();
		
		//System.out.println(status);
		if(status > 0){
			System.out.println("Registration Successful");
			
		} else {
			System.out.println("Registration UnSuccessful");
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
		
		return status;
	}
	public List<Post> getPosts() {
		
		PreparedStatement pst = null;
		ResultSet rst = null;
		//System.out.println("In getComments Method");
	String UPDATE_QUERY = "select * from Complaints";
	 List<Post> list1 = new ArrayList<>();
	    try(Connection con1 = DBConnection.getConnection();){
	    	pst = con1.prepareStatement(UPDATE_QUERY);
	    	rst = pst.executeQuery();
	 System.out.println(rst);
	
		
		while(rst.next()){
			//System.out.println("Entered while loop");
			   Post post =new Post();
			   //comment1.setUserId(rst.getInt(1));
			   post.setComplaintId(rst.getInt(1));
			   post.setPost(rst.getString(2));
			   post.setVictimId(rst.getInt(3));
			   post.setPhoto(rst.getString(4));
			   post.setProfessionalId(rst.getInt(5));
			   
			   //System.out.println(post);
    		   list1.add(post);
    		   //System.out.println(list);
		  }
	} catch (SQLException e) {
		e.printStackTrace();
	}
	    System.out.println(list1);
		return list1;
}
	 public int editSolvedDetails(Post post) {
		 Connection con = null;
		 PreparedStatement pst = null;
		 ResultSet rst = null;
		 int x = 0;
		 	try {
		 		con = DBConnection.getConnection();
		 		System.out.println(post.getComplaintId()+" "+post.getProfessionalId());
		 		pst = con.prepareStatement("update Complaints set professionalId = ? where complaintId = ?");
		 		pst.setInt(1, post.getProfessionalId());
		 		pst.setInt(2, post.getComplaintId());
		 		x = pst.executeUpdate();
		 		System.out.println("Inside Update....."+post);
		 	} catch (SQLException e) {				
		 		e.printStackTrace();
		 	}	
		 	finally{
		 		try {
		 			con.close();
		 		} catch (SQLException e) {				
		 			e.printStackTrace();
		 		}
		 	}
		 	return x;
		 }
public List<Post> getPostsId(int victimId) {
	
	PreparedStatement pst = null;
	ResultSet rst = null;
	//System.out.println("In getComments Method");
String UPDATE_QUERY = "select * from Complaints where victimId = ?";
 List<Post> list1 = new ArrayList<>();
 	
    try(Connection con1 = DBConnection.getConnection();){
    	pst = con1.prepareStatement(UPDATE_QUERY);
    	pst.setInt(1, victimId);
    	rst = pst.executeQuery();
 System.out.println(rst);

	
	while(rst.next()){
		System.out.println("Entered while loop");
		   Post post =new Post();
		   //comment1.setUserId(rst.getInt(1));
		   post.setComplaintId(rst.getInt(1));
		   post.setPost(rst.getString(2));
		   post.setVictimId(rst.getInt(3));
		   post.setProfessionalId(rst.getInt(4));
		   //System.out.println(post);
		   list1.add(post);
		   //System.out.println(list);
	  }
} catch (SQLException e) {
	e.printStackTrace();
}
    System.out.println(list1);
	return list1;
}
}
