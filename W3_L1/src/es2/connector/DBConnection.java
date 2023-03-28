package es2.connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import es2.model.Student;

public class DBConnection {
	private String url = "jdbc:postgresql://localhost:5432/";
	private String dbname = "W3_L2";
	private String username = "postgres";
	private String password = "root";
	private Statement st;

	public DBConnection() throws SQLException {
		Connection conn = DriverManager.getConnection(url + dbname, username, password);
		st = conn.createStatement();
		createTableStudent();
	}

	private void createTableStudent() throws SQLException {
		String sql = "CREATE TABLE SHOOL_STUDENTS ("
				+ "	ID SERIAL PRIMARY KEY,"
				+ "	NAME VARCHAR(20) NOT NULL,"
				+ "	LASTNAME VARCHAR(20) NOT NULL,"
				+ "	GENDER CHAR(1) NOT NULL,"
				+ "	BIRTHDATE DATE NOT NULL,"
				+ "	AVG FLOAT,"
				+ "	MIN_VOTE FLOAT,"
				+ "	MAX_VOTE FLOAT"
				+ "); ";
		st.execute(sql);
	}

	public void insertStudent(Student s) throws SQLException {
		String sql = "INSERT INTO SHOOL_STUDENTS S (" + "	NAME, LASTNAME, GENDER, S.birthdate, S.avg, s.min_vote,"
				+ "	s.max_vote"
				+ ") VALUES ("
				+ "'" + s.getName() + "'," 
				+ "'" + s.getLastname() + "'," 
				+ "'" + s.getGender() + "'," 
				+ "'" + s.getBirthdate() + "',"
				+ "'" + s.getAvg() + "',"
				+ "'" + s.getMin_vote() + "',"
				+ "'" + s.getMax_vote() + "',"
				
				+ ")";
		st.execute(sql);
	}
	
	
}
