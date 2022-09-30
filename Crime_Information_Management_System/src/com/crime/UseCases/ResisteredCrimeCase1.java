package com.crime.UseCases;

import java.util.Scanner;

import com.crime.Bean.Crime;
import com.crime.dao.CrimeDao;
import com.crime.dao.CrimeDaoImpl;

public class ResisteredCrimeCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Crime Date (yyyy-MM-dd):");
		String date = sc.next();
		
		System.out.println("Enter Crime Place :");
		String place = sc.next();
		
		System.out.println("Enter Crime Description(Type of Crime):");
		String Description = sc.next();
		
		System.out.println("Enter Crime victims:");
		int victims = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter Crime detail_description:");
		String detail_description = sc.nextLine();
		
		System.out.println("Enter Crime suspectedName :");
		String suspectedName = sc.next();
		
		CrimeDao c = new CrimeDaoImpl();
		
		Crime  c2 = new Crime();
		c2.setDate(date);
		c2.setPlace(place);
		c2.setDescription(Description);
		c2.setVictims(victims);
		c2.setDetail_description(detail_description);
		c2.setSuspectedName(suspectedName);
		String result = c.insertCrimeRecord(c2);
		
		System.out.println(result);
	}

}
