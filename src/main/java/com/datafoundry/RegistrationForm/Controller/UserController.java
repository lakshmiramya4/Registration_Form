package com.datafoundry.RegistrationForm.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.datafoundry.RegistrationForm.ModelClass.User;
import com.datafoundry.RegistrationForm.Service.UserService;


@Controller
public class UserController {

	
	@Autowired
	UserService service;
	
	@RequestMapping("/home")
	public String home() {
	return "Registration";
	}
	
   @RequestMapping(value="/reg",method = RequestMethod.POST)
	public String saveUser(@ModelAttribute("User")User user,ModelMap modelmap ) {
	User registrationSaved = service.saveUser(user);
					
		modelmap.addAttribute("msg", "Saved Successfully");
		return "Registration";
	
	  
}
}
