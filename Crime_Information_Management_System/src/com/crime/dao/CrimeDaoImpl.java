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
			 PreparedStatement ps = conn.prepareStatement("insert into CrimeInfo values(?,?,?,?,?,?,?)");
//			 System.out.println(crime.getDate());
			 ps.setInt(1, crime.getSection());
			 ps.setDate(2, crime.getDate());
			 ps.setString(3, crime.getPlace());
			 ps.setString(4, crime.getDescription());
			 ps.setInt(5, crime.getVictims());
			 ps.setString(6, crime.getDetail_description());
			 ps.setString(7, crime.getSuspectedName());
			 
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

	@Override
	public int NoOfCrimeRecordedCurrentMonth() {
		int count = 0;
		try (Connection conn = Connect.provideconnection()){
			 PreparedStatement ps = conn.prepareStatement("SELECT SUM(DATE_FORMAT(date, '%Y-%m-01') = DATE_FORMAT(CURRENT_DATE(), '%Y-%m-01')) Count,count(*) FROM CrimeInfo");
			 
			
			 ResultSet c = ps.executeQuery();
			 if(c.next()) {
			 count = c.getInt("Count");
//			 System.out.println(count);
			 }
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.getMessage();
			
		}
		
		return count;
	}

}
