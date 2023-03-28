package Main;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import es2.connector.DBConnection;

public class Main {

	public static void main(String[] args) {
		try {
			DBConnection conn = new DBConnection();
//			conn.insertStudent(new Student("Amarino", "Mallo", 'm', LocalDate.of(1995, 10, 20), 20f, 18f, 25f));
//			conn.insertStudent(new Student("Maccio", "Capatonda", 'm', LocalDate.of(1984, 9, 15), 22f, 20f, 27f));
//			conn.deleteStudent(1);
			System.out.println("miglior studente:\n" + conn.getBest().toString());
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("name", "Piero");
			conn.updateStudent(2, map);


		} catch (SQLException e) {
			System.out.println("errore SQL:\n" + e.getMessage());
			e.printStackTrace();
		}

	}

}
