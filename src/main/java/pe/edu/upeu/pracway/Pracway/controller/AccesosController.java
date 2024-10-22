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
import pe.edu.upeu.pracway.Pracway.entity.Accesos;
import pe.edu.upeu.pracway.Pracway.service.AccesosService;


@RestController
@RequestMapping("/api/accesos")
public class AccesosController {
	@Autowired
	private AccesosService accesosService;
	
	@GetMapping
	public ResponseEntity<List<Accesos>> readAll(){
		try {
			List<Accesos> accesos = accesosService.readAll();
			if(accesos.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(accesos, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@PostMapping
	public ResponseEntity<Accesos> crear(@Valid @RequestBody Accesos acc){
		try {
			accesosService.create(acc);
			return new ResponseEntity<>(HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@GetMapping("/{id}")
	public ResponseEntity<Accesos> getAccesosId(@PathVariable("id") Long id){
		try {
			Accesos a = accesosService.read(id).get();
			return new ResponseEntity<>(a, HttpStatus.CREATED);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Accesos> delAccesos(@PathVariable("id") Long id){
		try {
			accesosService.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@PutMapping("/{id}")
	public ResponseEntity<?> updateAccesos(@PathVariable("id") Long id, @Valid @RequestBody Accesos acc){

			Optional<Accesos> a = accesosService.read(id);
			if(a.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}else {
				accesosService.update(acc);
				return new ResponseEntity<>(HttpStatus.OK);
			}		
		
	}
}
