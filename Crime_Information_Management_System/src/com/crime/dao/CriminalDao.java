package com.crime.dao;

import com.crime.Bean.Criminal;
import com.crime.exceptions.CrimeException;
import com.crime.exceptions.CriminalException;

public interface CriminalDao {
	
//	public String insertCriminalRecord(String name,int age,String gender, String add, String Identifyingmark,String FAArea,String WCrime);
		
	public String insertCriminalRecord(Criminal Criminal);
	
	public Criminal searchCriminalByCriminalId(int CriminalId)throws CriminalException;

}
