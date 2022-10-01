package com.crime.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.crime.Bean.Crime;
import com.crime.Bean.Criminal;
import com.crime.exceptions.CrimeException;
import com.crime.exceptions.CriminalException;
import com.crime.util.Connect;

public class CrimeDaoImpl implements CrimeDao{

	@Override
	public String insertCrimeRecord(Crime crime) {
		
		String message = "Not Registered!!";
		
		Connection conn = Connect.provideconnection();
		
		try {
			 PreparedStatement ps = conn.prepareStatement("insert into CrimeInfo(Date,Place,Description,victims,detail_description,suspectedName) values(?,?,?,?,?,?)");
//			 System.out.println(crime.getDate());
			 ps.setDate(1, crime.getDate());
			 ps.setString(2, crime.getPlace());
			 ps.setString(3, crime.getDescription());
			 ps.setInt(4, crime.getVictims());
			 ps.setString(5, crime.getDetail_description());
			 ps.setString(6, crime.getSuspectedName());
			 
			 int x = ps.executeUpdate();
			 
			 if(x>0) {
				 message = "Crime Registered Successfully!!";
			 }
			 
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			message = e.getMessage();
		}
		
		
		return message;
	}

	@Override
	public Crime searchCrimeBySction(int section) throws CrimeException {
		// TODO Auto-generated method stub
		Crime Cm = null;
		
		try(Connection conn = Connect.provideconnection()){
			
			 PreparedStatement ps = conn.prepareStatement("select * from CrimeInfo where Section = ?");
			
			  ps.setInt(1, section);
			 
			  ResultSet rs = ps.executeQuery();
			  
			  if(rs.next()) {
				  
				  int sec = rs.getInt("Section");
				  String date =  ""+rs.getDate("date");
				  String Place = rs.getString("Place");
				  String Description = rs.getString("Description");
				  int victims = rs.getInt("victims");
				  String detail_description = rs.getString("detail_description");
				  String suspectedName = rs.getString("suspectedName");
				  
				  Cm = new Crime(sec, date, Place, Description, victims, detail_description, suspectedName);
				  
			  }else {
				  throw new CrimeException("Criminal does not exist with CriminalID "+section);
			  }
			 
			
			
		}catch (SQLException e) {
			// TODO: handle exception
			
			e.printStackTrace();	
			throw new CrimeException(e.getMessage());
			
		}
		
		return Cm;
	}

}
