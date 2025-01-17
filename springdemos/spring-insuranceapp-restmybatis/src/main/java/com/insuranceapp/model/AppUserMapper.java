package com.insuranceapp.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

@Component
public class AppUserMapper {

	// convert userdetails to user
	public AppUser convertToAppUser(UserDetails userDetails) {
		String username = userDetails.getUsername();
		String password = userDetails.getPassword();
		userDetails.getAuthorities();
		AppUser appUser = new AppUser();
		appUser.setUserName(username);
		appUser.setPassword(password);
		return appUser;
	}

	// convert appuser to userdetails
	public AppUser convertToUserDetails(AppUser appUser) {
		String username = appUser.getUserName();
		String password = appUser.getPassword();
		List<GrantedAuthority> authorities = new ArrayList<>();
		return appUser;

		// create roles for user
		List<String> roles = Arrays.asList("user", "admin");
		for (String role : roles) {
			//create a simplegranted authority
			SimpleGrantedAuthority simpleGrantedAuthority=new SimpleGrantedAuthority(role);
			
			authorities.add(simpleGrantedAuthority);
		}
		
		UserDetails details=new User(username,password,authorities);
		return details;
	}
}
