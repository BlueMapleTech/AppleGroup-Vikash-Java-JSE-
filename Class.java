package com.bluemaple.application.studentdetails;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Class
{

	private static PreparedStatement p1;
	private static Connection con;


	public static void main(String args[])throws SQLException,ClassNotFoundException
	{Scanner v3= new Scanner(System.in);

		/*Connection con;
	    Statement p;
	    ResultSet rs;*/
		do
		{
	
		System.out.println("Enter choice:");
		System.out.println("menu");
        System.out.println("login");
		System.out.println("insert");
		System.out.println("update:");
		System.out.println("delete:");
		

		@SuppressWarnings("resource")
		Scanner no1 = new Scanner(System.in);
		int no = no1.nextInt();

		if (no == 1) {
		login();
		} else if (no == 2) {
			insert();
		} else if (no == 3) {
			update();
		} else if (no == 4) {
		 delete();
		}
		System.out.println("do u to continue:s/n ");
		String h=v3.nextLine();
		if(h.startsWith("n"))
		{
		
			break;
		
		}		
		}while(true);
	}
	
        
	     private static void delete() throws SQLException {
		// TODO Auto-generated method stub
	    	 
	    	 System.out.println("Deleted data:");
				@SuppressWarnings("resource")
				Scanner v2 = new Scanner(System.in);
				System.out.println("Enter deleted data");
				int id = v2.nextInt();
				final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
				final String DB_URL = "jdbc:mysql://LocalHost:3306/studentdetails";

				try {
					Class.forName(JDBC_DRIVER);
					Connection con = DriverManager.getConnection(DB_URL, "root", "admin");

				String delete = "DELETE FROM new_table  WHERE id="+id+" ";
				p1 = con.prepareStatement(delete);
				int i = p1.executeUpdate(delete);
				if (i == 1) {
					System.out.println("Datas are deleted");
				}}
				catch (SQLException e)
				{
					System.out.println(e);
				}
	
				
	}
	     @SuppressWarnings("unused")
			
		private static void insert() {
		// TODO Auto-generated method stub
	 		int User_id;
			
			String name;
			
			String password;
		
			String email;
			
			String sex;
			
System.out.println("enter the insert");
Scanner v = new Scanner(System.in);
			System.out.println("Enter User_id : ");
			int id = v.nextInt();

			System.out.println("Enter name : ");
		     String username = v.next();

			System.out.println("Enter password : ");
			String Password = v.next();

			System.out.println("Enter email : ");
			String email1 = v.next();

			System.out.println("Enter Sex : ");
	        sex = v.next();
	          final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
			final String DB_URL = "jdbc:mysql://LocalHost:3306/studentdetails";

			try {
				Class.forName(JDBC_DRIVER);
				Connection con = DriverManager.getConnection(DB_URL, "root", "admin");
				String Query="insert into new_table(id, name, password, email,sex) "+ "values ('"+id+"','"+username+"','"+Password+"','"+email1+"','"+sex+"')";
				
				PreparedStatement p1=con.prepareStatement(Query);
				
				int i = p1.executeUpdate(Query);
				if(i == 1) {
					System.out.println("inserted");
				        }
			}
				catch (SQLException e)
				{
					System.out.println(e);
				}
			
		
		}
	     
			
		
		private static void update() throws SQLException {
		// TODO Auto-generated method stub
	    	 Scanner no2=new Scanner(System.in);
	    	 System.out.println("enter update the value");
				 
	    	 System.out.println("Enter id : ");
				String id1= no2.next();

				
				System.out.println("Enter name : ");
				String name1= no2.next();

				System.out.println("Enter password : ");
				String pass = no2.next();

				System.out.println("Enter email : ");
				String email11 = no2.next();

				System.out.println("Enter sex : ");
				String sex1 = no2.next();
				final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
				final String DB_URL = "jdbc:mysql://LocalHost:3306/studentdetails";

				try {
					Class.forName(JDBC_DRIVER);
					Connection con = DriverManager.getConnection(DB_URL, "root", "admin");
					
	           String Update = "update new_table set id='"+id1+"',name='"+name1+"',password='"+pass+"',email='"+email11+"',Sex='"+sex1+"' "+ "WHERE id='"+id1+"'";

				
				//Connection con=null;
			p1 =con.prepareStatement(Update);
			   int i1 = p1.executeUpdate(Update);
				if (i1 == 1) {
					System.out.println(" updated complete");
				}
	     }
				catch (SQLException e)
				{
					System.out.println(e);
				}
			
		
		
		}


		private static void login() throws SQLException {
		// TODO Auto-generated method stub
			 System.out.println("enter the login ");

	    	 Scanner no1 = new Scanner(System.in);
	 		
	 						
	 		System.out.println("enter name");
	 		String name = no1.nextLine();

	 		System.out.println("enter passwrd ");
	 		String password = no1.nextLine();

	 		
	 		Connection conn = null;
	 		Statement stmt = null;
	 		final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	 		final String DB_URL1 = "jdbc:mysql://localhost:3306/studentdetails";
	 		Class.forName(JDBC_DRIVER);
	 		Connection con = DriverManager.getConnection(DB_URL1, "root", "admin");
	 	     PreparedStatement p11 = con.prepareStatement("select * from new_table where name='"+name+"' and password='"+password+"'");
	 		ResultSet rs = p11.executeQuery();

	 		while (rs.next()) {
	 			String r = rs.getString("name");
	 			String k = rs.getString("password");
	 			if (name.equals(r) && password.equals(k)) {
	 				System.out.println("Login Success");
	 			} else {
	 				System.out.println("Login Failed");
	 			}
		
	}
		}


		
		static void forName(String jDBC_DRIVER) {
			// TODO Auto-generated method stub
			
		}
}


