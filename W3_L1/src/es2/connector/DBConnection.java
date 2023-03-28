package es2.connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import es2.model.Student;

public class DBConnection {
	private String url = "jdbc:postgresql://localhost:5432/";
	private String dbname = "W3_L1_es2";
	private String username = "postgres";
	private String password = "root";
	private Statement st;

	public DBConnection() throws SQLException {
		Connection conn = DriverManager.getConnection(url + dbname, username, password);
		st = conn.createStatement();
		createTableStudent();
	}

	private void createTableStudent() throws SQLException {
		String sql = "CREATE TABLE IF NOT EXISTS SHOOL_STUDENTS ("
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
		System.out.println("tabella studente creata");
	}

	public void insertStudent(Student s) throws SQLException {
		String sql = "INSERT INTO SHOOL_STUDENTS (" + "	NAME, LASTNAME, GENDER, birthdate, avg, min_vote,"
				+ "	max_vote"
				+ ") VALUES ("
				+ "'" + s.getName().trim().toUpperCase() + "'," + "'" + s.getLastname().trim().toUpperCase() + "',"
				+ "'" + s.getGender() + "'," 
				+ "'" + s.getBirthdate() + "',"
				+ "'" + s.getAvg() + "',"
				+ "'" + s.getMin_vote() + "',"
				+ "'" + s.getMax_vote() + "'"
				+ ")";
		System.out.println("studente inserito");

		st.execute(sql);
	}
	
	public void deleteStudent(int id) throws SQLException {
		String sql = "DELETE FROM SHOOL_STUDENTS where id= " + id;
		st.execute(sql);
		System.out.println("studente con id " + id + " rimosso");
	}
	
	public void updateStudent(int id, Map<String, Object> s) throws SQLException {
		String sql = "";
		for (Entry<String, Object> entry : s.entrySet()) {
			String key = entry.getKey();
			Object val = entry.getValue();
			sql += "UPDATE SHOOL_STUDENTS SET " + key + "='" + val + "' WHERE ID =" + id + " ;\n";
		}
		st.execute(sql);
		System.out.println("studente con id " + id + " aggiornato");
	}

	public Student getBest() throws SQLException {
		String sql = "select * from SHOOL_STUDENTS order by avg desc limit 1";
		ResultSet set = st.executeQuery(sql);
		Student bestStud = null;
		if (set.next()) {
			Long id =set.getLong("id");
			String nome = set.getString("name");
			String cognome = set.getString("lastname");
			char genere = set.getString("gender").charAt(0);
			String nascita = set.getString("birthdate");
			Float media =  set.getFloat("avg");
			Float min =  set.getFloat("min_vote");
			Float max =  set.getFloat("max_vote");

			bestStud = new Student(id, nome, cognome, genere, LocalDate.parse(nascita), media, min, max);
		}
		return bestStud;
	}

	public List<Student> getAllStudents() throws SQLException {
		String sql = "select * from SHOOL_STUDENTS";
		ResultSet set = st.executeQuery(sql);

		List<Student> students = new ArrayList<Student>();

		while (set.next()) {
			Long id = set.getLong("id");
			String nome = set.getString("name");
			String cognome = set.getString("lastname");
			char genere = set.getString("gender").charAt(0);
			String nascita = set.getString("birthdate");
			Float media = set.getFloat("avg");
			Float min = set.getFloat("min_vote");
			Float max = set.getFloat("max_vote");

			students.add(new Student(id, nome, cognome, genere, LocalDate.parse(nascita), media, min, max));
		}
		return students;
	}

	public List<Student> getVoteRangeWithStream(int min, int max) throws SQLException {
		List<Student> students = new ArrayList<Student>();
		students.addAll(getAllStudents());

		return students.stream().filter(e -> e.getMin_vote() >= min && e.getMax_vote() <= max)
				.collect(Collectors.toList());
	}

	public List<Student> getVoteRangeWithQuery(int min, int max) throws SQLException {
		String sql = "select * from SHOOL_STUDENTS where min_vote>=" + min + " and max_vote<=" + max;
		ResultSet set = st.executeQuery(sql);

		List<Student> students = new ArrayList<Student>();

		while (set.next()) {
			Long id = set.getLong("id");
			String nome = set.getString("name");
			String cognome = set.getString("lastname");
			char genere = set.getString("gender").charAt(0);
			String nascita = set.getString("birthdate");
			Float media = set.getFloat("avg");
			Float min_voto = set.getFloat("min_vote");
			Float max_voto = set.getFloat("max_vote");

			students.add(new Student(id, nome, cognome, genere, LocalDate.parse(nascita), media, min_voto, max_voto));
		}
		return students;
	}



}
