package com.main.webapp.controller;

import com.main.webapp.entity.User;

public interface UserService {

public	User saveUserDetails(User u);

public  Iterable<User> getAllUsers(int pageNumber);
	

}
