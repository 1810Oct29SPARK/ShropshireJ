package com.swopsolutions.dao;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.swopsolutions.beans.User;

public class driver {

	public static void main(String[] args) throws SQLException, IOException {
		initializeUsers();
	}

	public static void initializeUsers() throws SQLException, IOException {
		UserDaoImpl u = new UserDaoImpl();
		List<User> list = u.retrieveBubs();

		for (User i : list) {

        
			System.out.println(i.getFirstName());

		}
	}


}
