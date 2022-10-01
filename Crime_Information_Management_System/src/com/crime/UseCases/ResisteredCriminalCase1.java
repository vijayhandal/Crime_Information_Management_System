package com.crime.UseCases;

import java.util.Scanner;
import com.crime.Bean.Criminal;
import com.crime.dao.CriminalDao;
import com.crime.dao.CriminalDaoImpl;

public class ResisteredCriminalCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Criminal Name:");
		String name = sc.next();
		
		System.out.println("Enter Criminal Age: ");
		
		int age = sc.nextInt();
		
		System.out.println("Enter Criminal Gender:");
		String gender = sc.next();

		System.out.println("Enter Criminal Address:");
		String add = sc.next();
		
		System.out.println("Enter Criminal Identifying_mark:");
		String Identifying_mark = sc.next();
		
		System.out.println("Enter Criminal first_arrested_Area:");
		String first_arrested_Area = sc.next();
		
		System.out.println("Enter Criminal Which_Crime:");
		String Which_Crime = sc.next();
		
		CriminalDao CD = new CriminalDaoImpl();
		
		Criminal c1 = new Criminal();
		
		c1.setName(name);
		c1.setAge(age);
		c1.setGender(gender);
		c1.setAddress(add);
		c1.setIdentifying_mark(Identifying_mark);
		c1.setFirst_arrested_Area(first_arrested_Area);
		c1.setWhich_Crime(Which_Crime);
		
		String result = CD.insertCriminalRecord(c1);
		
		System.out.println(result);
		
		
	}

}
