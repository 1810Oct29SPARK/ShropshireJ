package com.example.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.swopsolutions.beans.Reimbursements;
import com.swopsolutions.beans.User;
import com.swopsolutions.service.Service;

public class ReimbursementsController {

	private static Service serv = new Service();

	public static String newReimbursement(HttpServletRequest req) {

		int type = Integer.parseInt(req.getParameter("type"));
		double amount = Double.parseDouble(req.getParameter("amount"));
		String description = req.getParameter("description");
		User n = (User) req.getSession().getAttribute("loger");
		int j = serv.newReimbursement(description, amount, null, n.getUser_id(), type);

		return "employeereimbursementticket.html";
	}

	public static String allReimbursements(HttpServletRequest req) {
		System.out.println("We are in all reimbursements");
		User currentUser = (User) req.getSession().getAttribute("loger");
		
		String empty = "";
		List<Reimbursements> r = null;

		if (currentUser.getRole_id() == 2) {
			
			r = serv.allReimbursement();
			System.out.println(r);
		} else {
			r = serv.userReimbursement(currentUser.getUser_id());
			System.out.println("In user reimbursements");
			System.out.println(r);
		}
		try {
			empty = new ObjectMapper().writeValueAsString(r);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}

		return empty;
	}
   public static String approve(HttpServletRequest req) {
	 
	   try {
	    	String payload= req.getReader().readLine();
	    	String[] pays=payload.split("=");
	    	System.out.println(pays[1]);
//	    	int id = Integer.parseInt(req.getParameter("r_id"));
	 	   User u =(User) req.getSession().getAttribute("loger");
	 	   serv.approve(Integer.parseInt(pays[1]) , u.getUser_id(), u.getRole_id());
//			System.out.println(req.getReader().readLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   return " ";
   }
   public static String deny(HttpServletRequest req) {
	    try {
	    	String payload= req.getReader().readLine();
	    	String[] pays=payload.split("=");
	    	System.out.println(pays[1]);
//	    	int id = Integer.parseInt(req.getParameter("r_id"));
	 	   User u =(User) req.getSession().getAttribute("loger");
	 	   serv.deny(Integer.parseInt(pays[1]) , u.getUser_id(), u.getRole_id());
//			System.out.println(req.getReader().readLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   
	   return " ";
   }
}


