package com.ts.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
//import java.util.ArrayList;
//import java.util.List;
import com.ts.dbutility.DBConnection;
import com.ts.dto.Professional;
public class ProfessionalDAO {
	/*public static void main(String args[]) {
		int value = getProfessionalRegister("Shrenika Gada","shrenikagada","16wh1a1217","shrenikagada@gmail.com","smile");
		System.out.println("Data is " + value);
	}8*/
	
	
public int getProfessionalRegister(Professional professional){
 
 PreparedStatement pst = null;
 int status=0;

final String INSERT_QUERY = "insert into Professional(professionalFullName,professionalUserName,professionalUserId,professionalEmailId,professionalPassword) values(?,?,?,?,? )";
try(Connection con = DBConnection.getConnection();){
 
 pst = con.prepareStatement(INSERT_QUERY);
 pst.setString(1, professional.getProfessionalFullName());
 pst.setString(2, professional.getProfessionalUserName());
 pst.setString(3, professional.getProfessionalUserId());
 pst.setString(4, professional.getProfessionalEmailId());
 pst.setString(5, professional.getProfessionalPassword());
 //pst.setInt(6, professional.getProfessionalId());
 
    status = pst.executeUpdate();
 
// System.out.println(status);
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
public Professional getProfessionalLogin(String professionalUserName,String professionalPassword){
  
  PreparedStatement pst = null;
  ResultSet rst = null;
  Professional professional=null;
 final String SELECT_QUERY = "select * from Professional where professionalUserName = ? and professionalPassword = ?";
 try(Connection con = DBConnection.getConnection();){
  
  pst = con.prepareStatement(SELECT_QUERY);
  pst.setString(1, professionalUserName);
  pst.setString(2, professionalPassword);
  rst = pst.executeQuery();
  if(rst.next()){
   professional=new Professional();
   professional.setProfessionalFullName(rst.getString(1));
   professional.setProfessionalUserName(rst.getString(2));
   professional.setProfessionalUserId(rst.getString(3));
   professional.setProfessionalEmailId(rst.getString(4));
   professional.setProfessionalPassword(rst.getString(5));
   professional.setProfessionalId(rst.getInt(6));
  //System.out.println(professional);
  }
 } catch (SQLException e) {
  e.printStackTrace();
 }
 return professional;
 }
public Professional getProfessionalLogin(int professionalId){
	  
	  PreparedStatement pst = null;
	  ResultSet rst = null;
	  Professional professional=null;
	 final String SELECT_QUERY = "select * from Professional where professionalId = ? ";
	 try(Connection con = DBConnection.getConnection();){
	  
	  pst = con.prepareStatement(SELECT_QUERY);
	  pst.setInt(1, professionalId);
	  rst = pst.executeQuery();
	  if(rst.next()){
	   professional=new Professional();
	   professional.setProfessionalFullName(rst.getString(1));
	   professional.setProfessionalUserName(rst.getString(2));
	   professional.setProfessionalUserId(rst.getString(3));
	   professional.setProfessionalEmailId(rst.getString(4));
	   professional.setProfessionalPassword(rst.getString(5));
	  //System.out.println(professional);
	  }
	 } catch (SQLException e) {
	  e.printStackTrace();
	 }
	 return professional;
	 }
public int editProfessionalDetails(Professional professional) {
 Connection con = null;
 PreparedStatement pst = null;
 int x = 0;
  try {
   con = DBConnection.getConnection();
   pst = con.prepareStatement("update Professional set professionalFullName = ?, professionalUserName= ?,professionalUserId=?, professionalEmailId=?,professionalPassword=? where custId = ?");
   pst.setString(1, professional.getProfessionalFullName());
   pst.setString(2, professional.getProfessionalUserName());
   pst.setString(3, professional.getProfessionalUserId());
   pst.setString(4, professional.getProfessionalEmailId());
   pst.setString(5, professional.getProfessionalPassword());   
   x = pst.executeUpdate();
  // System.out.println("Inside Update....."+professional);
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