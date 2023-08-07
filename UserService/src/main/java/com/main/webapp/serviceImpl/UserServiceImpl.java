package com.main.webapp.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.main.webapp.controller.UserService;
import com.main.webapp.entity.User;
import com.main.webapp.repository.UserRepository;


@Service
public class UserServiceImpl  implements UserService{
	
	@Autowired UserRepository repository;
	@Override
	public User saveUserDetails(User u) {
		
		return repository.save(u);
	}
	@Override
	public Iterable<User> getAllUsers(int pageNumber) {
		
		Sort s=Sort.by("userName");
		
		Pageable pageable=PageRequest.of(pageNumber, 2,s);
		
		return repository.findAll(pageable);
	}
}
