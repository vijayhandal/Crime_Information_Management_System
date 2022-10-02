package com.crime.dao;

import com.crime.Bean.Crime;
import com.crime.exceptions.CrimeException;

public interface CrimeDao {

	public String insertCrimeRecord(Crime crime);
	
	public Crime searchCrimeBySction(int section)throws CrimeException;
	
	public int NoOfCrimeRecordedCurrentMonth();
	
	
	
}
