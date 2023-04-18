package com.progetto.gestioneprenotazioni.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.progetto.gestioneprenotazioni.exception.LanguageNotFound;

@Controller
@RequestMapping("/")
@PropertySource("classpath:application.properties")
public class DemoController {

	@Value("${info.text.en}")
	private String textInfoEnglish;
	@Value("${info.text.it}")
	private String textInfoItalian;

	@GetMapping("/")
	public @ResponseBody String homepage() {
		return "homepage";
	}

	@GetMapping("/info/{lang}")
	public ResponseEntity<String> getInfo(@PathVariable String lang) throws LanguageNotFound {
		ResponseEntity<String> resp = null;
		switch (lang) {
		case "it":
			resp = new ResponseEntity<String>(textInfoItalian, HttpStatus.OK);
			break;
		case "en":
			resp = new ResponseEntity<String>(textInfoEnglish, HttpStatus.OK);
			break;

		default:
			throw new LanguageNotFound();
		}
		
		return resp;
	}

}
