package com.datafoundry.RegistrationForm.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.datafoundry.RegistrationForm.ModelClass.User;
import com.datafoundry.RegistrationForm.Repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository repo;
	
	@Override
	public User saveUser(User user) {
		return repo.save(user);
	}
}
