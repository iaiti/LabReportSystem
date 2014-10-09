package com.web.util;


import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


public class TestAdmin {
	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost/project?user=root&password=sql");
			ResultSet rs = c.createStatement().executeQuery("select * from student");
			while (rs.next() == true){
				System.out.println(rs.getString(2));
				if(new MD5().changeMD5("123").equals(rs.getString(2))){
					//
					System.out.println(new MD5().changeMD5("true"));
				}
			}
			System.out.println(new MD5().changeMD5("123"));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
