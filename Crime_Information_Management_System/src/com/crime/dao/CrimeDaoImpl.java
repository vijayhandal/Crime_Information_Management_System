package com.crime.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.crime.Bean.Crime;
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

}
