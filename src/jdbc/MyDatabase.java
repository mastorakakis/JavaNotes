package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MyDatabase {

	private final String URL;
	private final String USERNAME;
	private final String PASS;
	private String query;

	private Connection conn;
	private PreparedStatement pst;
	private ResultSet rs;

	public MyDatabase(String URL, String USERNAME, String PASS, String query) {
		this.URL = URL;
		this.USERNAME = USERNAME;
		this.PASS = PASS;
		this.query = query;
	}

	// Execute update
	public PreparedStatement MyPreparedStatement() {
		try {
			conn = DriverManager.getConnection(URL, USERNAME, PASS);
			pst = conn.prepareStatement(query);
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return pst;
	}

	// Execute update by id
	public PreparedStatement MyPreparedStatement(int id) {
		try {
			conn = DriverManager.getConnection(URL, USERNAME, PASS);
			pst = conn.prepareStatement(query);
			pst.setInt(1, id);
			int result = pst.executeUpdate();
			if (result > 0) {
				System.out.println("Success");
			} else {
				System.out.println("Id " + id + " was not found");
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return pst;
	}

	// Execute query
	public ResultSet MyResultSet() {
		try {
			conn = DriverManager.getConnection(URL, USERNAME, PASS);
			pst = conn.prepareStatement(query);
			rs = pst.executeQuery();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return rs;
	}

	// Execute query by id
	public ResultSet MyResultSet(int id) {

		try {
			conn = DriverManager.getConnection(URL, USERNAME, PASS);
			pst = conn.prepareStatement(query);
			pst.setInt(1, id);
			rs = pst.executeQuery();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return rs;
	}

	public void closeConnections() {
		try {
			if (rs != null) {
				rs.close();
			}
			if (pst != null) {
				pst.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
}
