package com.crime.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.crime.Bean.Criminal;
import com.crime.util.Connect;

public class CriminalDaoImpl implements CriminalDao{

	@Override
	public String insertCriminalRecord(Criminal criminal) {
		String message = "Not inserted!!";
		
		
		try(Connection conn = Connect.provideconnection()){
			
			 PreparedStatement ps = conn.prepareStatement("insert into CriminalInfo(Name, Age, Gender, Address, Identifying_mark,first_arrested_Area, Which_Crime) values(?,?,?,?,?,?,?)");
			 
			 ps.setString(1, criminal.getName());
			 ps.setInt(2, criminal.getAge());
			 ps.setString(3, criminal.getGender());
			 ps.setString(4, criminal.getAddress());
			 ps.setString(5, criminal.getIdentifying_mark());
			 ps.setString(6, criminal.getFirst_arrested_Area());
			 ps.setString(7, criminal.getWhich_Crime());
			
			 int x = ps.executeUpdate();
			 
			 if(x>0) {
				 message = "Criminal Registered Successfully!!";
			 }
			 
			 
			 
			
			
		}catch (Exception e) {
			// TODO: handle exception
			
			message = e.getMessage();
		}
		
		
		return message;
	}

}
