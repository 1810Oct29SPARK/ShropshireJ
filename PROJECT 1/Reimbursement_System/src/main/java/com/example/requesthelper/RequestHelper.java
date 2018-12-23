package com.example.requesthelper;

import javax.servlet.http.HttpServletRequest;

import com.example.controller.JSONController;
import com.example.controller.ReimbursementsController;
import com.example.controller.UserController;

public class RequestHelper {

//	public static UserController lc = new UserController();

	public static String process(HttpServletRequest req) {

		switch (req.getRequestURI()) {
		case "html/index":
			System.out.println("We are in the index");
			return "html/index.html";
		case "/Reimbursement_System/login.serv":
			System.out.println("we in the login serv");
			return UserController.login(req);
		case "/Reimbursement_System/getsessionuser.json":
			System.out.println("we are in session user profile");
			return JSONController.getStoredUser(req);
		case "/Reimbursement_System/ticket.serv":
			System.out.println("we submitted a Reimbursements");
			return ReimbursementsController.newReimbursement(req);
		case "/Reimbursement_System/getuserreimbursement.json":
			System.out.println("Here are our Reimbursements");
			return ReimbursementsController.allReimbursements(req);
			case "/Reimbursement_System/approve.serv":
			return ReimbursementsController.approve(req);
			case "/Reimbursement_System/deny.serv":
				return ReimbursementsController.deny(req);
		default:
			return "indexhtml";// gonna change this soon g

		}

	}

}