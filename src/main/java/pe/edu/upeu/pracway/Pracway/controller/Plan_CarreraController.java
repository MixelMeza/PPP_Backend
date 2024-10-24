package pe.edu.upeu.pracway.Pracway.controller;

import java.util.List;


import java.util.NoSuchElementException;
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
import pe.edu.upeu.pracway.Pracway.entity.Plan_Carrera;
import pe.edu.upeu.pracway.Pracway.service.Plan_CarreraService;

@RestController
@RequestMapping("/api/plan_carrera")
public class Plan_CarreraController {
	@Autowired
	private Plan_CarreraService plan_carreraService;
	
	@GetMapping
	public ResponseEntity<List<Plan_Carrera>> readAll(){
		try {
			List<Plan_Carrera> plan_carrera = plan_carreraService.readAll();
			if(plan_carrera.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(plan_carrera, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@PostMapping
	public ResponseEntity<Plan_Carrera> crear(@Valid @RequestBody Plan_Carrera pla){
		try {
			plan_carreraService.create(pla);
			return new ResponseEntity<>(HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@GetMapping("/{id}")
	public ResponseEntity<Plan_Carrera> getPlan_CarreraId(@PathVariable("id") Long id){
		try {
			Plan_Carrera p = plan_carreraService.read(id).get();
			return new ResponseEntity<>(p, HttpStatus.CREATED);

		} catch (NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Plan_Carrera> delPlan_Carrera(@PathVariable("id") Long id){
		try {
			plan_carreraService.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@PutMapping("/{id}")
	public ResponseEntity<?> updatePlan_Carrera(@PathVariable("id") Long id, @Valid @RequestBody Plan_Carrera pla){

			Optional<Plan_Carrera> p = plan_carreraService.read(id);
			if(p.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);	 
		    } else {
		    	plan_carreraService.update(pla);
		    	return new ResponseEntity<>( HttpStatus.OK);
		    }
		
	}
}