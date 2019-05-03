package com.adaming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adaming.model.FicheAnimal;
import com.adaming.service.IFicheAnimalService;


@RestController
@RequestMapping("/ficheAnimal")
@CrossOrigin
public class FicheAnimalController {
	
	@Autowired
	IFicheAnimalService ficheAnimalService;
	
		
	public FicheAnimalController() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public FicheAnimalController(IFicheAnimalService ficheAnimalService) {
		super();
		this.ficheAnimalService = ficheAnimalService;
	}


	@PostMapping(value = "/ajoutAnim", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public FicheAnimal save(@RequestBody FicheAnimal ficheAnimal) {
		System.out.println(ficheAnimal.getNomAnim());
		return this.ficheAnimalService.save(ficheAnimal);
		}
	
	
	@PutMapping(value = "/{idAnim}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public FicheAnimal update(@RequestBody FicheAnimal ficheAnimal, @PathVariable int idAnim) {
		if (ficheAnimalService.findById(idAnim) == null) {
			return null;
		}
		else {
			return ficheAnimalService.save(ficheAnimal);
		}	
	}
	
	@DeleteMapping(value = "/{idAnim}", produces = MediaType.APPLICATION_JSON_VALUE)
	public void delete(@PathVariable int idAnim) {
		if (ficheAnimalService.findById(idAnim) != null) {
			ficheAnimalService.delete(ficheAnimalService.findById(idAnim));
		}
	}
	
	@GetMapping(value = "/{idAnim}", produces = MediaType.APPLICATION_JSON_VALUE)
	public FicheAnimal findById(@PathVariable int idAnim) {
		return ficheAnimalService.findById(idAnim);
	}
	
	@GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<FicheAnimal> findAll() {
		return ficheAnimalService.findAll();
	}
	
	@GetMapping(value = "/findByRaceName/{race}/{name}" , produces = MediaType.APPLICATION_JSON_VALUE)
	public List<FicheAnimal> findByRaceNName(@PathVariable String race, @PathVariable String name){
		return ficheAnimalService.findByRaceNName( race,  name);
	}

	@GetMapping(value = "/findByRaceSexeLieuPrefere/{race}/{sexe}/{lieuPrefere}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<FicheAnimal> findByRaceAndSexeAndLieuPrefere(@PathVariable String race, @PathVariable Boolean sexe, @PathVariable String lieuPrefere) {
		if (race != null && sexe != null && lieuPrefere != "null") {
			return ficheAnimalService.findByRaceAndSexeAndLieuPrefere(race, sexe, lieuPrefere);
		}
//		else if (race != null && sexe != null) {
		if (lieuPrefere.equals("null")) {
			return ficheAnimalService.findByRaceAndSexe(race, sexe);
		}
		else {
			return null;
		}
	}
	
}
