package com.bluemaple.application.PersonDao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bluemaple.application.Person.Person;

public class PersonDao {
	
	Connection con;
	PreparedStatement p;
	ResultSet rs;

	public void method(Person l) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
		final String DB_URL = "jdbc:mysql://LocalHost:3306/studentdetails";

		Class.forName(JDBC_DRIVER);
		Connection con = DriverManager.getConnection(DB_URL, "root","admin");
		p = con.prepareStatement("insert into details values(?,?,?,?,?,?,?,?)");
		p.setInt(1, l.getUser_id());
		p.setString(2, l.getUsername());
		p.setString(3, l.getPassword());
		p.setString(4, l.getEmail_address());
		p.setString(5, l.getSex());
		p.setString(6, l.getContact());
		p.setString(7, l.getCreate_date());
		p.setString(8, l.getUpdate_date());
		int i = p.executeUpdate();
		if (i == 1) {
			System.out.println("inserted");
		}

		
	}

	
	public List<Person>list() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		List<Person> li=new ArrayList();
		final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
		final String DB_URL = "jdbc:mysql://LocalHost:3306/studentdetails";

		Class.forName(JDBC_DRIVER);
		Connection con = DriverManager.getConnection(DB_URL, "root","admin");
		String query = "select * from details";
		PreparedStatement list1 = con.prepareStatement(query);
		ResultSet c = list1.executeQuery();

		while (c.next()) {
			Person p = new Person();
			p.setUser_id(c.getInt("User_id"));
			p.setUsername(c.getString("Username"));
			p.setPassword(c.getString("Password"));
			p.setEmail_address(c.getString("Email_address"));
			p.setSex(c.getString("Sex"));
			p.setContact(c.getString("Contact"));
            p.setCreate_date(c.getString("Create_date"));
            p.setUpdate_date(c.getString("Update_date"));
            li.add(p);
		}
		return li;

	}


	public List<Person> login1() throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		List<Person> li1=new ArrayList();
		final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
		final String DB_URL = "jdbc:mysql://LocalHost:3306/studentdetails";

		Class.forName(JDBC_DRIVER);
		Connection con = DriverManager.getConnection(DB_URL, "root","admin");
		String query = "select * from details";
		PreparedStatement list1 = con.prepareStatement(query);
		ResultSet c = list1.executeQuery();

		while (c.next()) {
			Person p1 = new Person();
			p1.setUsername(c.getString("Username"));
			p1.setPassword(c.getString("Password"));
			li1.add(p1);
	
		}
		return li1;
		
		
	}


	

	public int update1(Person p) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection con1 = null;
		PreparedStatement p1;
		ResultSet rs;


		final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
		final String DB_URL = "jdbc:mysql://LocalHost:3306/studentdetails";

		Class.forName(JDBC_DRIVER);
		 con1 = DriverManager.getConnection(DB_URL, "root","admin");
		//User_id='"+p.getUser_id()+"',
		String update="update details set Username='"+p.getUsername()+"',Password='"+p.getPassword()+"',Email_address="
				+ "'"+p.getEmail_address()+"',Sex='"+p.getSex()+"',Contact='"+p.getContact()+"',Create_date="
						+ "'"+p.getCreate_date()+"',Update_date='"+p.getUpdate_date()+"' where User_id ="+p.getUser_id();
		p1= con1.prepareStatement(update);
		int c1 = p1.executeUpdate();

		return c1;

	}


	public int delete1(Person p) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection con11;
		PreparedStatement p2;
		ResultSet rs;

		final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
		final String DB_URL = "jdbc:mysql://LocalHost:3306/studentdetails";

		Class.forName(JDBC_DRIVER);
		 con11= DriverManager.getConnection(DB_URL, "root","admin");
          String delete="delete from details where Username='"+p.getUsername()+"'";
          p2 = con11.prepareStatement(delete);
  		int c2 = p2.executeUpdate();
		return c2;
		}
}


		
		
	

		
	



