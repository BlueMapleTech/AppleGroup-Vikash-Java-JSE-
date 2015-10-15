package com.bluemaple.application.studentdetails;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Scanner;


@SuppressWarnings("unused")
public class Signin3 {
	
	private static String Create_date = null;
	private static String Update_date = null;
	private static final String Email_address = null;
	static Connection connection;
	static PreparedStatement p;
	static ResultSet rs;
	
	Date date = new Date();
	String day = date.toString();

	public static void main(String arg[]) throws ClassNotFoundException,
			SQLException {
		
		System.out.println("Enter choice:");
		System.out.println("menu");
		System.out.println("1.login:");
		System.out.println("2.signup:");
		System.out.println("3.list of users");
		System.out.println("4.exit");

		@SuppressWarnings("resource")
		Scanner no1 = new Scanner(System.in);
		int no = no1.nextInt();

		if (no == 1) {
			login();
		} else if (no == 2) {
			signup();
		} else if (no == 3) {
			listOfUsers();
		} else if (no == 4) {
			exit();
		}
	}

	private static void exit() {
		System.out.println("completed ur purpose ");
	}

	private static void listOfUsers() throws SQLException,ClassNotFoundException {
		
		final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
		final String DB_URL = "jdbc:mysql://LocalHost:3306/studentdetails";
		Class.forName(JDBC_DRIVER);
		connection = DriverManager.getConnection(DB_URL, "root", "admin");
		String query = "select User_id, Username, Password, Email_address, Sex, Contact, Create_date, Update_date from new_table";
		PreparedStatement listOfUsers = connection.prepareStatement(query);
		ResultSet count = listOfUsers.executeQuery();
		
		while (count.next()) {
			int s = count.getInt("User_id");
			String name = count.getString("Username");
			String password = count.getString("Password");
			String email = count.getString("Email_address");
			String sex = count.getString("Sex");
			String contact = count.getString("Contact");
			String createdate = count.getString("Create_date");
			String updatedate = count.getString("Update_date");
			System.out.println("List of users:" + s + " " + name + " "+ password + " " + email + " " + sex + " " + contact + " "+ createdate + " " + updatedate);
		}
	}

	//@SuppressWarnings("unused")
	private static void signup() throws ClassNotFoundException {

		
		int User_id;
		
		String Username,Password,Email_address,Sex,Contact,Created_date,Updated_date;
		
		/*String Password;
	
		String Email_address;
		
		String Sex;
		
		String Contact;
		
		String Created_date;
		String Updated_dsate;*/

		System.out.println("Enter User_id : ");
		
		@SuppressWarnings("resource")
		Scanner v = new Scanner(System.in);
		User_id = v.nextInt();

		System.out.println("Enter Username : ");
	     Username =v.next();

		System.out.println("Enter Password : ");
		Password = v.next();

		System.out.println("Enter email_address : ");
		Email_address = v.next();

		System.out.println("Enter Sex : ");
        Sex = v.next();

		System.out.println("Enter Contact : ");
		Contact = v.next();
	    
	    System.out.println("Enter Create_date : ");
		Create_date = v.next();
	    
	    System.out.println("Enter Udate_date : ");
		Update_date = v.next();


		
		final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
		final String DB_URL = "jdbc:mysql://LocalHost:3306/studentdetails";

		try {
			Class.forName(JDBC_DRIVER);
			connection = DriverManager.getConnection(DB_URL, "root", "admin");
			String Query="insert into new_table(User_id, Username, Password, Email_address, Sex,Contact, create_date, Update_date) "+ "values (?,?,?,?,?,?,?,?)";
			
			PreparedStatement p=connection.prepareStatement(Query);
			
			p.setInt(1, 2);
			p.setString(2, "vk1");
			p.setString(3, "vk2");
			p.setString(4, "vk2");
			p.setString(5, "female");
			p.setInt(6, 22235);
			p.setInt(7, 45);
			p.setInt(8, 65);
			int i = p.executeUpdate();
			if (i == 1) {
				System.out.println("inserted");
			}
		}

		catch (SQLException e) {
			System.out.println(e);
		}
	}

	//@SuppressWarnings("unused")
	private static void login() throws SQLException, ClassNotFoundException {
		//Date date = new Date();
		//String day = date.toString();

		System.out.println("enter name");
		@SuppressWarnings("resource")
		Scanner a1= new Scanner(System.in);
		String Username = a1.nextLine();

		System.out.println("enter passwrd ");
		String password = a1.nextLine();

		
		Connection conn = null;
		Statement stmt = null;
		final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
		final String DB_URL = "jdbc:mysql://LocalHost:3306/studentdetails";
		Class.forName(JDBC_DRIVER);
		connection = DriverManager.getConnection(DB_URL, "root", "admin");
		p = connection.prepareStatement("select * from new_table");
		rs = p.executeQuery();

		while (rs.next()) {
			
			String v = rs.getString("Username");
			String k = rs.getString("Password");

			if (Username.equals(v) && password.equals(k)) {
				System.out.println("Login Success");
			} else {
				System.out.println("Login Failed");
			}
			
			System.out.println("Enter User_id : ");
			@SuppressWarnings("resource")
			Scanner v1 = new Scanner(System.in);
			int User_id = v1.nextInt();

			System.out.println("Enter Username : ");
			String Username1= v1.next();

			System.out.println("Enter Password : ");
			String Password = v1.next();

			System.out.println("Enter Email_address : ");
			String Email_address = v1.next();

			System.out.println("Enter Sex : ");
			String Sex = v1.next();

			System.out.println("Enter Contact : ");
			String Contact = v1.next();
			
			System.out.println("Enter Create_date : ");
			String cdate = v1.next();
			
			System.out.println("Enter Update_date : ");
		     String udate = v1.next();
		   //  String Update = "update new_table set Username=?,Password=?,Email_address=?,Sex=?,Contact=?,Create_date=?,Update_date=? "+ " WHERE User_id=1";
			String Update = "update new_table set Username='"+Username1+"',Password='"+Password+"',Email_address='"+Email_address+"',Sex='"+Sex+"',Contact='"+Contact+"',Create_date='"+cdate+"',Update_date='"+udate+"'"+"WHERE User_id=User_id";

			
			p = connection.prepareStatement(Update);
		   int i = p.executeUpdate();
			if (i == 1) {
				System.out.println(" updated complete");
			}

			System.out.println("Deleted data:");
			@SuppressWarnings("resource")
			Scanner v2 = new Scanner(System.in);
			System.out.println("Enter deleted data");
			int User_id11 = v2.nextInt();
			String sql1 = "DELETE FROM new_table  WHERE User_id=User_id";
			p = connection.prepareStatement(sql1);
			int i1 = p.executeUpdate();
			if (i1 == 1) {
				System.out.println("Datas are deleted");
			}
	

		}

		
	}
}

