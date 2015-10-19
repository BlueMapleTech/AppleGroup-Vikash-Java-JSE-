package com.bluemaple.application.studentdetails;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Login {
	static Connection con;

	public static void main(String[] args) throws SQLException,
			ClassNotFoundException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/studentdetails", "root",
					"admin");
			Scanner scr1 = new Scanner(System.in);
			System.out.println("Enter User Name:");
			String userName1 = scr1.nextLine();
			System.out.println("Enter Password:");
			String password1 = scr1.nextLine();
			PreparedStatement p = con
					.prepareStatement("select * from new_table");
			ResultSet rs = p.executeQuery();
			while (rs.next()) {
				String v = rs.getString("Username");
				String v1 = rs.getString("password");
				if ((userName1.equals(v)) && (password1.equals(v1))) {
					System.out.println("login success");
				} else {
					System.out.println("login failed");
				}

			}

		} finally {

		}
	}
}
