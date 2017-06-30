package com.fannie.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GetConnection {

	static Connection connection;// this object should be static in real world
									// connection objects
	// should not be created many times.
	public PreparedStatement ps;
	public ResultSet rs;

	public static Connection getMySqlConnection() {
		// written by mysql and java
		try {
			Class.forName("com.mysql.jdbc.Driver");

			connection = DriverManager.getConnection("jdbc:mysql://localhost/sdet6", "root", "Hexaware!");
			return connection;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
