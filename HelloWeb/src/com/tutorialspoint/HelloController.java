package com.tutorialspoint;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;

import com.tutorialspoint.dao.UserDAO;
import com.tutorialspoint.domain.User;
import com.tutorialspoint.service.UserService;

@Controller
@RequestMapping("/hello")
public class HelloController{
	ApplicationContext ctx = new ClassPathXmlApplicationContext("user-beans.xml");
    UserService userService = ctx.getBean("userService", UserService.class);
    UserDAO userDAO = (UserDAO) ctx.getBean("userDAO");
    
   
	@RequestMapping(method = RequestMethod.GET)
	   public String MainPage(ModelMap model) {
	      model.addAttribute("message", "Hello Spring MVC Framework!");
	      return "hello";
	   }
   @RequestMapping(value ="/addNewUser",method = RequestMethod.GET)
   public String addNewUser(ModelMap model) {
      model.addAttribute("message", "Adding New User");
      return "addNewUser";
   }
   @RequestMapping(value ="/saveUser",method = RequestMethod.POST)
   public String saveUser(@ModelAttribute("user") User user, ModelMap model) {
	  user.setID((int)(Math.random() * ((5000 - 100) + 1)) + 100);
	  userDAO.save(user);
	   System.out.println("FirstName : " + user.getNAME());
      model.addAttribute("message", "CHello Spring MVC Framework!");
      return "hello";
   }
   
   @RequestMapping(value ="/dispAllUsers",method = RequestMethod.GET)
   public String dispAllUsers(ModelMap model) {
		
	  Map<String, String> resultMap = userDAO.getAllUsers();
      model.addAttribute("resultMap", resultMap);
      return "displayUsers";
   }

}