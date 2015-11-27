package com.bluemaple.application.PersonController;


import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.bluemaple.application.Person.Person;
import com.bluemaple.application.PersonService.PersonService;


 

public class PersonController {

	static PersonService service = new PersonService();

	public static void main(String arg[]) throws ClassNotFoundException,
			SQLException {
		do {
			System.out.println("Enter choice:");
			System.out.println("menu");
			System.out.println("1.login:");
			System.out.println("2.signup:");
			System.out.println("3.list of users");
			System.out.println("4.exit");

			Scanner s = new Scanner(System.in);
			int no = s.nextInt();

			switch (no) {
			case 1: {
				System.out.println("Login :");
				Scanner b = new Scanner(System.in);
				System.out.println("Enter  the name");
				String Username = b.next();

				System.out.println("Enter the password");
				String Password = b.next();

				service.login();
				List<Person> login1 = service.login();
				String bb = null;
				String cc = null;
				for (Person aa : login1) {
					bb = aa.getUsername();
					cc = aa.getPassword();

					// User DbName = loginRetrived.get(2);
					// User DbPword = loginRetrived.get(3);
					if (Username.equals(bb) && Password.equals(cc)) {

						System.out.println("Login Sucess");
						do {
							System.out.println("Select Option:");
							System.out.println("1.Update:");
							System.out.println("2.Delete:");
							System.out.println("3.Logout");

							Scanner a = new Scanner(System.in);
							System.out.println("Enter Option:");
							int no1 = a.nextInt();
							switch (no1) {
							case 1:

							{

								Scanner e = new Scanner(System.in);
								System.out.println("Enter the User_id");
								int User_id = e.nextInt();
								System.out.println("Enter the Username");
								String Username1 = e.next();

								
								System.out.println("Enter the password : ");
							    String Password1 = e.next();

								System.out.println("Enter emailAddress : ");
								String Email_address = e.next();

								System.out.println("Enter sex : ");
								String Sex = e.next();
	                          System.out.println("Enter contact : ");
					           String Contact = e.next();
	                           System.out.println("Enterthe Create_date : ");
								String Create_date = e.next();
								
	                            System.out.println("Enter Update_date : ");
								String Update_date = e.next();
								
								Person p = new Person();
								p.setUser_id(User_id);
								p.setUsername(Username1);
								p.setPassword(Password1);
								p.setEmail_address(Email_address);
								p.setSex(Sex);
								p.setContact(Contact);

								p.setCreate_date(Create_date);
								p.setUpdate_date(Update_date);

								// userService.update(user0);
								int r = service.update(p);
								if (r == 1) {
									System.out.println("Datas are updated");

								} else {
									System.out
											.println("datas not updated");
								}

								break;
							}

							case 2:
							{
								//String Username1 = Uname;
								//Person delete = new Person();
								Scanner n=new Scanner(System.in);
								System.out.println("enter name to delete");
								String s1=n.nextLine();
								Person p = new Person();
								p.setUsername(s1);
								//delete.setUsername(Username);
								service.delete(p);


								break;
							}
							case 3: {
								System.out.println("Exit");
								break;
							}
							}
							System.out.println("do you want to continue:y/n");
							Scanner s1 = new Scanner(System.in);
							String a1 = s1.nextLine();
							if (a1.startsWith("n")) {
								break;
							}

						} while (true);
					}
				}
			}
				break;
			case 2: {
				Scanner b1=new Scanner(System.in);
			    System.out.println("Enter the User_id : ");
					int User_id = b1.nextInt();

					System.out.println("Enter the Username");
					String Username = b1.next();

					System.out.println("Enter the Password");
					String Password = b1.next();

					System.out.println("Enter the email_address");
					String Email_address = b1.next();

					System.out.println("Enter the Sex");
					String Sex = b1.next();

					System.out.println("Enter the contact");
					String Contact = b1.next();

					System.out.println("Enter the Create_date");
					String Create_date = b1.next();

					System.out.println("Enter the Update_date");
					String Update_date = b1.next();
					
					Person l=new Person();
					l.setUser_id(User_id);
					l.setUsername(Username);
					l.setPassword(Password);
					l.setEmail_address(Email_address);
					l.setSex(Sex);
					l.setContact(Contact);
					l.setCreate_date(Create_date);
					l.setUpdate_date(Update_date);
			        
					service.signup(l);
				break;
			}
			case 3: {
				System.out.println("The List of users are:");
				service.list();
				List<Person> user = service.list();
				for(int i=0;i<user.size();i++){
				System.out.println("User deatils:" + user.get(i).toString());
				}
             break;
			}
			case 4: {
				System.out.println(" process complete");
			}
			}
			System.out.println("u to continue");
			Scanner b = new Scanner(System.in);
			String j = b.nextLine();
			if (j.startsWith("n")) {
				break;
			}

		} while (true);
	}
}


