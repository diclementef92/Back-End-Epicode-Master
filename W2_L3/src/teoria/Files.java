package teoria;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;

public class Files {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		File f = new File("text.txt");
		
		try {
			System.out.println("scrivi testo:");
			String testoInput = s.nextLine();
			FileUtils.writeStringToFile(f, testoInput, StandardCharsets.UTF_8);

			String testoOutput = FileUtils.readFileToString(f, StandardCharsets.UTF_8);			
			System.out.println(testoOutput);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
