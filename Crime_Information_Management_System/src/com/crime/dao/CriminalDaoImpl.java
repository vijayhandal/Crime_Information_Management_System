package com.crime.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.crime.Bean.Criminal;
import com.crime.exceptions.CrimeException;
import com.crime.exceptions.CriminalException;
import com.crime.util.Connect;
import com.mysql.cj.protocol.Resultset;

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
			 
			 
			 
			
			
		}catch (SQLException e) {
			// TODO: handle exception
			
			message = e.getMessage();
		}
		
		
		return message;
	}

	@Override
	public Criminal searchCriminalByCriminalId(int CriminalId) throws CriminalException {
		
		Criminal criminal = null;
		
		
		try(Connection conn = Connect.provideconnection()){
			
			 PreparedStatement ps = conn.prepareStatement("select * from CriminalInfo where CriminalId = ?");
			
			  ps.setInt(1, CriminalId);
			 
			  ResultSet rs = ps.executeQuery();
			  
			  if(rs.next()) {
				  
				  int CrId = rs.getInt("CriminalId");
				  String name = rs.getString("Name");
				  int age = rs.getInt("Age");
				  String gender = rs.getString("Gender");
				  String Address = rs.getString("Address");
				  String Identifying_mark = rs.getString("Identifying_mark");
				  String first_arrested_Area = rs.getString("first_arrested_Area");
				  String Which_Crime = rs.getString("Which_Crime");
				  
				  criminal = new Criminal(CrId, name, age, gender, Address, Identifying_mark, first_arrested_Area, Which_Crime);
				  
			  }else {
				  throw new CriminalException("Criminal does not exist with CriminalID "+CriminalId);
			  }
			 
			
			
		}catch (SQLException e) {
			// TODO: handle exception
			
			e.printStackTrace();	
			throw new CriminalException(e.getMessage());
			
		}
		
		
		return criminal;
	}

}
