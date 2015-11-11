package com.modelpack;

public class Usermodel {
	private int Userid;
	private String username;
	private String password;
	private String emailaddress;
	private String contact;
	private String firstname;
	private String lastname;
	private String address;
	private String createdby;
	private String updatedby;
	private String createddate;
	private String updateddate;
	private String role_roleid;
	public int getUserid() {
		return Userid;
	}
	public void setUserid(int userid) {
		Userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmailaddress() {
		return emailaddress;
	}
	public void setEmailaddress(String emailaddress) {
		this.emailaddress = emailaddress;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCreatedby() {
		return createdby;
	}
	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}
	public String getUpdatedby() {
		return updatedby;
	}
	public void setUpdatedby(String updatedby) {
		this.updatedby = updatedby;
	}
	public String getCreateddate() {
		return createddate;
	}
	public void setCreateddate(String createddate) {
		this.createddate = createddate;
	}
	public String getUpdateddate() {
		return updateddate;
	}
	public void setUpdateddate(String updateddate) {
		this.updateddate = updateddate;
	}
	public String getRole_roleid() {
		return role_roleid;
	}
	public void setRole_roleid(String role_roleid) {
		this.role_roleid = role_roleid;
	}
	@Override
	public String toString() {
		return "Usermodel [Userid=" + Userid + ", username=" + username
				+ ", password=" + password + ", emailaddress=" + emailaddress
				+ ", contact=" + contact + ", firstname=" + firstname
				+ ", lastname=" + lastname + ", address=" + address
				+ ", createdby=" + createdby + ", updatedby=" + updatedby
				+ ", createddate=" + createddate + ", updateddate="
				+ updateddate + ", role_roleid=" + role_roleid + "]";
	}
	
}
