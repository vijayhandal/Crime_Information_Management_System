package com.crime.UseCases;

import java.util.Scanner;

import com.crime.dao.CrimeCriminalDao;
import com.crime.dao.CrimeCriminalImpl;
import com.crime.exceptions.CrimeException;
import com.crime.exceptions.CriminalException;

public class MarksAsUnsolved {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter CriminalId:");
		int criId = sc.nextInt();
		
		System.out.println("Enter Crime Section:");
		int section = sc.nextInt();
		
		CrimeCriminalDao CCD = new CrimeCriminalImpl();
		
		try {
			String message = CCD.SattusMarkAsUnsolved(criId, section);
			System.out.println(message);
		} catch (CriminalException | CrimeException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}

}
