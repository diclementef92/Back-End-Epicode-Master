package pkg;

import java.time.LocalDate;

import dao.EventoDAO;
import model.Evento;

public class Main {

	public static void main(String[] args) {

		System.out.println("-Gestione eventi-");
		Evento e = new Evento();
		e.setTitolo("festa");
		e.setDescrizione("festa a casa di Lidia");
		e.setDataEvento(LocalDate.of(2023, 03, 30));
		System.out.println(e);
		EventoDAO dao = new EventoDAO();
		dao.getById(1L);

		System.out.println("fine");
	}

}
