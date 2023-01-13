package com.mpc.util;

public final class Constants {

	private Constants() {

	}

	public static final String DB_URL = "jdbc:mysql://localhost:3306/mpcdb";
	public static final String DB_USER_NAME = "root";
	public static final String DB_PASS = "Panda@1234";
	public static final String DB_DRIVER = "com.mysql.jdbc.Driver";
	public static final String INVALID_LOGIN_MSG = "Login failed. Invalid credentials entered.";
	public static final String ERROR_MSG = "Error occurred, please try after some time.";
	public static final String QUERY_INSERT_RECORDS = "insert into mpcdb.annual_article (uname, mob, email, regno, sem, branch, title, colleg3_article) values (?,?,?,?,?,?,?,?)";

}
