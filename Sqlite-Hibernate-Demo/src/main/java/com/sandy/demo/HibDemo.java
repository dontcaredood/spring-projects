package com.sandy.demo;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.sandy.demo.model.*;

public class HibDemo {
	
	
	static Transaction transaction = null;
	public static void main(String[] args) {
		 //HibernateConfiguration con = new HibernateConfiguration();
		 Configuration con = new Configuration().configure().addAnnotatedClass(Employees.class);
		 SessionFactory sf =  con.buildSessionFactory();
		 Session session = sf.openSession();
		 @SuppressWarnings("rawtypes")
		 Query  q = session.createQuery("from Employees");
	     List<Employees>  customerList = q.list();
	     for(Employees c : customerList) {
	    	 System.out.println(c); 
	     }
	    
	    

	}

}
