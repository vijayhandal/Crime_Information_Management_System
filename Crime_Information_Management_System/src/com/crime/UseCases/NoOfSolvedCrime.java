package com.crime.UseCases;

import com.crime.dao.CrimeCriminalDao;
import com.crime.dao.CrimeCriminalImpl;

public class NoOfSolvedCrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


			// TODO Auto-generated method stub
			
			CrimeCriminalDao CCD = new CrimeCriminalImpl();
			
			int c = CCD.NoOfSovedCrime();
			System.out.println("Number of Solved Cases: "+c);

		
	}

}
