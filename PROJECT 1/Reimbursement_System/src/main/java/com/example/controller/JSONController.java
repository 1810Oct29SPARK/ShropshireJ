package com.example.controller;

import javax.servlet.http.HttpServletRequest;

import com.swopsolutions.beans.User;
import com.swopsolutions.service.Service;

public class JSONController {
	
	private static Service serv = new Service();

	public static String byId(HttpServletRequest request) {
		return null;
	}

	public static String userReimbursement(HttpServletRequest request) {
		
		return null;
	}

	public static String allReimbursements(HttpServletRequest request) {
		User  n = (User) request.getSession().getAttribute("loger");
		
		return null;
	}
	public static String getStoredUser(HttpServletRequest request) {
		
		return (String) request.getSession().getAttribute("logee");
	}
	
}