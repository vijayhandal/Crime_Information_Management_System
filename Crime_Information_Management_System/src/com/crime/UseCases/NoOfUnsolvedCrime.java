package com.crime.UseCases;

import com.crime.dao.CrimeCriminalDao;
import com.crime.dao.CrimeCriminalImpl;

public class NoOfUnsolvedCrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CrimeCriminalDao CCD = new CrimeCriminalImpl();
		
		int c = CCD.NoOfUnsovedCrime();
		System.out.println("Number of Unsolved Cases: "+c);

	}

}
