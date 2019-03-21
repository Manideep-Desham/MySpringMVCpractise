package testingPackage;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.tutorialspoint.config.MyDataSource;

public class JDBCExample {

	public static void main(String[] argv) throws ClassNotFoundException, SQLException {
		MyDataSource datasource = new MyDataSource();
		String query = "SELECT * FROM \"contactAppSchema\".USER;" ;
		try {
			Connection con = datasource.getMyConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while ( rs.next() ) {
	            String  name = rs.getString("name");
	            System.out.println(name);
	         }
			con.close();
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
			
	}

}