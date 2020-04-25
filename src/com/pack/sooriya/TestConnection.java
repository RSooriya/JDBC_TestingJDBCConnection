package com.pack.sooriya;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestConnection {

	public static void main(String[] args) {
      
		String jdbcUrl= "jdbc:mysql://127.0.0.1:3306/hb_student_tracker?serverTimezone=UTC";
		String username="RSooriya";
		String password="Suryasooriya@1ms";
		try
		{
			System.out.println("Connecting to database");
			Connection con = DriverManager.getConnection(jdbcUrl, username, password);
			System.out.println(con);
			System.out.println("Connection Successful");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
