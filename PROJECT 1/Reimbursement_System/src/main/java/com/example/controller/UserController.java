package com.example.controller;

import javax.servlet.http.HttpServletRequest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.swopsolutions.beans.User;
import com.swopsolutions.service.Service;

public class UserController {

	private static Service serv = new Service();

	public static String login(HttpServletRequest req) {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		//Gotta work on the naming conventions --> serv login is different to this login
		
		//this will only work if the user and pass is already in the database....
		User logee = serv.login(username, password);
		System.out.println(logee);
		//invalid user 
		if (logee == null) {
			return "/invalidUser.html";
		}
		String logees;
		try {
			logees = new ObjectMapper().writeValueAsString(logee);
			System.out.println(logees);
		} catch (JsonProcessingException e) {

			e.printStackTrace();
			return "/index.html";
		}
		req.getSession().setAttribute("loger", logee);
		req.getSession().setAttribute("logee", logees);
//		return "/Reimbursement_System/src/main/webapp/index.html";
		return "/employeeuser.html";
	}

	public static String logout(HttpServletRequest req) {
		req.getSession().invalidate();
		return "index.html";

	}
	
	

}
