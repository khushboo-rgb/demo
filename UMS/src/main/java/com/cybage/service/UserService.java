package com.cybage.service;


import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybage.Repository.UserRepository;
import com.cybage.controller.UserController;
import com.cybage.model.User;

@Service
public class UserService {
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	@Autowired 
	private UserRepository userRepository;


	/*public List<User> getAllUser() {
		List<User> empList = new ArrayList<User>();
		userRepository.findAll().forEach(empList::add);
		// it will show the mock data and wont hit the actual db System.out.println("user" + empList);
		return empList;
	}*/

  public List<User> getAllUser() {
		
	  List<User> userList =userRepository.findAll();
		return userList;
	}

	public User addUsers(User user) {
		
		return userRepository.save(user);
	}


	public Optional<User> getSingleUserById(Long id) {
		
		 return userRepository.findById(id);
	}

	 public void updateUser(User user, Long id)
	 {
		
		 userRepository.save(user);
	 }

	public void deleteUserById(Long id) {
	
		userRepository.deleteById(id);
		
	}
	
	public User getByUsername(String username) {
		
		return userRepository.findByUsername(username);
	}

	public User getByUsernameAndRoles(String username, String roles) {
		
		return userRepository.findByUsernameAndRoles(username, roles);
	}

	

	public  List<User> getUserByRole(String roles) {
		
		List<User> userList =userRepository.findUserByRoles(roles);
		logger.info("Mock data"+ userList);
		return  userList;
		
	}

	

	/*public void deleteUsers(User user) {
		userRepository.delete(user);
		
	}*/



	

}
