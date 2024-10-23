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

import pe.edu.upeu.pracway.Pracway.entity.Estudiante;
import pe.edu.upeu.pracway.Pracway.service.EstudianteService;

	@RestController
	@RequestMapping("/api/estudiante")
	public class EstudianteController {
		@Autowired
		private EstudianteService estudianteService;
		
		@GetMapping
		public ResponseEntity<List<Estudiante>> readAll(){
			try {
				List<Estudiante> Estudiante = estudianteService.readAll();
				if(Estudiante.isEmpty()) {
					return new ResponseEntity<>(HttpStatus.NO_CONTENT);
				}
				return new ResponseEntity<>(Estudiante, HttpStatus.OK);
			} catch (Exception e) {
				// TODO: handle exception
				return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
			}
			
		}
		@PostMapping
		public ResponseEntity<Estudiante> crear(@Valid @RequestBody Estudiante est){
			try {
				Estudiante e = estudianteService.create(est);
				return new ResponseEntity<>(e, HttpStatus.CREATED);
			} catch (Exception e) {
				// TODO: handle exception
				return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
			}
			
		}
		@GetMapping("/{id}")
		public ResponseEntity<Estudiante> getAlmacenId(@PathVariable("id") Long id){
			try {
				Estudiante e = estudianteService.read(id).get();
				return new ResponseEntity<>(e, HttpStatus.CREATED);
			} catch (Exception e) {
				// TODO: handle exception
				return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
			}
			
		}
		@DeleteMapping("/{id}")
		public ResponseEntity<Estudiante> delEstudiante(@PathVariable("id") Long id){
			try {
				estudianteService.delete(id);
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			} catch (Exception e) {
				// TODO: handle exception
				return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
			}
			
		}
		@PutMapping("/{id}")
		public ResponseEntity<?> updateEstudiante(@PathVariable("id") Long id, @Valid @RequestBody Estudiante est){

				Optional<Estudiante> e = estudianteService.read(id);
				if(e.isEmpty()) {
					return new ResponseEntity<>(HttpStatus.NO_CONTENT);
					
				}else {
					return new ResponseEntity<>(estudianteService.update(est), HttpStatus.OK);
				}		
			
		}
	}
