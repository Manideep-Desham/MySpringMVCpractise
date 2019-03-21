package testingPackage;

import com.tutorialspoint.dao.UserDAOimpl;
import com.tutorialspoint.domain.User;

public class testingSave {
	public static void main(String[] args){
		User u = new User();
		u.setID(4);
		u.setNAME("Karthik");
		u.setADDRESS("Mumbai");
		
		UserDAOimpl udi = new UserDAOimpl();
		udi.save(u);
	}
}
