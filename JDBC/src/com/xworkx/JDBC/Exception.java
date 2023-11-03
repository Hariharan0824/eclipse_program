package com.xworkx.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Exception {

	public static void main(String[] args) {
		// mainprotocaol : subprotocol:host:portnumber/databasename
				String jdbcURL = "jdbc:mysql://localhost:3306/metro";
				String userName = "root";
				String password = "Xworkzodc@123";
				String driverClass = "com.mysql.jdbc.Driver";     //Fully Qualified Class Name
				//String driverClass = "com.oracle.jdbc.OracleDriver";
				
				try {
					//Class loading / class loader
					//Load and register driver class
					Class.forName(driverClass);
				}catch(ClassNotFoundException e1) {
					e1.printStackTrace();
				}
				
				//root or admin
				// Xworkzodc@123
				
				
				String query = "INSERT into INFO (ID,M_START,M_END) VALUE (1,'college','Brooks')";
				String query1 = "INSERT into INFO (ID,M_START,M_END) VALUE (2,'Station','Home')";
				String updateQuery = "UPDATE METRO SET M_START = 'college' WHERE name = 'office'";
				//String deleteQuery = "DELETE FROM bank WHERE name = 'SBI'";
				
				
				System.out.println("Connecting to database...");
				try {
					//get connection
					Connection conn = DriverManager.getConnection(jdbcURL,userName,password);
					System.out.println("Connection successful");
					
					Statement stmt = conn.createStatement();
					stmt.execute(query);
					System.out.println("Executed Insert");
					stmt.execute(updateQuery);
					System.out.println("Executed Update");
					//stmt.execute(deleteQuery);
					//Insert - execute
					//Update - 
					
					//execute, executeUpdate, executeQuery
					
					// Statement ---> PreparedStatement
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
			}


}
