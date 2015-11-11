package com.userdao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.modelpack.Usermodel;

public class Userdao {
	Connection con;

	public void signup(Usermodel user) throws SQLException {
		// TODO Auto-generated method stub
		String username = user.getUsername();
		String password = user.getPassword();
		String emailaddress = user.getEmailaddress();
		String contact = user.getContact();
		String firstname = user.getFirstname();
		String lastname = user.getLastname();
		String address = user.getAddress();
		String createdby = user.getCreatedby();
		String updatedby = user.getUpdatedby();

		String createddate = user.getCreateddate();
		String updateddate = user.getUpdateddate();
		int k = 2;
		// int d3=0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/crud", "root", "admin");
			Statement s = con.createStatement();
			String signup = "insert into details(username,password,emailaddress,contact,firstname,lastname,address,createdby,updatedby,createddate,updateddate,role_roleid) values('"
					+ username
					+ "','"
					+ password
					+ "','"
					+ emailaddress
					+ "','"
					+ contact
					+ "','"
					+ firstname
					+ "','"
					+ lastname
					+ "','"
					+ address
					+ "','"
					+ createdby
					+ "','"
					+ updatedby
					+ "','"
					+ createddate
					+ "','"
					+ updateddate
					+ "','"
					+ k
					+ "')";
			// String update=

			s.executeUpdate(signup);
			System.out.print(" insert sucess.....");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}

