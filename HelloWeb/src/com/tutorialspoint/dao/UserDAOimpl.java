package com.tutorialspoint.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import com.tutorialspoint.config.MyDataSource;
import com.tutorialspoint.domain.User;


public class UserDAOimpl implements UserDAO{
	
	@Override
	public void save(User user) {
		MyDataSource datasource = new MyDataSource();
		System.out.println("Chello world");
		String query = "INSERT INTO \"contactAppSchema\".USER (ID,NAME,ADDRESS) VALUES (?, ?,?);" ;
		PreparedStatement ps = null;
		try {
			Connection con = datasource.getMyConnection();
			ps = con.prepareStatement(query);
			ps.setInt(1, user.getID());
			ps.setString(2, user.getNAME());
			ps.setString(3, user.getADDRESS());
			int out = ps.executeUpdate();
			if(out !=0){
				System.out.println("Employee saved with id="+user.getID());
				ps.close();
				con.close();
			}else System.out.println("Employee save failed with id="+user.getID());
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

	@Override
	public Map<String, String> getAllUsers() {
		MyDataSource datasource = new MyDataSource();
		Map<String, String> resultMap = null ;
		String query = "SELECT * FROM \"contactAppSchema\".USER;" ;
		try {
			Connection con = datasource.getMyConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while ( rs.next() ) {
	            String  name = rs.getString("name");
	            String  address = rs.getString("address");
	            resultMap.put(name, address) ;
	         }
			con.close();
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultMap;
	}
	

}



