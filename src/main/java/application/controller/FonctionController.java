package application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import application.model.Fonction;
import application.service.Fonctiondao;


@RestController
@RequestMapping("/api/listfonction")
@CrossOrigin

public class FonctionController {
	@Autowired
	Fonctiondao fonctiondao;
	
	@GetMapping
	public List<Fonction> getAllfonction(){
		return fonctiondao.findAll();
	}


}
