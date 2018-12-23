package com.swopsolutions.dao;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.swopsolutions.beans.User;

public interface UserDAO extends MasterDAO {
	public List<User> retrieveBubs();

	public void insertUser(String firstName, String lastName, String email, String password, int role_id,
			String username) throws SQLException, IOException;

	public void getSpecificBub(String username);

	public List<User> updateUsers();

	public void deleteUser(int id);

	public User getEmployeeByUsernamePassword(String username, String password);

}
