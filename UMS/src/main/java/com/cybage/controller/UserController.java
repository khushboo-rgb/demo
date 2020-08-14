package com.cybage.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.cybage.model.User;
import com.cybage.service.UserService;


@RestController
public class UserController {

	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	@Autowired
    private UserService userService;
	
    @GetMapping("/")
    		public String helloController()
    		{
    	      return ("<h1>hello Controller</h1>");
    		}
	
	@RequestMapping("/getAllUser")
	public List<User>getAllUser()  
	{
		logger.info("get all user");
		return userService.getAllUser();
	}
	
	@RequestMapping("/getSingleUser/{id}")
	public Optional<User> getSingleUser(@PathVariable Long id) {
		logger.info("get single user");
		return userService.getSingleUserById(id);
		
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/addUser")
    public User addUser(@RequestBody User user)
    {
		logger.info("add all user");
		return userService.addUsers(user);
    }
	
	@RequestMapping(method=RequestMethod.DELETE,value="/deleteUser/{id}")
	public void deleteUser(@PathVariable Long id)
	{
		logger.info("delete a user user");
				
		userService.deleteUserById(id);
			
	}
	/*
	@RequestMapping(method=RequestMethod.DELETE,value="/deleteUsers")
	public User deleteAllUser(@RequestBody User user)
	{
		logger.info("delete a user user");
				
		userService.deleteUsers(user);
		return user;
			
	}*/
	

	@RequestMapping(method=RequestMethod.GET,value="/getUserByUsername/{username}")
	public User getUserByUsername(@PathVariable String username)
	{
		logger.info("getUserByUsername");
		return userService.getByUsername(username);
		
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/getUserByRoles/{roles}")
	public List<User> getUserByRoles(@PathVariable String roles)
	{
		logger.info("getUserByRoles");
		return  userService.getUserByRole(roles);
		
	}
	
	
	@RequestMapping(method=RequestMethod.GET,value="/getUserByUsernameAndRoles/{username},{roles}")
	public User getUserByUsernameAndRoles(@PathVariable String username, @PathVariable String roles)
	{
		logger.info(" getUserByUsernameAndRoles");
		return userService.getByUsernameAndRoles(username,roles);
		
	}
}	
