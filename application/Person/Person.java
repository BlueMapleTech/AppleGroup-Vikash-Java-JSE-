package com.bluemaple.application.Person;

public class Person {
	private int User_id;
	private String Username;
	private String Password;
	private String Email_address;
	private String Sex;
	private String Contact;
	private String Create_date;
	private String Update_date;

	/*
	 * public Dao1(int User_id,String Username,String Password,String
	 * Email_address,String Sex,String Contact,String Create_date,String
	 * Update_date) { this.User_id=User_id; this.Username=Username;
	 * this.Password=Password; this.Email_address=Email_address; this.Sex=Sex;
	 * this.Contact=Contact; this.Create_date=Create_date;
	 * this.Update_date=Update_date; }
	 */
	public int getUser_id() {
		return User_id;
	}

	public void setUser_id(int User_id) {
		this.User_id = User_id;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String Username) {
		this.Username = Username;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String Password) {
		this.Password = Password;
	}

	public String getEmail_address() {
		return Email_address;
	}

	public void setEmail_address(String Email_address) {
		this.Email_address = Email_address;
	}

	public String getSex() {
		return Sex;
	}

	public void setSex(String Sex) {
		this.Sex = Sex;
	}

	public String getContact() {
		return Contact;
	}

	public void setContact(String Contact) {
		this.Contact = Contact;
	}

	public String getCreate_date() {
		return Create_date;
	}

	public void setCreate_date(String Create_date) {
		this.Create_date = Create_date;
	}

	public String getUpdate_date() {
		return Update_date;
	}

	public void setUpdate_date(String Update_date) {
		this.Update_date = Update_date;
	}

	@Override
	public String toString() {
		return "Person [User_id=" + User_id + ", Username=" + Username
				+ ", Password=" + Password + ", Email_address=" + Email_address
				+ ", Sex=" + Sex + ", Contact=" + Contact + ", Create_date="
				+ Create_date + ", Update_date=" + Update_date + "]";
	}




}
