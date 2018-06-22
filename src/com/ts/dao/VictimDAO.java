package com.ts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;

import com.ts.dbutility.DBConnection;
import com.ts.dto.Victim;
//import com.ts.dto.Professional;
 public class VictimDAO {
	 public int getVictimRegister(Victim victim){
			
			PreparedStatement pst = null;
			int status=0;
		final String SELECT_QUERY = "insert into Victim(victimFullName,victimUserName,victimMobileNo,victimEmailId,victimPassword) values(?,?,?,?,?)";
		try(Connection con = DBConnection.getConnection();){
			
			pst = con.prepareStatement(SELECT_QUERY);
			pst.setString(1, victim.getVictimFullName());
			pst.setString(2, victim.getVictimUserName());
			pst.setString(3, victim.getVictimMobileNo());
			pst.setString(4, victim.getVictimEmailId());			
			pst.setString(5, victim.getVictimPassword());
			
		    status= pst.executeUpdate();
			
			//System.out.println(victim);
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
		
	 public Victim getVictimLogin(String victimUserName,String victimPassword){
	 	
	 	PreparedStatement pst = null;
	 	ResultSet rst = null;
	 	Victim victim=null;
	 final String SELECT_QUERY = "select * from Victim where victimUserName = ? and victimPassword = ?";
	 try(Connection con = DBConnection.getConnection();){
	 	
	 	pst = con.prepareStatement(SELECT_QUERY);
	 	pst.setString(1, victimUserName);
	 	pst.setString(2, victimPassword);
	 	rst = pst.executeQuery();
	 	if(rst.next()){
	 		 victim=new Victim();
	 		 victim.setVictimFullName(rst.getString(1));
	 		 victim.setVictimUserName(rst.getString(2));
	 		 victim.setVictimEmailId(rst.getString(3));
	 		 victim.setVictimMobileNo(rst.getString(4));
	 		 victim.setVictimPassword(rst.getString(5));
	 		 victim.setVictimId(rst.getInt(6));
	 		 
	 	//System.out.println(victim);
	 	}
	 } catch (SQLException e) {
	 	e.printStackTrace();
	 }
	 return victim;
	 }
	 
	 public Victim getVictimLogin(int victimId){
		 	
		 	PreparedStatement pst = null;
		 	ResultSet rst = null;
		 	Victim victim=null;
		 final String SELECT_QUERY = "select * from Victim where victimId = ? ";
		 try(Connection con = DBConnection.getConnection();){
		 	
		 	pst = con.prepareStatement(SELECT_QUERY);
		 	pst.setInt(1, victimId);
		 	
		 	rst = pst.executeQuery();
		 	if(rst.next()){
		 		 victim=new Victim();
		 		 victim.setVictimFullName(rst.getString(1));
		 		 victim.setVictimUserName(rst.getString(2));
		 		 victim.setVictimEmailId(rst.getString(3));
		 		 victim.setVictimMobileNo(rst.getString(4));
		 		 victim.setVictimPassword(rst.getString(5));
		 		 victim.setVictimId(rst.getInt(6));
		 //	System.out.println(victim);
		 	}
		 } catch (SQLException e) {
		 	e.printStackTrace();
		 }
		 return victim;
		 }
	 public Victim setVictimComplaint(String victimUserName,String victimPassword){
			
			PreparedStatement pst = null;
			int status=0;
			Victim victim=null;
		final String INSERT_QUERY = "insert into VictimPost(?,?)";
		try(Connection con = DBConnection.getConnection();){
			pst = con.prepareStatement(INSERT_QUERY);
			pst.setString(1, victimUserName);
			pst.setString(2, victimPassword);
			
		    status= pst.executeUpdate();
			
			//System.out.println(victim);
			if(status > 0){
				System.out.println("Registration Successful");
				
			} else {
				System.out.println("Registration UnSuccessful");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return victim;
		}
	 public int editVictim(Victim victim) {
		 Connection con = null;
		 PreparedStatement pst = null;
		 int x = 0;
		 	try {
		 		con = DBConnection.getConnection();
		 		pst = con.prepareStatement("update Victim set victimFullName= ?, victimUserName= ?,victimEmail=?,victimMobileNo=?, victimPassword=? where victimId = ?");
		 		pst.setString(1, victim.getVictimFullName());
		 		pst.setString(2, victim.getVictimUserName());
		 		pst.setString(3, victim.getVictimEmailId());
		 		pst.setString(4, victim.getVictimMobileNo());
		 		pst.setString(5, victim.getVictimPassword());			
		 		x = pst.executeUpdate();
		 		//System.out.println("Inside Update....."+victim);
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
	 public int editVictimDetails(Victim victim) {
		 Connection con = null;
		 PreparedStatement pst = null;
		 int x = 0;
		 	try {
		 		con = DBConnection.getConnection();
		 		pst = con.prepareStatement("update Victim set victimFullName = ?, victimUserName= ?,victimMobileNo=?, victimEmailId=?,victimPassword=? where victimId = ?");
		 		pst.setString(1, victim.getVictimFullName());
		 		pst.setString(2, victim.getVictimUserName());
		 		pst.setString(3, victim.getVictimMobileNo());
		 		pst.setString(4, victim.getVictimEmailId());
		 		pst.setString(5, victim.getVictimPassword());
		 		pst.setInt(6, victim.getVictimId());
		 		x = pst.executeUpdate();
		 		//System.out.println("Inside Update....."+victim);
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
}
