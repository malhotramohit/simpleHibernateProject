package com.gs.hibernate.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.gs.hibernate.project.model.UserData;
import com.gs.hibernate.project.util.DBManager;

public class UserDaoImpl implements UserDao {

	DBManager dbManager = DBManager.getInstance();

	@Override
	public void save(UserData userData) throws SQLException {
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(userData);
		session.getTransaction().commit();
	}

	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<UserData> findAll() throws SQLException {
		
		ArrayList<UserData> userList = new ArrayList<>(10);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		userList =(ArrayList<UserData>) session.createNamedQuery("findAll").getResultList();
		
		session.getTransaction().commit();
		
		return userList;
	}

	@Override
	public UserData findById(long id) throws SQLException {
		
		UserData userData = null;
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.get(UserData.class, new Long(8));
		session.getTransaction().commit();
		return userData;
	}

}
