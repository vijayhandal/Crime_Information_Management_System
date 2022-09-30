package com.crime.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.crime.Bean.CrimeCriminal;
import com.crime.util.Connect;

public class CrimeCriminalImpl implements CrimeCriminalDao{

	@Override
	public String insertCrimeCriminalRecord(CrimeCriminal CrimeCriminal) {
		// TODO Auto-generated method stub
		
		
String message = "Not Registered!!";
		
		Connection conn = Connect.provideconnection();
		
		try {
			 PreparedStatement ps = conn.prepareStatement("insert into Crime_CriminalInfo(CriminalId,Section,Status) values(?,?,?)");
			 ps.setInt(1, CrimeCriminal.getCriminalId());
			 ps.setInt(2, CrimeCriminal.getSection());
			 ps.setBoolean(3, CrimeCriminal.getStatus());
			 int x = ps.executeUpdate();
			 
			 if(x>0) {
				 message = "Criminal Crime Registered Successfully!!";
			 }
			 
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			message = e.getMessage();
		}
		
		
		return message;
	}
	
	

}
