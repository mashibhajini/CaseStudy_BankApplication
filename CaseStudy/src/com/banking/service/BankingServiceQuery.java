package com.banking.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.banking.dao.DatabaseConnection;

public class BankingServiceQuery {
//	BankAccount b=new BankAccount();

	public void addCustomer(String customerName,String customerId) throws SQLException, Exception
	{
		try(Connection conn= DatabaseConnection.connectToDatabase()){

			Statement statement = DatabaseConnection.connectToDatabase().createStatement();

			statement.executeQuery("insert into BANK values("+customerId +","+customerName+")");
			conn.close();
		}
	}

public List<String> getCustomerDetails(String customerName,String customerId) throws Exception {
	

	try(Connection conn= DatabaseConnection.connectToDatabase()){
		Statement statement = DatabaseConnection.connectToDatabase().createStatement();
		ArrayList<String> details=new ArrayList<String>();
		ResultSet rs=statement.executeQuery("select * from BANK where (customerId= "+customerId +"AND customerName="+customerName+")");
		while(rs.next()) {
			details.add(customerId);
			details.add(customerName);
	}
		conn.close();
		return details;
	
}
}
}

