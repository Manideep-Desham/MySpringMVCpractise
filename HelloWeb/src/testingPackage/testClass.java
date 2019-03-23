package testingPackage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tutorialspoint.dao.UserDAO;
import com.tutorialspoint.domain.User;
import com.tutorialspoint.service.UserService;

public class testClass {

	public static void main(String[] args) {
		
		 /*ApplicationContext ctx = new ClassPathXmlApplicationContext(
	                "user-beans.xml");
		 UserService userService = (UserService) ctx.getBean("userService");
		 userService.saveUser(null) ;*/
		 
		 ApplicationContext ctx = new ClassPathXmlApplicationContext("user-beans.xml");
		 UserDAO userDAO = (UserDAO) ctx.getBean("userDAO");
		
		 userDAO.getAllUsers();
		

	}

}
