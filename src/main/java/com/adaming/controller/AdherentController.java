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

import com.adaming.model.Adherent;
import com.adaming.service.IAdherentService;

@RestController
@RequestMapping("/adherent")
@CrossOrigin
public class AdherentController {
	
	@Autowired
	IAdherentService adherentService;
	
	
	@PostMapping(value = "/ajoutAdherent", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Adherent save(@RequestBody Adherent adherent) {
		return this.adherentService.save(adherent);
		}
	
	
	@PutMapping(value = "/{idAdherent}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Adherent update(@RequestBody Adherent adherent, @PathVariable int idAdherent) {
		if (adherentService.findById(idAdherent) == null) {
			return null;
		}
		else {
			return adherentService.save(adherent);
		}	
	}
	
	@DeleteMapping(value = "/{idAdherent}", produces = MediaType.APPLICATION_JSON_VALUE)
	public void delete(@PathVariable int idAdherent) {
		if (adherentService.findById(idAdherent) != null) {
			adherentService.delete(adherentService.findById(idAdherent));
		}
	}
	
	@GetMapping(value = "/{idAdherent}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Adherent findById(@PathVariable int idAdherent) {
		return adherentService.findById(idAdherent);
	}
	
	@GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Adherent> findAll() {
		return adherentService.findAll();
	}

}
