package com.example.controller;

import java.sql.Blob;

import javax.servlet.http.HttpServletRequest;

import com.swopsolutions.beans.User;
import com.swopsolutions.service.Service;

public class ReimbursementsController {
	
	private static Service serv = new Service();
	
	public static String addReceipt(HttpServletRequest req) {
		return null;
	}

	public static String approve(HttpServletRequest req) {
		return null;
	}

	public static String deny(HttpServletRequest req){
		return null;
	}
	
	public static String newReimbursement(HttpServletRequest req){
		
		int type = Integer.parseInt(req.getParameter("type"));
		double amount = Double.parseDouble(req.getParameter("amount"));
		String description = req.getParameter("description");
		 User  n = (User) req.getSession().getAttribute("loger");
		int j =	serv.newReimbursement(description, amount, null, n.getUser_id(), type);

		return "employeereimbursementticket.html";
	}
	
		

}

