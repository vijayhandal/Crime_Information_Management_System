package com.crime.UseCases;

import com.crime.dao.CrimeDao;
import com.crime.dao.CrimeDaoImpl;

public class NoOfCrimeRecordedCurrentMonth {

	public static void main(String[] args) {
		
		CrimeDao CD = new CrimeDaoImpl();
		
		int c = CD.NoOfCrimeRecordedCurrentMonth();
		System.out.println("Number of crimes recorded in the current month: "+c);
		
		

	}

}
