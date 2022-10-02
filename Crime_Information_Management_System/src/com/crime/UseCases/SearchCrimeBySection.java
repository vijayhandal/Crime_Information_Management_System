package com.crime.UseCases;

import java.util.Scanner;
import com.crime.*;
import com.crime.Bean.Crime;
import com.crime.dao.CrimeDao;
import com.crime.dao.CrimeDaoImpl;
import com.crime.exceptions.CrimeException;


public class SearchCrimeBySction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Crime Section :");
		int section = sc.nextInt();
		
		CrimeDao CD = new CrimeDaoImpl();
		
		Crime crime = null;
		try {
			crime = CD.searchCrimeBySction(section);
			System.out.println(crime);
		} catch (CrimeException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
