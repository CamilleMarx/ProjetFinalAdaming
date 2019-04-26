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
	
	
	@PostMapping(value = "/ajoutAnim", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public FicheAnimal save(@RequestBody FicheAnimal ficheAnimal) {
		System.out.println(ficheAnimal.getNomAnim());
		return this.ficheAnimalService.save(ficheAnimal);
		}
	
	
	@PutMapping("/{idAnim}")
	public FicheAnimal update(@RequestBody FicheAnimal ficheAnimal, @PathVariable int idAnim) {
		if (ficheAnimalService.findById(idAnim) == null) {
			return null;
		}
		else {
			return ficheAnimalService.save(ficheAnimal);
		}	
	}
	
	@DeleteMapping("/{idAnim}")
	public void delete(@PathVariable int idAnim) {
		if (ficheAnimalService.findById(idAnim) != null) {
			ficheAnimalService.delete(ficheAnimalService.findById(idAnim));
		}
	}
	
	@GetMapping(value = "/{idAnim}")
	public FicheAnimal findById(@PathVariable int idAnim) {
		return ficheAnimalService.findById(idAnim);
	}
	
	@GetMapping(value = "/all")
	public List<FicheAnimal> findAll() {
		return ficheAnimalService.findAll();
	}

}
