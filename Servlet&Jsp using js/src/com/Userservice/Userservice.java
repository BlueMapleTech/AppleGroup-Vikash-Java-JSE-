package com.Userservice;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.modelpack.Usermodel;
import com.userdao.Userdao;

public class Userservice {
	Usermodel user=new Usermodel();
	Userdao dao=new Userdao();
	
	
	public void signup(Usermodel user) throws SQLException {
		// TODO Auto-generated method stub
		 dao.signup(user);
	}


	/*public void login(Usermodel user) {
		
		
		 //return
				 dao.login(user);
		
	}*/


	public void update(Usermodel user) throws SQLException {
		 dao.update(user);
	}


	public void delete(Usermodel user) throws SQLException {
	 dao.delete(user);
	}






	public void add(Usermodel user) throws SQLException {
		 dao.add(user);
		// TODO Auto-generated method stub
		
	}


	


	public List<Object> list() {
		return dao.list(user);
	
	}


	public void adminupdate(Usermodel user2) {
		// TODO Auto-generated method stub
		dao.adminupdate(user);
		
	}


	public void admindelete(Usermodel user) throws SQLException {
		// TODO Auto-generated method stub
		dao.admindelete(user);
	}


	public ResultSet checking(Usermodel um) throws ClassNotFoundException, SQLException {
		return dao.checking(um);
		
	}
	}
	
	


