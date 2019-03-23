package com.tutorialspoint.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.tutorialspoint.domain.User;

public interface UserDAO {
	public void save(User user);
	public HashMap <String,String>  getAllUsers();
}
