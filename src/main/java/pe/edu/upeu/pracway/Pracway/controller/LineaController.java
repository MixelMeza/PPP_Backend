package pe.edu.upeu.pracway.Pracway.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import pe.edu.upeu.pracway.Pracway.entity.Linea;
import pe.edu.upeu.pracway.Pracway.service.LineaService;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@RestController
@RequestMapping("/api/lineas")
public class LineaController {

	@Autowired
	private LineaService service;

	@GetMapping
	public ResponseEntity<List<Linea>> readAll() {
		try {
			List<Linea> Lineas = service.readAll();
			if (Lineas.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(Lineas, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@PostMapping
	public ResponseEntity<Linea> crearLinea(@Valid @RequestBody Linea lin) {
		try {
			service.create(lin);
			return new ResponseEntity<>(HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@GetMapping("/{id}")
	public ResponseEntity<Linea> getLineaId(@PathVariable("id") Long id) {
		try {
			Linea l = service.read(id).get();
			return new ResponseEntity<>(l, HttpStatus.CREATED);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Linea> delLinea(@PathVariable("id") Long id) {
		try {
			service.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@PutMapping("/{id}")
	public ResponseEntity<?> updateLinea(@PathVariable("id") Long id, @Valid @RequestBody Linea lin) {

		Optional<Linea> l = service.read(id);
		if (l.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} else {
			service.update(lin);
			return new ResponseEntity<>(HttpStatus.OK);

		}

	}
}