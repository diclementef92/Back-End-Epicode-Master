package com.progetto.gestioneprenotazioni.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import com.progetto.gestioneprenotazioni.exception.LanguageNotFound;

@Service
@PropertySource("classpath:application.properties")
public class InfoService {
	@Value("${info.text.en}")
	private String textInfoEnglish;
	@Value("${info.text.it}")
	private String textInfoItalian;

	// Restituisce le informazioni data una lingua
	// @param lang: iniziali della lingua
	public String getInfo(String lang) throws LanguageNotFound {
		String text = "";
		switch (lang) {
		case "it":
			text = textInfoItalian;
			break;
		case "en":
			text = textInfoEnglish;
			break;

		default:
			throw new LanguageNotFound();
		}

		return text;
	}
}
