package jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MainMyDatabase {

	public static void main(String[] args) {

//		String URL = "jdbc:mysql://localhost:3306/private_school?serverTimezone=UTC";
		String URL = "jdbc:mysql://localhost:3306/private_school?serverTimezone=Europe/Athens";
		String USERNAME = "root";
		String PASS = "mast3815yq";
		String query = "select * from students";
		
		MyDatabase db = new MyDatabase(URL, USERNAME, PASS, query);
		ResultSet rs = db.MyResultSet();
		try {
			rs.first();
			System.out.println(rs.getString(2));
		} catch (SQLException ex) {
			ex.printStackTrace();
		} finally {
			db.closeConnections();
		}

	}

}
