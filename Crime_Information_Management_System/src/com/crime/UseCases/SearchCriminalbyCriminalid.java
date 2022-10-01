package com.crime.UseCases;

import java.util.Scanner;

import com.crime.Bean.Criminal;
import com.crime.dao.CriminalDao;
import com.crime.dao.CriminalDaoImpl;
import com.crime.exceptions.CrimeException;
import com.crime.exceptions.CriminalException;

public class SearchCriminalbyCriminalid {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Criminal Id :");
		int criminalId = sc.nextInt();
		
		CriminalDao CD = new CriminalDaoImpl();
		
		Criminal criminl = null;
		try {
			criminl = CD.searchCriminalByCriminalId(criminalId);
			System.out.println(criminl);
		} catch (CriminalException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
	}

}
