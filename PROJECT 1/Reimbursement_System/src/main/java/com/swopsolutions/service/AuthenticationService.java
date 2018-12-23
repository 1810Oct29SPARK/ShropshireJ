package com.swopsolutions.service;

import com.swopsolutions.beans.Credentials;
import com.swopsolutions.beans.User;

public class AuthenticationService {
	public AuthenticationService() {
	}
	
	public User isValidUser(Credentials credentials) {
		User u = null;
		
		String username = credentials.getUsername();
		String password = credentials.getPassword();
		//this is AUTHENTICATION (does the user exist in the system?)
		//now AUTHORIZATION (what can the user access within the system?) (user roles)
		//take credentials and return the User to which they belong if it exists
		if (username != null && password != null) {
			//for now... this is fake!! 
			{
				
			}
			
		}
		return u;
	}
	

}