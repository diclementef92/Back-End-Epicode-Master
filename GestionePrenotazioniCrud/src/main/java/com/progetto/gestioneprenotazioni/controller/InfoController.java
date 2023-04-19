package com.progetto.gestioneprenotazioni.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.progetto.gestioneprenotazioni.exception.LanguageNotFound;
import com.progetto.gestioneprenotazioni.service.InfoService;

@Controller
@RequestMapping("/info")
public class InfoController {

	@Autowired
	private InfoService infoService;


	@GetMapping("/{lang}")
	public ResponseEntity<String> getInfo(@PathVariable String lang) throws LanguageNotFound {
		return new ResponseEntity<String>(infoService.getInfo(lang), HttpStatus.OK);
	}

//	@GetMapping("/")
//	public @ResponseBody String homepage() {
//		return "homepage";
//	}

}
