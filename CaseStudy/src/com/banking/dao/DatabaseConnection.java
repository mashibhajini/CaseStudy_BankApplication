package com.banking.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
 
	
	
	public static Connection connectToDatabase() throws Exception{
		System.out.println("dbms");
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String dburl ="jdbc:oracle:thin:@localhost:1521:xe";
		String userName="system";
		String password="manager";
		Connection connection = DriverManager.getConnection(dburl,userName,password);
		return connection;
	}
}
