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
import pe.edu.upeu.pracway.Pracway.entity.Evaluacion;
import pe.edu.upeu.pracway.Pracway.service.EvaluacionService;

@RestController
@RequestMapping("/api/evaluaciones")
public class EvaluacionController {
	
	@Autowired
	private EvaluacionService evaluacionService;
	
	@GetMapping
	public ResponseEntity<List<Evaluacion>> readAll(){
		try {
			List<Evaluacion> evaluaciones = evaluacionService.readAll();
			if(evaluaciones.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(evaluaciones, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@PostMapping
	public ResponseEntity<Evaluacion> crear(@Valid @RequestBody Evaluacion eval){
		try {
			Evaluacion e = evaluacionService.create(eval);
			return new ResponseEntity<>(e, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@GetMapping("/{id}")
	public ResponseEntity<Evaluacion> getEvaluacionId(@PathVariable("id") Long id){
		try {
			Evaluacion e = evaluacionService.read(id).get();
			return new ResponseEntity<>(e, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Evaluacion> delEvaluacion(@PathVariable("id") Long id){
		try {
			evaluacionService.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@PutMapping("/{id}")
	public ResponseEntity<?> updateEvaluacion(@PathVariable("id") Long id, @Valid @RequestBody Evaluacion eval){

			Optional<Evaluacion> e = evaluacionService.read(id);
			if(e.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			} else {
				return new ResponseEntity<>(evaluacionService.update(eval), HttpStatus.OK);
			}		
		
	}
}
