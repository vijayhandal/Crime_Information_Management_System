package com.crime.UseCases;

import java.util.Scanner;

import com.crime.dao.CriminalDao;
import com.crime.dao.CriminalDaoImpl;
import com.crime.exceptions.CrimeException;
import com.crime.exceptions.CriminalException;

public class SearchCriminalByCrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Crime: ");
		
		String Crime = sc.next();
		
		CriminalDao CD = new CriminalDaoImpl();
		
		try {
			System.out.println(CD.searchcriminalbyCrime(Crime));
		} catch (CrimeException | CriminalException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}

}
