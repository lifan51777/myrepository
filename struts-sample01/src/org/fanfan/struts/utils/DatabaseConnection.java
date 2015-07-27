package org.fanfan.struts.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {
	private static final String driver = "com.mysql.jdbc.Driver";
	private static final String url = "jdbc:mysql://localhost:3306/test";
	private static final String name = "root";
	private static final String password = "root";
	
	private Connection connection;
	
	static{
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	private static class DatabaseConnectionHolder{
		private static DatabaseConnection instance = new DatabaseConnection();
	}
	
	public static DatabaseConnection getInstance(){
		return DatabaseConnectionHolder.instance;
	}
	
	private DatabaseConnection(){
	}
	
	public Connection getConnection(){
		try {
			connection = DriverManager.getConnection(url, name, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
	
	public void releaseConnection(Connection con, Statement st, ResultSet rs) throws SQLException{
		if(rs != null){
			rs.close();
		}
		if(st != null){
			st.close();
		}
		if(con != null){
			con.close();
		}
	}
}