		// return d3;
		con.close();

	}

	/*
	 * public void login(Usermodel user) { // TODO Auto-generated method stub
	 * //ResultSet rs = null; try { Class.forName("com.mysql.jdbc.Driver"); con
	 * =
	 * DriverManager.getConnection("jdbc:mysql://localhost:3306/details","root"
	 * ,"admin"); String name=user.getUsername(); String
	 * pass=user.getPassword(); String
	 * login="select * from project where username='"
	 * +name+"' and password='"+pass+"'";
	 * 
	 * Statement st=con.createStatement(); //st.executeUpdate(login); ResultSet
	 * rs=st.executeQuery(login); while(rs.next()) { String
	 * n=rs.getString("username"); String p=rs.getString("password");
	 * if((name.equals(n))&&(pass.equals(p))) {
	 * System.out.println("login success"); } else {
	 * System.out.println("login failed"); } }
	 * 
	 * con.close();
	 * 
	 * 
	 * } catch (ClassNotFoundException| SQLException e) { // TODO Auto-generated
	 * catch block e.printStackTrace(); } //return rs;
	 * 
	 * 
	 * 
	 * 
	 * }
	 */

	public void update(Usermodel user) throws SQLException {
		// TODO Auto-generated method stub
		String username = user.getUsername();// request.getParameter("username");
		String password = user.getPassword();// request.getParameter("password");
		String emailaddress = user.getEmailaddress();// request.getParameter("emailaddress");
		String contact = user.getContact();// request.getParameter("contact");
		String firstname = user.getFirstname();// request.getParameter("firstname");
		String lastname = user.getLastname();// request.getParameter("lastname");
		String address = user.getLastname();// request.getParameter("address");
		String createdby = user.getCreatedby();// request.getParameter("createdby");
		String updatedby = user.getUpdatedby();// request.getParameter("updatedby");
		Date d = new Date();
		String createddate = d.toString();
		String updateddate = d.toString();

		// Connection con;
		// int d1=0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/crud", "root", "admin");
			Statement s = con.createStatement();

			String update = "update details set password='" + password
					+ "',emailaddress='" + emailaddress + "',contact='"
					+ contact + "',firstname='" + firstname + "',lastname='"
					+ lastname + "',address='" + address + "',createdby='"
					+ createdby + "',updatedby='" + updatedby
					+ "',createddate='" + createddate + "',updateddate='"
					+ updateddate + "' where username= '" + username + "'";
			s.executeUpdate(update);
			System.out.print("updatesucess");
		} catch (Exception e) {
			System.out.println(e);
		}
		// return d1;

		con.close();

	}

	public void delete(Usermodel user) throws SQLException {
		// TODO Auto-generated method stub
		int d = 0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/crud", "root", "admin");
			Statement s = con.createStatement();
			String username1 = user.getUsername();// request.getParameter("username");
			String delete = ("delete from details WHERE username= '"
					+ username1 + "'");
			d = s.executeUpdate(delete);
			// System.out.print("delete sucess");

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		con.close();

	}

	public List<Object> list(Usermodel user) {

		List<Object> list = new ArrayList();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/crud", "root", "admin");
			Statement s = con.createStatement();
			ResultSet rs = s.executeQuery("select * from details");
			while (rs.next()) {
				Usermodel u = new Usermodel();
				u.setUserid(rs.getInt(1));
				u.setUsername(rs.getString(2));
				u.setPassword(rs.getString(3));
				u.setEmailaddress(rs.getString(4));
				u.setFirstname(rs.getString(5));
				u.setLastname(rs.getString(6));
				u.setAddress(rs.getString(7));
				u.setCreatedby(rs.getString(8));
				u.setUpdatedby(rs.getString(9));
				u.setCreateddate(rs.getString(10));
				u.setUpdateddate(rs.getString(11));
				u.setRole_roleid(rs.getString(13));

				list.add(u);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return list;

	}

	public void add(Usermodel user) throws SQLException {
		// TODO Auto-generated method stub
		String username = user.getUsername();
		String password = user.getPassword();
		String emailaddress = user.getEmailaddress();
		String contact = user.getContact();
		String firstname = user.getFirstname();
		String lastname = user.getLastname();
		String address = user.getAddress();
		String createdby = user.getCreatedby();
		String updatedby = user.getUpdatedby();

		String createddate = user.getCreateddate();
		String updateddate = user.getUpdateddate();
		String role = user.getRole_roleid();
		// String roleid=user.getRole_roleid();
		// int k=2;
		// int d3=0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/crud", "root", "admin");
			Statement s = con.createStatement();
			String signup = "insert into details(username,password,emailaddress,contact,firstname,lastname,address,createdby,updatedby,createddate,updateddate,role_roleid) values('"
					+ username
					+ "','"
					+ password
					+ "','"
					+ emailaddress
					+ "','"
					+ contact
					+ "','"
					+ firstname
					+ "','"
					+ lastname
					+ "','"
					+ address
					+ "','"
					+ createdby
					+ "','"
					+ updatedby
					+ "','"
					+ createddate
					+ "','"
					+ updateddate
					+ "','"
					+ role
					+ "')";
			// String update=

			s.executeUpdate(signup);
			System.out.print(" insert sucess.....");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}

		// return d3;
		con.close();

	}

	public void adminupdate(Usermodel user) {
		// TODO Auto-generated method stub
		String username = user.getUsername();
		String password = user.getPassword();
		String emailaddress = user.getEmailaddress();
		String contact = user.getContact();
		String firstname = user.getFirstname();
		String lastname = user.getLastname();
		String address = user.getLastname();
		String createdby = user.getCreatedby();
		String updatedby = user.getUpdatedby();
		Date d = new Date();
		String createddate = d.toString();
		String updateddate = d.toString();
		String roleid=user.getRole_roleid();
		// Connection con;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/crud", "root", "admin");
			Statement s = con.createStatement();

			String update = "update details set password='" + password
					+ "',emailaddress='" + emailaddress + "',contact='"
					+ contact + "',firstname='" + firstname + "',lastname='"
					+ lastname + "',address='" + address + "',createdby='"
					+ createdby + "',updatedby='" + updatedby
					+ "',createddate='" + createddate + "',updateddate='"
					+ updateddate + "',role_roleid='" + roleid + "' where username= '" + username + "'";
			s.executeUpdate(update);
			System.out.print("updatesucess");
		} catch (Exception e) {
			System.out.println(e);
		}
		// return d1;

	}

	public void admindelete(Usermodel user) throws SQLException {
		// TODO Auto-generated method stub
		int d = 0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/crud", "root", "admin");
			Statement s = con.createStatement();
			String username1 = user.getUsername();// request.getParameter("username");
			String delete = ("delete from details WHERE username= '"
					+ username1 + "'");
			s.executeUpdate(delete);
			// System.out.print("delete sucess");

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		con.close();

	}

	public ResultSet checking(Usermodel um) throws ClassNotFoundException,
			SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud",
				"root", "admin");
		Statement s = con.createStatement();
		// String check = "select username,password,role_roleid from details";
		ResultSet rs = s
				.executeQuery("select username,password,role_roleid from details");
		/*
		 * while(rs.next()){ String nn = rs.getString(2); String pp =
		 * rs.getString(3); String rid = rs.getString(13); }
		 */
		return rs;

	}

}
