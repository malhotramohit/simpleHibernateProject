package com.gs.hibernate.project.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.gs.hibernate.dao.UserDao;
import com.gs.hibernate.dao.UserDaoImpl;
import com.gs.hibernate.project.model.UserData;

public class UserServiceImpl implements UserService {
	private UserDao userDao = new UserDaoImpl();

	@Override
	public void save(UserData userData) throws SQLException {
		userDao.save(userData);
	}

	@Override
	public ArrayList<UserData> findAll() throws SQLException {
		return userDao.findAll();
	}

	@Override
	public UserData findById(long id) throws SQLException {
		return userDao.findById(id);
	}

}
