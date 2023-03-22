package esercizi;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.apache.commons.io.FileUtils;

public class RegistroPresenze {

	private File file;

	/*
	 * Crea file con nome file
	 * 
	 * @param nomefile
	 */
	public RegistroPresenze(String nomefile) {
		try {
			this.file = new File(nomefile);
		} catch (NullPointerException e) {
			System.out.println("errore in RegistroPresenze: nome file non valido");
			e.printStackTrace();
		}
	}

	public void scriviPresenze(Presenza p) {
		try {
			// ultimo parametro append, se true aggiunge al file senza sovrascrivere
			boolean append;
			if (leggiPresenze() == "")
				append = false;
			else
				append = true;

			FileUtils.writeStringToFile(file, p.toString(), StandardCharsets.UTF_8, append);

		} catch (IOException e) {
			System.out.println("errore in scriviPresenze");
			e.printStackTrace();
		}
	}

	public String leggiPresenze() {
		String testo = "";
		try {
			testo = FileUtils.readFileToString(file, StandardCharsets.UTF_8);
			testo = testo.replace("#", "\n").replace("@", " ore: ");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return testo;

	}
}
