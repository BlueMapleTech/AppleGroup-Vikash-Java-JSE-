package com.bluemaple.application.PersonService;
import java.sql.SQLException;
import java.util.List;

import com.bluemaple.application.Person.Person;
import com.bluemaple.application.PersonDao.PersonDao;



public class PersonService {
	public  Person signup(Person l) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		PersonDao dao=new PersonDao(); 
		dao.method(l);
		return l;
	}

	public List<Person> list() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		PersonDao dao1=new PersonDao();
		return dao1.list();
		
	}

	public List<Person> login() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		PersonDao login=new PersonDao();
		return login.login1();
				
			
	}

	public int update(Person p) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		PersonDao update=new PersonDao();
		return update.update1(p);
		 
	}

	public int delete(Person p) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		PersonDao delete=new PersonDao();
	return delete.delete1(p);
	
	
	}

	
	
	

}
