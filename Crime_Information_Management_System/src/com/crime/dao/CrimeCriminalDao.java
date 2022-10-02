package com.crime.dao;

import com.crime.Bean.CrimeCriminal;
import com.crime.exceptions.CrimeException;
import com.crime.exceptions.CriminalException;

public interface CrimeCriminalDao {
	
	public String insertCrimeCriminalRecord(CrimeCriminal CrimeCriminal);
	
	public String SattusMarkAsSolved(int CriminalId, int Section)throws CriminalException,CrimeException;
	
	public String SattusMarkAsUnsolved(int CriminalId, int Section)throws CriminalException,CrimeException;

	public int NoOfSovedCrime();
	
	public int NoOfUnsovedCrime();
	
	
}
