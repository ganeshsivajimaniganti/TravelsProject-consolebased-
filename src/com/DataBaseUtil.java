package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseUtil {

	private static final String URL = "jdbc:mysql://127.0.0.1:3306/flm";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "ganesh";

	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(URL, USERNAME, PASSWORD);
	}

}
