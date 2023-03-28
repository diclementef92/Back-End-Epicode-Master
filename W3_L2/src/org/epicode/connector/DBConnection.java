package org.epicode.connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.epicode.model.User;

public class DBConnection {

	private String url = "jdbc:postgresql://localhost:5432/";
	private String dbname = "W3_L2";
	private String username = "postgres";
	private String password = "root";
	private Statement st;

	public DBConnection() throws SQLException {
		Connection conn = DriverManager.getConnection(url + dbname, username, password);
		st = conn.createStatement();
		createTabUser();
	}

	public void createTabUser() throws SQLException {
		String sql = "CREATE TABLE IF NOT EXISTS Users (" + "id_user SERIAL PRIMARY KEY, " + "nome VARCHAR NOT NULL, "
				+ "cognome VARCHAR NOT NULL, " + "anni INT2 NOT NULL, " + "email VARCHAR NOT NULL UNIQUE)";

		st.executeUpdate(sql);
	}

	public void createUser(User u) throws SQLException {
		String sql = "INSERT INTO Users (nome, cognome, anni, email) " + "VALUES ('" + u.getNome() + "', '"
				+ u.getCognome() + "', " + u.getAnni() + ", '" + u.getEmail() + "')";
		st.execute(sql);
		System.out.println("Utente creato!");
	}

	public User findUser(Integer id) throws SQLException {
		String sql = "SELECT * FROM USERS WHERE id_user = " + id;
		ResultSet rs = st.executeQuery(sql);
		User utente = null;
		if (rs.next()) {
			Long idUser = rs.getLong("id_user");
			String nome = rs.getString("nome");
			String cognome = rs.getString("cognome");
			Integer anni = rs.getInt("anni");
			String email =  rs.getString("email");
			utente = new User(idUser, nome, cognome, anni, email);
		}

		return utente;
	}

	public void updateUser(User u) throws SQLException {
		String sql = "UPDATE Users SET nome='" + u.getNome() + "', cognome='" + u.getCognome() + "', anni="
				+ u.getAnni() + ", email='" + u.getEmail() + "' where id_user = " + u.getId();
		st.execute(sql);
	}

	public void deleteUser(User u) throws SQLException {
		String sql = "DELETE FROM Users WHERE id_user = " + u.getId();
		st.execute(sql);
	}

	public List<User> findAllUsers() throws SQLException {
		String sql = "SELECT * FROM USERS";
		ResultSet rs = st.executeQuery(sql);
		List<User> utenti = new ArrayList<User>();
		while (rs.next()) {
			Long idUser = rs.getLong("id_user");
			String nome = rs.getString("nome");
			String cognome = rs.getString("cognome");
			Integer anni = rs.getInt("anni");
			String email = rs.getString("email");
			User utente = new User(idUser, nome, cognome, anni, email);
			utenti.add(utente);
		}
		return utenti;
	}
}
