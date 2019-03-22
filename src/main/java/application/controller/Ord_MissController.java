package application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import application.model.Mission;
import application.model.Missionnaire;
import application.model.OrdMis;
import application.service.Missiondao;
import application.service.Ord_MissDao;

@RestController
@RequestMapping("/api/ordMiss")
@CrossOrigin
public class Ord_MissController  {

	@Autowired
	Ord_MissDao ordMissDao;
	
	
	@GetMapping
	public List<OrdMis> getOrds() {
		return ordMissDao. findAll(); 
		
	}
	
	@PostMapping
	public void addOrdMiss(@RequestBody OrdMis ordMiss)
	{
		 ordMissDao.ajouter(ordMiss);
	}
	
	@PutMapping
	public void Modiford(@RequestBody OrdMis o) {
		ordMissDao.updateOrd(o);
		
	}
}
