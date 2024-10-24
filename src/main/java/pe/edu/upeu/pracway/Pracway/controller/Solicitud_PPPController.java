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
import pe.edu.upeu.pracway.Pracway.entity.Solicitud_PPP;
import pe.edu.upeu.pracway.Pracway.service.Solicitud_PPPService;

@RestController
@RequestMapping("/api/solicitud_ppp")
public class Solicitud_PPPController {
	
	@Autowired
	private Solicitud_PPPService solicitud_PPPService;
	
	@GetMapping
	public ResponseEntity<List<Solicitud_PPP>> readAll(){
		try {
			List<Solicitud_PPP> solicitud_PPP = solicitud_PPPService.readAll();
			if(solicitud_PPP.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(solicitud_PPP, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@PostMapping
	public ResponseEntity<Solicitud_PPP> crear(@Valid @RequestBody Solicitud_PPP sol){
		try {
			Solicitud_PPP s = solicitud_PPPService.create(sol);
			return new ResponseEntity<>(s, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@GetMapping("/{id}")
	public ResponseEntity<Solicitud_PPP> getSolicitud_PPPId(@PathVariable("id") Long id){
		try {
			Solicitud_PPP s = solicitud_PPPService.read(id).get();
			return new ResponseEntity<>(s, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Solicitud_PPP> delSolicitud_PPP(@PathVariable("id") Long id){
		try {
			solicitud_PPPService.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@PutMapping("/{id}")
	public ResponseEntity<?> updateSolicitud_PPP(@PathVariable("id") Long id, @Valid @RequestBody Solicitud_PPP sol){

			Optional<Solicitud_PPP> s = solicitud_PPPService.read(id);
			if(s.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}else {
				
				return new ResponseEntity<>(solicitud_PPPService.update(sol), HttpStatus.OK);
			}		
		
	}
}
