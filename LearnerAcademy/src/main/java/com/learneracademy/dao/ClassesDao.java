package com.learneracademy.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

import com.learneracademy.pojo.Classes;

public class ClassesDao {
	StandardServiceRegistry ssr;
	Metadata md;
	SessionFactory sf;
	Transaction trans;
	Session session;
	int row =0;
	
	public void hiberUtil() {
		try {
			ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
			md=	new MetadataSources(ssr).getMetadataBuilder().build();
		    sf=md.getSessionFactoryBuilder().build();
		    session=sf.openSession();
		    trans=session.beginTransaction();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void closeSession()
	{
		trans.commit();
		session.close();
	}
	
	// To insert the classes query
	public int insert(Classes c) {
	try {
		hiberUtil();
		row =(Integer) session.save(c);
		closeSession();
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	return row;	
	}
	
	//to update the classes query
	public String update(Classes c) {
		try {
			hiberUtil();
		 session.saveOrUpdate(c);
			closeSession();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "updated";	
		}
	
	//to delete the classes query
	public String delete(Classes c) {
		try {
			hiberUtil();
		 session.delete(c);
			closeSession();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "deleted";	
		}
	
	//to display all classes
	public List<Classes> display(){
		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata md=new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory sf=md.getSessionFactoryBuilder().build();
		Session session=sf.openSession();	
		Transaction trans=session.beginTransaction();
		trans.commit();
	
		Query q=session.createQuery("from Classes");
	      return q.list();
	}   
}


