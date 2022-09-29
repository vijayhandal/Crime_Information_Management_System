package com.crime.util;

import java.sql.Connection;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection conn = Connect.provideconnection();
		
		System.out.println(conn);

	}

}
