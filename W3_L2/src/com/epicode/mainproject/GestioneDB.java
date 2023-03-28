package com.epicode.mainproject;

import java.sql.SQLException;

import org.epicode.connector.DBConnection;

import com.epicode.model.User;

public class GestioneDB {

	public static void main(String[] args) {

		try {
			DBConnection dbconn = new DBConnection();
			User u = new User("alessandro", "del piero", 42, "de-rossi@mail.it");
			dbconn.createUser(u);
			dbconn.findAllUsers().forEach(e -> System.out.println(e.toString()));

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
