package pe.edu.upeu.pracway.Pracway.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import pe.edu.upeu.pracway.Pracway.entity.PPP;
import pe.edu.upeu.pracway.Pracway.service.PPPService;


@RestController
@RequestMapping("/api/ppp")
public class PPPController{
	
  
	@Autowired
	private PPPService pppService;
	@GetMapping
	public ResponseEntity<List<PPP>> readAll(){
		try {
			List<PPP> ppp = pppService.readAll();
			if(ppp.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(ppp, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@PostMapping
	public ResponseEntity<PPP> crear(@Valid @RequestBody PPP ppp){
		try {
			PPP p = pppService.create(ppp);
			return new ResponseEntity<>(p, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@GetMapping("/{id}")
	public ResponseEntity<PPP> getPPPId(@PathVariable("id") Long id){
		try {
			PPP p = pppService.read(id).get();
			return new ResponseEntity<>(p, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<PPP> delPPP(@PathVariable("id") Long id){
		try {
			pppService.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@PutMapping("/{id}")
	public ResponseEntity<?> updatePPP(@PathVariable("id") Long id, @Valid @RequestBody PPP ppp){

		Optional<PPP> p = pppService.read(id);
			if (p.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
				

			} else {
				return new ResponseEntity<>(pppService.update(ppp), HttpStatus.OK);
			}
		
	}
}
