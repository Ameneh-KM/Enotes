package com.uwl.service;

import com.uwl.entity.User;

public interface UserService {

	public User saveUser(User user);

	public boolean existEmailCheck(String email);
	
	//added

}
