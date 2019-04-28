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

import com.adaming.model.Evenement;
import com.adaming.service.IEvenementService;

@RestController
@RequestMapping("/evenement")
@CrossOrigin
public class EvenementController {
	
	@Autowired
	IEvenementService evenementService;
	
	
	@PostMapping(value = "/ajoutEven", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Evenement save(@RequestBody Evenement evnement) {
		return this.evenementService.save(evnement);
		}
	
	
	@PutMapping(value = "/{idEven}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Evenement update(@RequestBody Evenement evnement, @PathVariable int idEven) {
		if (evenementService.findById(idEven) == null) {
			return null;
		}
		else {
			return evenementService.save(evnement);
		}	
	}
	
	@DeleteMapping(value = "/{idEven}", produces = MediaType.APPLICATION_JSON_VALUE)
	public void delete(@PathVariable int idEven) {
		if (evenementService.findById(idEven) != null) {
			evenementService.delete(evenementService.findById(idEven));
		}
	}
	
	@GetMapping(value = "/{idEven}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Evenement findById(@PathVariable int idEven) {
		return evenementService.findById(idEven);
	}
	
	@GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Evenement> findAll() {
		return evenementService.findAll();
	}

}
