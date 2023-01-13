package com.mpc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mpc.util.Constants;

public final class UserDao {

	public static String submitArticle(String fname, String mob, String email, String regno, String sem, String branch, String article, String desc) {

		Connection connection = null;
		ResultSet resultSet = null;
		PreparedStatement statement = null;
		String status = "";
		try {
			connection = DbConnection.getConnectionObj();
			statement = connection.prepareStatement(Constants.QUERY_INSERT_RECORDS);
			statement.setString(1, fname);
			statement.setString(2, mob);
			statement.setString(3, email);
			statement.setString(4, regno);
			statement.setString(5, sem);
			statement.setString(6, branch);
			statement.setString(7, article);
			statement.setString(8, desc);
			int i = statement.executeUpdate();
			if (0 < i) {
				status = "Article added successfully";
			}
			return status;
		} catch (Exception e) {
			System.out.println("Exception occurred in loginDao : " + e.getMessage());
			return Constants.ERROR_MSG;
		} finally {
			if (null != resultSet) {
				try {
					resultSet.close();
				} catch (Exception e) {
					System.out.println("Exception  : resultSet : " + e.getMessage());
				}
			}
			if (null != statement) {
				try {
					statement.close();
				} catch (Exception e) {
					System.out.println("Exception  : statement : " + e.getMessage());
				}
			}
			if (null != connection) {
				try {
					connection.close();
				} catch (Exception e) {
					System.out.println("Exception  : connection : " + e.getMessage());
				}
			}
		}
	}
}
