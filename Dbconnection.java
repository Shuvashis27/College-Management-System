package com.mpc.dao;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mpc.util.Constants;

public final class DbConnection {

	public static Connection getConnectionObj() {
		try {
			Class.forName(Constants.DB_DRIVER);
			return DriverManager.getConnection(Constants.DB_URL, Constants.DB_USER_NAME, Constants.DB_PASS);
		} catch (Exception e) {
			System.out.println("Exception occurred in DB connection : " + e.getMessage());
			return null;
		}
	}
}
