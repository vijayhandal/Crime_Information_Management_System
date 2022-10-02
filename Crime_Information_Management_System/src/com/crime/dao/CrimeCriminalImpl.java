package com.crime.dao;

import java.sql.Connection; 
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.crime.Bean.CrimeCriminal;
import com.crime.exceptions.CrimeException;
import com.crime.exceptions.CriminalException;
import com.crime.util.Connect;
import com.mysql.cj.protocol.Resultset;

public class CrimeCriminalImpl implements CrimeCriminalDao{

	@Override
	public String insertCrimeCriminalRecord(CrimeCriminal CrimeCriminal) {
		// TODO Auto-generated method stub
		
		
		String message = "Not Registered!!";
		
		try (Connection conn = Connect.provideconnection()){
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

	@Override
	public String SattusMarkAsSolved(int CriminalId, int Section)
			throws CriminalException, CrimeException {
		String Msg = "";
		
		try (Connection conn = Connect.provideconnection()){
			 PreparedStatement ps = conn.prepareStatement("update Crime_CriminalInfo set Status = 1 where CriminalId = ? AND Section = ?");
			 ps.setInt(1, CriminalId);
			 ps.setInt(2, Section);
			 int x = ps.executeUpdate();
			 
			 if(x>0) {
				 Msg = "Crime Update As Solved";
			 }else {
				 throw new CrimeException("Crime or Criminal not Found!!");
			 }
			 
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			Msg = e.getMessage();
			throw new CrimeException(e.getMessage());
		}
		
		return Msg;
	}
	
	
	public String SattusMarkAsUnsolved(int CriminalId, int Section)
			throws CriminalException, CrimeException {
		String Msg = "";
		
		try (Connection conn = Connect.provideconnection()){
			 PreparedStatement ps = conn.prepareStatement("update Crime_CriminalInfo set Status = 0 where CriminalId = ? AND Section = ?");
			 ps.setInt(1, CriminalId);
			 ps.setInt(2, Section);
			 int x = ps.executeUpdate();
			 
			 if(x>0) {
				 Msg = "Crime Update As Unsolved";
			 }else {
				 throw new CrimeException("Crime and Criminal not Found!!");
			 }
			 
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			Msg = e.getMessage();
			throw new CrimeException(e.getMessage());
		}
		
		return Msg;
	}

	@Override
	public int NoOfSovedCrime() {
		// TODO Auto-generated method stub
		int count = 0;
		try (Connection conn = Connect.provideconnection()){
			 PreparedStatement ps = conn.prepareStatement("select COUNT(*) Count from Crime_CriminalInfo where Status = 1");
			 
			
			 ResultSet c = ps.executeQuery();
			 if(c.next()) {
			 count = c.getInt("Count");
			 }
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.getMessage();
			
		}
		
		return count;
	}

	@Override
	public int NoOfUnsovedCrime() {
		int count = 0;
		try (Connection conn = Connect.provideconnection()){
			 PreparedStatement ps = conn.prepareStatement("select COUNT(*) Count from Crime_CriminalInfo where Status = 0");
			 
			
			 ResultSet c = ps.executeQuery();
			 if(c.next()) {
			 count = c.getInt("Count");
			 }
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.getMessage();
			
		}
		
		return count;
	}
	

}
