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

import com.learneracademy.pojo.Subjects;

public class SubjectsDao {
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
	
	// To insert the subjects query
	public int insert(Subjects su) {
	try {
		hiberUtil();
		row =(Integer) session.save(su);
		closeSession();
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	return row;	
	}
	
	//to update the subjects query
	public String update(Subjects su) {
		try {
			hiberUtil();
		 session.saveOrUpdate(su);
			closeSession();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "updated";	
		}
	
	//to delete the subjects query
	public String delete(Subjects su) {
		try {
			hiberUtil();
		 session.delete(su);
			closeSession();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "deleted";	
		}
	
	//to display all subjects
	public List<Subjects> display(){
		
		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata md=new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory sf=md.getSessionFactoryBuilder().build();
		Session session=sf.openSession();	
		Transaction trans=session.beginTransaction();
		trans.commit();
		Query q=session.createQuery("from Subjects");
	      return q.list();
	}   
}


