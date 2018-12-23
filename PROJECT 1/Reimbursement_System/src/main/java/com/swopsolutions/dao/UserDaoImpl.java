package com.swopsolutions.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.swopsolutions.beans.User;
import com.swopsolutions.util.ConnectionUtil;

//Crud Data Access Object methods
public class UserDaoImpl implements UserDAO {

	// Create
	@Override
	public void insertUser(String firstName, String lastName, String email, String password, int role_id,
			String username) throws SQLException, IOException {
		try (Connection con = ConnectionUtil.getConnection(filename)) {
			String sql = "Insert into swop_user(firstname,lastname,email,password,role_id) values(?,?,?,?,?)";

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, firstName);
			ps.setString(2, lastName);
			ps.setString(3, email);
			ps.setString(4, password);
			ps.setInt(5, role_id);
			ps.setString(6, username);
			ps.executeQuery();
			System.out.println("We are in the User Dao");
		} catch (SQLException e) {
			System.out.println("Bad bness");
			e.printStackTrace();
		}
	}

	// Retrieve
	@Override
	public List<User> retrieveBubs() {
		List bubs = new ArrayList<>();
		try (Connection con = ConnectionUtil.getConnection(filename)) {
			String sql = "select * from swop_user";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				User user = new User(rs.getInt("user_id"), rs.getString("firstname"), rs.getString("lastname"),
						rs.getString("email"), rs.getString("password"), rs.getInt("role_id"),
						rs.getString("username"));
				System.out.println(rs.getString("username"));
				bubs.add(user);

//				System.out.println(user);
			}
		} catch (SQLException s) {

		} catch (IOException e) {

		}
		return bubs;

	}

	public List<User> mylist = retrieveBubs();

	// you could have this here but your daos should only contain
	public void getSpecificBub(String username) {
		for (User u : mylist) {
			if (u.getUsername().equals(username)) {
				System.out.println("Username exists already my bub");

			}
		}
	}
	@Override
	public List<User> updateUsers() {
		List<User> bubs = new ArrayList<>();
		try (Connection con = ConnectionUtil.getConnection(filename)) {
			String sql = "select * from swop_user";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				User user = new User(rs.getInt("user_id"), rs.getString("firstname"), rs.getString("lastname"),
						rs.getString("password"), rs.getString("email"), rs.getInt("role_id"),
						rs.getString("username"));
				System.out.println(rs.getString("username"));
				bubs.add(user);

			}
		} catch (SQLException s) {

		} catch (IOException e) {

		}
		return bubs;
	}

	// to use this method you need to put in the id of the user (user_id)
	@Override
	public void deleteUser(int id) {
		try (Connection con = ConnectionUtil.getConnection(filename)) {
			String sql = "Delete from reimbursements where user_id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ps.executeUpdate();

		} catch (SQLException e) {
			System.out.println();
		} catch (IOException i) {
		}
	}
	@Override
	public User getEmployeeByUsernamePassword(String username, String password) {
		User user = null;
		try (Connection con = ConnectionUtil.getConnection(filename)) {
			String sql = "Select * from swop_user where username = ? and password= ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int user_id = rs.getInt("user_id");
				String firstname = rs.getString("firstname");
				String lastname = rs.getString("lastname");
				String email = rs.getString("email");
				int role_id = rs.getInt("role_id");
				String un = rs.getString("username");
				user = new User(user_id, firstname, lastname, email, role_id, un);
				System.out.println(user);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException i) {
			i.printStackTrace();
		}

		return user;
	}
}
