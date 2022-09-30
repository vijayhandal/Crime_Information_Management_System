package com.crime.UseCases;

import java.util.Scanner;

import com.crime.Bean.CrimeCriminal;
import com.crime.dao.CrimeCriminalDao;
import com.crime.dao.CrimeCriminalImpl;

public class ResisteredCrimeCriminalCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Criminal Id:");
		
		int id = sc.nextInt();
		
		System.out.println("Enter Crime Section: ");
		
		int section  = sc.nextInt();
		
		System.out.println("Enter Crime Status Solved/Unsolved in (true/false): ");
		
		boolean Status  = sc.nextBoolean();
		
		CrimeCriminalDao CCD = new CrimeCriminalImpl();
		
		CrimeCriminal CC = new CrimeCriminal(id,section,Status);
		
		String Result = CCD.insertCrimeCriminalRecord(CC);
		
		System.out.println(Result);
		

	}

}
