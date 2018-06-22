package com.ts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ts.dbutility.DBConnection;
import com.ts.dto.Comments;
import com.ts.dto.Post;
import com.ts.dto.Professional;

public class CommentsDAO {
	public List<Comments> getComments() {
		List<Comments> list=new ArrayList<>();
		PreparedStatement pst = null;
		ResultSet rst = null;
		System.out.println("In getComments Method");
	String UPDATE_QUERY = "select * from Comment";
	    try(Connection con1 = DBConnection.getConnection();){
	    	pst = con1.prepareStatement(UPDATE_QUERY);
	    	rst = pst.executeQuery();
	 System.out.println(rst);
		
		while(rst.next()){
			//System.out.println("Entered while loop");
			   Comments comment =new Comments();
			   //comment1.setUserId(rst.getInt(1));
			   comment.setUserId(rst.getInt(1));
			   comment.setComment(rst.getString(2));
    		   list.add(comment);
		  }
	} catch (SQLException e) {
		e.printStackTrace();
	}
		return list;
}
	public int setComments(Comments comment) {
		PreparedStatement pst = null;
		int status=0;
		ResultSet rst = null;
	final String INSERT_QUERY = "insert into Comment(comment) values(?)";
	try(Connection con = DBConnection.getConnection();){
		
		pst = con.prepareStatement(INSERT_QUERY);
		//pst.setInt(2,comment.getUserId());
		pst.setString(1, comment.getComment());
		
		
	    status= pst.executeUpdate();
//	    System.out.println(comment);
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return status;
	}

}
//public List<Customer> getAllCustomers(){
//	List<Customer> list=new ArrayList<>();
//	
//	PreparedStatement pst = null;
//	ResultSet rst = null;
//final String SELECT_QUERY = "select * from customer ";
//try(Connection con = DBConnection.getConnection();){
//	pst = con.prepareStatement(SELECT_QUERY);
//	rst = pst.executeQuery();
//	while(rst.next()){
//		Customer customer=new Customer();
//		customer.setCustomerId(rst.getInt(1));
//		customer.setCustomerName(rst.getString(2));
//		customer.setBalance(rst.getDouble(3));
//		customer.setUserName(rst.getString(4));
//		customer.setPassword(rst.getString(5));
//		list.add(customer);
//	}
//} catch (SQLException e) {
//	e.printStackTrace();
//}
//return list;
