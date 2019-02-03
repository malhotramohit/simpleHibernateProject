package com.gs.hibernate.project.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.gs.hibernate.project.model.UserData;

public interface UserService {
	
	public void save(UserData userData) throws SQLException;

	public ArrayList<UserData> findAll() throws SQLException;

	public UserData findById(long id) throws SQLException;

}
