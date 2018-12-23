package com.swopsolutions.service;

import java.sql.Blob;
import java.util.List;

import com.swopsolutions.beans.Reimbursements;
import com.swopsolutions.beans.User;
import com.swopsolutions.dao.ReimbursementDAO;
import com.swopsolutions.dao.ReimbursementsDaoImpl;
import com.swopsolutions.dao.UserDAO;
import com.swopsolutions.dao.UserDaoImpl;

public class Service {

	private UserDAO uDAO = new UserDaoImpl();
	private ReimbursementsDaoImpl rDAO = new ReimbursementsDaoImpl();

	public User login(String username, String password) {
		User u = uDAO.getEmployeeByUsernamePassword(username, password);
		return u;
	}

	public int newReimbursement(String r_description, double amount, Blob picture, int u_id, int r_type) {
		int r = rDAO.insertReimbursements(r_description, amount, picture, u_id, r_type);
		return r;

	}

	public List<Reimbursements> userReimbursement(int u_id) {
		List<Reimbursements> r = rDAO.retrieveUserSeys(u_id);
		return r;

	}

	public List<Reimbursements> allReimbursement() {
		List<Reimbursements> r = rDAO.retrieveSeys();
		return r;

	}

	public int approve(int r_id, int resolver_id, int role) {

		int i = -1;
		if (role==2) {
			i = rDAO.updateReimbursements(r_id, 2, resolver_id);

		}
		return i;
	}

	public int deny(int r_id, int resolver_id, int role) {
		int i = -1;
		if (role==2) {
			i = rDAO.updateReimbursements(r_id, 3, resolver_id);

		}
		return i;
	}

	public int addReceipt(int r_id, Blob picture) {
		return 0;
	}
}