package com.camargo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.camargo.domaim.User;
import com.camargo.repository.UserRepository;


@Service

public class UserService {
	
	@Autowired
	private UserRepository repo;
	
public List<User> findAll(){
	return repo.findAll();
}

}
